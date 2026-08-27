import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dj(List<dj.c> c) {
   private static final Codec<List<dj.c>> d = Codec.unboundedMap(Codec.STRING, dj.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dj.c((String)$$0x.getKey(), (dj.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dj.c::a, dj.c::b))
      );
   public static final Codec<dj> a = d.xmap(dj::new, dj::a);
   public static final yq<ByteBuf, dj> b = dj.c.a.a(yo.a()).a(dj::new, dj::a);

   public <S extends dqa<?, S>> boolean a(dpz<?, S> $$0, S $$1) {
      for (dj.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dpy $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(elr $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dpz<?, ?> $$0) {
      for (dj.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dj.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dj.c> a = ImmutableList.builder();

      private a() {
      }

      public static dj.a a() {
         return new dj.a();
      }

      public dj.a a(drb<?> $$0, String $$1) {
         this.a.add(new dj.c($$0.f(), new dj.b($$1)));
         return this;
      }

      public dj.a a(drb<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dj.a a(drb<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & ayq> dj.a a(drb<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dj> b() {
         return Optional.of(new dj(this.a.build()));
      }
   }

   static record b(String e) implements dj.e {
      public static final Codec<dj.b> a = Codec.STRING.xmap(dj.b::new, dj.b::a);
      public static final yq<ByteBuf, dj.b> b = yo.k.a(dj.b::new, dj.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dqa<?, ?> $$0, drb<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, dj.e c) {
      public static final yq<ByteBuf, dj.c> a = yq.a(yo.k, dj.c::a, dj.e.d, dj.c::b, dj.c::new);

      public <S extends dqa<?, S>> boolean a(dpz<?, S> $$0, S $$1) {
         drb<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dpz<?, ?> $$0) {
         drb<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public dj.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dj.e {
      public static final Codec<dj.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(Codec.STRING, "min").forGetter(dj.d::a), axe.a(Codec.STRING, "max").forGetter(dj.d::b)).apply($$0, dj.d::new)
      );
      public static final yq<ByteBuf, dj.d> b = yq.a(yo.a(yo.k), dj.d::a, yo.a(yo.k), dj.d::b, dj.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dqa<?, ?> $$0, drb<T> $$1) {
         T $$2 = $$0.c($$1);
         if (this.e.isPresent()) {
            Optional<T> $$3 = $$1.b(this.e.get());
            if ($$3.isEmpty() || $$2.compareTo($$3.get()) < 0) {
               return false;
            }
         }

         if (this.f.isPresent()) {
            Optional<T> $$4 = $$1.b(this.f.get());
            if ($$4.isEmpty() || $$2.compareTo($$4.get()) > 0) {
               return false;
            }
         }

         return true;
      }

      public Optional<String> a() {
         return this.e;
      }

      public Optional<String> b() {
         return this.f;
      }
   }

   interface e {
      Codec<dj.e> c = Codec.either(dj.b.a, dj.d.a).xmap($$0 -> (dj.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof dj.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dj.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      yq<ByteBuf, dj.e> d = yo.a(dj.b.b, dj.d.b).a($$0 -> (dj.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof dj.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dj.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dqa<?, ?> var1, drb<T> var2);
   }
}
