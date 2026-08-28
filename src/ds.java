import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record ds(List<ds.c> c) {
   private static final Codec<List<ds.c>> d = Codec.unboundedMap(Codec.STRING, ds.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new ds.c((String)$$0x.getKey(), (ds.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(ds.c::a, ds.c::b))
      );
   public static final Codec<ds> a = d.xmap(ds::new, ds::a);
   public static final za<ByteBuf, ds> b = ds.c.a.a(yy.a()).a(ds::new, ds::a);

   public <S extends ebi<?, S>> boolean a(ebh<?, S> $$0, S $$1) {
      for (ds.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(ebg $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(exq $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(ebh<?, ?> $$0) {
      for (ds.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<ds.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<ds.c> a = ImmutableList.builder();

      private a() {
      }

      public static ds.a a() {
         return new ds.a();
      }

      public ds.a a(ecj<?> $$0, String $$1) {
         this.a.add(new ds.c($$0.f(), new ds.b($$1)));
         return this;
      }

      public ds.a a(ecj<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public ds.a a(ecj<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & bao> ds.a a(ecj<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<ds> b() {
         return Optional.of(new ds(this.a.build()));
      }
   }

   static record b(String e) implements ds.e {
      public static final Codec<ds.b> a = Codec.STRING.xmap(ds.b::new, ds.b::a);
      public static final za<ByteBuf, ds.b> b = yy.p.a(ds.b::new, ds.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(ebi<?, ?> $$0, ecj<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, ds.e c) {
      public static final za<ByteBuf, ds.c> a = za.a(yy.p, ds.c::a, ds.e.d, ds.c::b, ds.c::new);

      public <S extends ebi<?, S>> boolean a(ebh<?, S> $$0, S $$1) {
         ecj<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(ebh<?, ?> $$0) {
         ecj<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public ds.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements ds.e {
      public static final Codec<ds.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.optionalFieldOf("min").forGetter(ds.d::a), Codec.STRING.optionalFieldOf("max").forGetter(ds.d::b)).apply($$0, ds.d::new)
      );
      public static final za<ByteBuf, ds.d> b = za.a(yy.a(yy.p), ds.d::a, yy.a(yy.p), ds.d::b, ds.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(ebi<?, ?> $$0, ecj<T> $$1) {
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
      Codec<ds.e> c = Codec.either(ds.b.a, ds.d.a).xmap(Either::unwrap, $$0 -> {
         if ($$0 instanceof ds.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ds.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      za<ByteBuf, ds.e> d = yy.a(ds.b.b, ds.d.b).a(Either::unwrap, $$0 -> {
         if ($$0 instanceof ds.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof ds.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(ebi<?, ?> var1, ecj<T> var2);
   }
}
