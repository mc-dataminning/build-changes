import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record ec(List<ec.c> c) {
   private static final Codec<List<ec.c>> d = Codec.unboundedMap(Codec.STRING, ec.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new ec.c((String)$$0x.getKey(), (ec.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(ec.c::a, ec.c::b))
      );
   public static final Codec<ec> a = d.xmap(ec::new, ec::a);
   public static final zc<ByteBuf, ec> b = ec.c.a.a(za.a()).a(ec::new, ec::a);

   public <S extends duu<?, S>> boolean a(dut<?, S> $$0, S $$1) {
      for (ec.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dus $$0) {
      return this.a($$0.b().k(), $$0);
   }

   public boolean a(eqt $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dut<?, ?> $$0) {
      for (ec.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<ec.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<ec.c> a = ImmutableList.builder();

      private a() {
      }

      public static ec.a a() {
         return new ec.a();
      }

      public ec.a a(dvv<?> $$0, String $$1) {
         this.a.add(new ec.c($$0.f(), new ec.b($$1)));
         return this;
      }

      public ec.a a(dvv<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public ec.a a(dvv<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & bab> ec.a a(dvv<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<ec> b() {
         return Optional.of(new ec(this.a.build()));
      }
   }

   static record b(String e) implements ec.e {
      public static final Codec<ec.b> a = Codec.STRING.xmap(ec.b::new, ec.b::a);
      public static final zc<ByteBuf, ec.b> b = za.m.a(ec.b::new, ec.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(duu<?, ?> $$0, dvv<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, ec.e c) {
      public static final zc<ByteBuf, ec.c> a = zc.a(za.m, ec.c::a, ec.e.d, ec.c::b, ec.c::new);

      public <S extends duu<?, S>> boolean a(dut<?, S> $$0, S $$1) {
         dvv<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dut<?, ?> $$0) {
         dvv<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public ec.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements ec.e {
      public static final Codec<ec.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(ec.d::a), Codec.STRING.optionalFieldOf("max").forGetter(ec.d::b)).apply($$0, ec.d::new)
      );
      public static final zc<ByteBuf, ec.d> b = zc.a(za.a(za.m), ec.d::a, za.a(za.m), ec.d::b, ec.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(duu<?, ?> $$0, dvv<T> $$1) {
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
      Codec<ec.e> c = Codec.either(ec.b.a, ec.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof ec.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ec.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      zc<ByteBuf, ec.e> d = za.a(ec.b.b, ec.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof ec.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ec.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(duu<?, ?> var1, dvv<T> var2);
   }
}
