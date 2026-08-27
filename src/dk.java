import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dk(List<dk.c> c) {
   private static final Codec<List<dk.c>> d = Codec.unboundedMap(Codec.STRING, dk.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dk.c((String)$$0x.getKey(), (dk.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dk.c::a, dk.c::b))
      );
   public static final Codec<dk> a = d.xmap(dk::new, dk::a);
   public static final ys<ByteBuf, dk> b = dk.c.a.a(yq.a()).a(dk::new, dk::a);

   public <S extends dqj<?, S>> boolean a(dqi<?, S> $$0, S $$1) {
      for (dk.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dqh $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(ema $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dqi<?, ?> $$0) {
      for (dk.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dk.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dk.c> a = ImmutableList.builder();

      private a() {
      }

      public static dk.a a() {
         return new dk.a();
      }

      public dk.a a(drk<?> $$0, String $$1) {
         this.a.add(new dk.c($$0.f(), new dk.b($$1)));
         return this;
      }

      public dk.a a(drk<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dk.a a(drk<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & ayt> dk.a a(drk<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dk> b() {
         return Optional.of(new dk(this.a.build()));
      }
   }

   static record b(String e) implements dk.e {
      public static final Codec<dk.b> a = Codec.STRING.xmap(dk.b::new, dk.b::a);
      public static final ys<ByteBuf, dk.b> b = yq.k.a(dk.b::new, dk.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dqj<?, ?> $$0, drk<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, dk.e c) {
      public static final ys<ByteBuf, dk.c> a = ys.a(yq.k, dk.c::a, dk.e.d, dk.c::b, dk.c::new);

      public <S extends dqj<?, S>> boolean a(dqi<?, S> $$0, S $$1) {
         drk<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dqi<?, ?> $$0) {
         drk<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public dk.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dk.e {
      public static final Codec<dk.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(Codec.STRING, "min").forGetter(dk.d::a), axh.a(Codec.STRING, "max").forGetter(dk.d::b)).apply($$0, dk.d::new)
      );
      public static final ys<ByteBuf, dk.d> b = ys.a(yq.a(yq.k), dk.d::a, yq.a(yq.k), dk.d::b, dk.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dqj<?, ?> $$0, drk<T> $$1) {
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
      Codec<dk.e> c = Codec.either(dk.b.a, dk.d.a).xmap($$0 -> (dk.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof dk.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dk.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      ys<ByteBuf, dk.e> d = yq.a(dk.b.b, dk.d.b).a($$0 -> (dk.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof dk.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dk.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dqj<?, ?> var1, drk<T> var2);
   }
}
