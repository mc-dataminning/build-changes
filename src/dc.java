import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record dc(List<dc.c> c) {
   private static final Codec<List<dc.c>> d = Codec.unboundedMap(Codec.STRING, dc.e.c)
      .xmap(
         $$0 -> $$0.entrySet().stream().map($$0x -> new dc.c((String)$$0x.getKey(), (dc.e)$$0x.getValue())).toList(),
         $$0 -> $$0.stream().collect(Collectors.toMap(dc.c::a, dc.c::b))
      );
   public static final Codec<dc> a = d.xmap(dc::new, dc::a);
   public static final yg<ByteBuf, dc> b = dc.c.a.a(ye.a()).a(dc::new, dc::a);

   public <S extends dpk<?, S>> boolean a(dpj<?, S> $$0, S $$1) {
      for (dc.c $$2 : this.c) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dpi $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(elb $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public Optional<String> a(dpj<?, ?> $$0) {
      for (dc.c $$1 : this.c) {
         Optional<String> $$2 = $$1.a($$0);
         if ($$2.isPresent()) {
            return $$2;
         }
      }

      return Optional.empty();
   }

   public List<dc.c> a() {
      return this.c;
   }

   public static class a {
      private final Builder<dc.c> a = ImmutableList.builder();

      private a() {
      }

      public static dc.a a() {
         return new dc.a();
      }

      public dc.a a(dql<?> $$0, String $$1) {
         this.a.add(new dc.c($$0.f(), new dc.b($$1)));
         return this;
      }

      public dc.a a(dql<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public dc.a a(dql<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & ayg> dc.a a(dql<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public Optional<dc> b() {
         return Optional.of(new dc(this.a.build()));
      }
   }

   static record b(String e) implements dc.e {
      public static final Codec<dc.b> a = Codec.STRING.xmap(dc.b::new, dc.b::a);
      public static final yg<ByteBuf, dc.b> b = ye.k.a(dc.b::new, dc.b::a);

      @Override
      public <T extends Comparable<T>> boolean a(dpk<?, ?> $$0, dql<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.e);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      public String a() {
         return this.e;
      }
   }

   static record c(String b, dc.e c) {
      public static final yg<ByteBuf, dc.c> a = yg.a(ye.k, dc.c::a, dc.e.d, dc.c::b, dc.c::new);

      public <S extends dpk<?, S>> boolean a(dpj<?, S> $$0, S $$1) {
         dql<?> $$2 = $$0.a(this.b);
         return $$2 != null && this.c.a($$1, $$2);
      }

      public Optional<String> a(dpj<?, ?> $$0) {
         dql<?> $$1 = $$0.a(this.b);
         return $$1 != null ? Optional.empty() : Optional.of(this.b);
      }

      public String a() {
         return this.b;
      }

      public dc.e b() {
         return this.c;
      }
   }

   static record d(Optional<String> e, Optional<String> f) implements dc.e {
      public static final Codec<dc.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(Codec.STRING, "min").forGetter(dc.d::a), awu.a(Codec.STRING, "max").forGetter(dc.d::b)).apply($$0, dc.d::new)
      );
      public static final yg<ByteBuf, dc.d> b = yg.a(ye.a(ye.k), dc.d::a, ye.a(ye.k), dc.d::b, dc.d::new);

      @Override
      public <T extends Comparable<T>> boolean a(dpk<?, ?> $$0, dql<T> $$1) {
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
      Codec<dc.e> c = Codec.either(dc.b.a, dc.d.a).xmap($$0 -> (dc.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof dc.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dc.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });
      yg<ByteBuf, dc.e> d = ye.a(dc.b.b, dc.d.b).a($$0 -> (dc.e)$$0.map($$0x -> $$0x, $$0x -> $$0x), $$0 -> {
         if ($$0 instanceof dc.b $$1) {
            return Either.left($$1);
         } else if ($$0 instanceof dc.d $$2) {
            return Either.right($$2);
         } else {
            throw new UnsupportedOperationException();
         }
      });

      <T extends Comparable<T>> boolean a(dpk<?, ?> var1, dql<T> var2);
   }
}
