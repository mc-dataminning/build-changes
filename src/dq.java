import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dq(List<dq.c> c) {
   private static final Codec<List<dq.c>> d = Codec.unboundedMap(Codec.STRING, dq.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dq.c((String)$$0x.getKey(), (dq.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dq.c::a, dq.c::b))
      );
   public static final Codec<dq> a = d.xmap(dq::new, dq::a);
   public static final yw<ByteBuf, dq> b = dq.c.a.a(yu.a()).a(dq::new, dq::a);

   public <S extends eab<?, S>> boolean a(eaa<?, S> $$0, S $$1) {
      for (dq.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dzz $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(ewg $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(eaa<?, ?> $$0) {
      for (dq.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dq.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dq.c> a = ImmutableList.builder();

      private a() {
      }

      public static dq.a a() {
         return new dq.a();
      }

      public dq.a a(ebc<?> $$0, String $$1) {
         this.a.add(new dq.c($$0.f(), new dq.b($$1)));
         return this;
      }

      public dq.a a(ebc<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dq.a a(ebc<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & bak> dq.a a(ebc<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dq> b() {
         return Optional.of(new dq(this.a.build()));
      }
   }

   static record b(String e) implements dq.e {
      public static final Codec<dq.b> a = Codec.STRING.xmap(dq.b::new, dq.b::a);
      public static final yw<ByteBuf, dq.b> b = yu.o.a(dq.b::new, dq.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(eab<?, ?> $$0, ebc<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, dq.e c) {
      public static final yw<ByteBuf, dq.c> a = yw.a(yu.o, dq.c::a, dq.e.d, dq.c::b, dq.c::new);

      public <S extends eab<?, S>> boolean a(eaa<?, S> $$0, S $$1) {
         ebc<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(eaa<?, ?> $$0) {
         ebc<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public dq.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dq.e {
      public static final Codec<dq.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(dq.d::a), Codec.STRING.optionalFieldOf("max").forGetter(dq.d::b)).apply($$0, dq.d::new)
      );
      public static final yw<ByteBuf, dq.d> b = yw.a(yu.a(yu.o), dq.d::a, yu.a(yu.o), dq.d::b, dq.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(eab<?, ?> $$0, ebc<T> $$1) {
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
      Codec<dq.e> c = Codec.either(dq.b.a, dq.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dq.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dq.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      yw<ByteBuf, dq.e> d = yu.a(dq.b.b, dq.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof dq.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dq.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(eab<?, ?> var1, ebc<T> var2);
   }
}
