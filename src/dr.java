import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dr(List<dr.c> c) {
   private static final Codec<List<dr.c>> d = Codec.unboundedMap(Codec.STRING, dr.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dr.c((String)$$0x.getKey(), (dr.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dr.c::a, dr.c::b))
      );
   public static final Codec<dr> a = d.xmap(dr::new, dr::a);
   public static final yw<ByteBuf, dr> b = dr.c.a.a(yu.a()).a(dr::new, dr::a);

   public <S extends eaq<?, S>> boolean a(eap<?, S> $$0, S $$1) {
      for (dr.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(eao $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(ewv $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(eap<?, ?> $$0) {
      for (dr.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dr.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dr.c> a = ImmutableList.builder();

      private a() {
      }

      public static dr.a a() {
         return new dr.a();
      }

      public dr.a a(ebr<?> $$0, String $$1) {
         this.a.add(new dr.c($$0.f(), new dr.b($$1)));
         return this;
      }

      public dr.a a(ebr<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dr.a a(ebr<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & bak> dr.a a(ebr<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dr> b() {
         return Optional.of(new dr(this.a.build()));
      }
   }

   static record b(String e) implements dr.e {
      public static final Codec<dr.b> a = Codec.STRING.xmap(dr.b::new, dr.b::a);
      public static final yw<ByteBuf, dr.b> b = yu.p.a(dr.b::new, dr.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(eaq<?, ?> $$0, ebr<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, dr.e c) {
      public static final yw<ByteBuf, dr.c> a = yw.a(yu.p, dr.c::a, dr.e.d, dr.c::b, dr.c::new);

      public <S extends eaq<?, S>> boolean a(eap<?, S> $$0, S $$1) {
         ebr<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(eap<?, ?> $$0) {
         ebr<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public dr.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dr.e {
      public static final Codec<dr.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(dr.d::a), Codec.STRING.optionalFieldOf("max").forGetter(dr.d::b)).apply($$0, dr.d::new)
      );
      public static final yw<ByteBuf, dr.d> b = yw.a(yu.a(yu.p), dr.d::a, yu.a(yu.p), dr.d::b, dr.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(eaq<?, ?> $$0, ebr<T> $$1) {
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
      Codec<dr.e> c = Codec.either(dr.b.a, dr.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof dr.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dr.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      yw<ByteBuf, dr.e> d = yu.a(dr.b.b, dr.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof dr.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dr.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(eaq<?, ?> var1, ebr<T> var2);
   }
}
