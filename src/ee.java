import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record ee(List<ee.c> c) {
   private static final Codec<List<ee.c>> d = Codec.unboundedMap(Codec.STRING, ee.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new ee.c((String)$$0x.getKey(), (ee.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(ee.c::a, ee.c::b))
      );
   public static final Codec<ee> a = d.xmap(ee::new, ee::a);
   public static final zi<ByteBuf, ee> b = ee.c.a.a(zg.a()).a(ee::new, ee::a);

   public <S extends dxq<?, S>> boolean a(dxp<?, S> $$0, S $$1) {
      for (ee.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dxo $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(etq $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dxp<?, ?> $$0) {
      for (ee.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<ee.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<ee.c> a = ImmutableList.builder();

      private a() {
      }

      public static ee.a a() {
         return new ee.a();
      }

      public ee.a a(dyq<?> $$0, String $$1) {
         this.a.add(new ee.c($$0.f(), new ee.b($$1)));
         return this;
      }

      public ee.a a(dyq<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public ee.a a(dyq<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & baq> ee.a a(dyq<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<ee> b() {
         return Optional.of(new ee(this.a.build()));
      }
   }

   static record b(String e) implements ee.e {
      public static final Codec<ee.b> a = Codec.STRING.xmap(ee.b::new, ee.b::a);
      public static final zi<ByteBuf, ee.b> b = zg.o.a(ee.b::new, ee.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dxq<?, ?> $$0, dyq<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, ee.e c) {
      public static final zi<ByteBuf, ee.c> a = zi.a(zg.o, ee.c::a, ee.e.d, ee.c::b, ee.c::new);

      public <S extends dxq<?, S>> boolean a(dxp<?, S> $$0, S $$1) {
         dyq<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dxp<?, ?> $$0) {
         dyq<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public ee.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements ee.e {
      public static final Codec<ee.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(ee.d::a), Codec.STRING.optionalFieldOf("max").forGetter(ee.d::b)).apply($$0, ee.d::new)
      );
      public static final zi<ByteBuf, ee.d> b = zi.a(zg.a(zg.o), ee.d::a, zg.a(zg.o), ee.d::b, ee.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dxq<?, ?> $$0, dyq<T> $$1) {
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
      Codec<ee.e> c = Codec.either(ee.b.a, ee.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof ee.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ee.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      zi<ByteBuf, ee.e> d = zg.a(ee.b.b, ee.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof ee.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ee.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dxq<?, ?> var1, dyq<T> var2);
   }
}
