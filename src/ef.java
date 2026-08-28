import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record ef(List<ef.c> c) {
   private static final Codec<List<ef.c>> d = Codec.unboundedMap(Codec.STRING, ef.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new ef.c((String)$$0x.getKey(), (ef.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(ef.c::a, ef.c::b))
      );
   public static final Codec<ef> a = d.xmap(ef::new, ef::a);
   public static final ym<ByteBuf, ef> b = ef.c.a.a(yk.a()).a(ef::new, ef::a);

   public <S extends dwz<?, S>> boolean a(dwy<?, S> $$0, S $$1) {
      for (ef.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dwx $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(esz $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dwy<?, ?> $$0) {
      for (ef.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<ef.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<ef.c> a = ImmutableList.builder();

      private a() {
      }

      public static ef.a a() {
         return new ef.a();
      }

      public ef.a a(dxz<?> $$0, String $$1) {
         this.a.add(new ef.c($$0.f(), new ef.b($$1)));
         return this;
      }

      public ef.a a(dxz<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public ef.a a(dxz<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & azv> ef.a a(dxz<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<ef> b() {
         return Optional.of(new ef(this.a.build()));
      }
   }

   static record b(String e) implements ef.e {
      public static final Codec<ef.b> a = Codec.STRING.xmap(ef.b::new, ef.b::a);
      public static final ym<ByteBuf, ef.b> b = yk.o.a(ef.b::new, ef.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dwz<?, ?> $$0, dxz<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, ef.e c) {
      public static final ym<ByteBuf, ef.c> a = ym.a(yk.o, ef.c::a, ef.e.d, ef.c::b, ef.c::new);

      public <S extends dwz<?, S>> boolean a(dwy<?, S> $$0, S $$1) {
         dxz<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dwy<?, ?> $$0) {
         dxz<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public ef.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements ef.e {
      public static final Codec<ef.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(ef.d::a), Codec.STRING.optionalFieldOf("max").forGetter(ef.d::b)).apply($$0, ef.d::new)
      );
      public static final ym<ByteBuf, ef.d> b = ym.a(yk.a(yk.o), ef.d::a, yk.a(yk.o), ef.d::b, ef.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dwz<?, ?> $$0, dxz<T> $$1) {
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
      Codec<ef.e> c = Codec.either(ef.b.a, ef.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof ef.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ef.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      ym<ByteBuf, ef.e> d = yk.a(ef.b.b, ef.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof ef.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ef.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dwz<?, ?> var1, dxz<T> var2);
   }
}
