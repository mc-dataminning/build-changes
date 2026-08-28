import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public final class bsq<E> {
   private static final int a = 64;
   private final int b;
   private final List<bsp<E>> c;
   @Nullable
   private final bsq.d<E> d;

   bsq(List<? extends bsp<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = bsr.a($$0, bsp::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new bsq.c<>(this.c, this.b);
      } else {
         this.d = new bsq.b<>(this.c);
      }
   }

   public static <E> bsq<E> a() {
      return new bsq<>(List.of());
   }

   public static <E> bsq<E> a(E $$0) {
      return new bsq<>(List.of(new bsp<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> bsq<E> a(bsp<E>... $$0) {
      return new bsq<>(List.of($$0));
   }

   public static <E> bsq<E> a(List<bsp<E>> $$0) {
      return new bsq<>($$0);
   }

   public static <E> bsq.a<E> b() {
      return new bsq.a<>();
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public Optional<E> a(azv $$0) {
      if (this.d == null) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.b);
         return Optional.of(this.d.a($$1));
      }
   }

   public E b(azv $$0) {
      if (this.d == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int $$1 = $$0.a(this.b);
         return this.d.a($$1);
      }
   }

   public List<bsp<E>> d() {
      return this.c;
   }

   public static <E> Codec<bsq<E>> a(Codec<E> $$0) {
      return bsp.a($$0).listOf().xmap(bsq::a, bsq::d);
   }

   public static <E> Codec<bsq<E>> a(MapCodec<E> $$0) {
      return bsp.a($$0).listOf().xmap(bsq::a, bsq::d);
   }

   public static <E> Codec<bsq<E>> b(Codec<E> $$0) {
      return ayu.b(bsp.a($$0).listOf()).xmap(bsq::a, bsq::d);
   }

   public static <E> Codec<bsq<E>> b(MapCodec<E> $$0) {
      return ayu.b(bsp.a($$0).listOf()).xmap(bsq::a, bsq::d);
   }

   public boolean b(E $$0) {
      for (bsp<E> $$1 : this.c) {
         if ($$1.a().equals($$0)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bsq<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<bsp<E>> a = ImmutableList.builder();

      public bsq.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bsq.a<E> a(E $$0, int $$1) {
         this.a.add(new bsp<>($$0, $$1));
         return this;
      }

      public bsq<E> a() {
         return new bsq<>(this.a.build());
      }
   }

   static class b<E> implements bsq.d<E> {
      private final bsp<?>[] a;

      b(List<bsp<E>> $$0) {
         this.a = $$0.toArray(bsp[]::new);
      }

      @Override
      public E a(int $$0) {
         for (bsp<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements bsq.d<E> {
      private final Object[] a;

      c(List<bsp<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (bsp<E> $$3 : $$0) {
            int $$4 = $$3.b();
            Arrays.fill(this.a, $$2, $$2 + $$4, $$3.a());
            $$2 += $$4;
         }
      }

      @Override
      public E a(int $$0) {
         return (E)this.a[$$0];
      }
   }

   interface d<E> {
      E a(int var1);
   }
}
