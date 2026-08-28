import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public final class bsb<E> {
   private static final int a = 64;
   private final int b;
   private final List<bsa<E>> c;
   @Nullable
   private final bsb.d<E> d;

   bsb(List<? extends bsa<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = bsc.a($$0, bsa::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new bsb.c<>(this.c, this.b);
      } else {
         this.d = new bsb.b<>(this.c);
      }
   }

   public static <E> bsb<E> a() {
      return new bsb<>(List.of());
   }

   public static <E> bsb<E> a(E $$0) {
      return new bsb<>(List.of(new bsa<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> bsb<E> a(bsa<E>... $$0) {
      return new bsb<>(List.of($$0));
   }

   public static <E> bsb<E> a(List<bsa<E>> $$0) {
      return new bsb<>($$0);
   }

   public static <E> bsb.a<E> b() {
      return new bsb.a<>();
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public Optional<E> a(azs $$0) {
      if (this.d == null) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.b);
         return Optional.of(this.d.a($$1));
      }
   }

   public E b(azs $$0) {
      if (this.d == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int $$1 = $$0.a(this.b);
         return this.d.a($$1);
      }
   }

   public List<bsa<E>> d() {
      return this.c;
   }

   public static <E> Codec<bsb<E>> a(Codec<E> $$0) {
      return bsa.a($$0).listOf().xmap(bsb::a, bsb::d);
   }

   public static <E> Codec<bsb<E>> a(MapCodec<E> $$0) {
      return bsa.a($$0).listOf().xmap(bsb::a, bsb::d);
   }

   public static <E> Codec<bsb<E>> b(Codec<E> $$0) {
      return ays.b(bsa.a($$0).listOf()).xmap(bsb::a, bsb::d);
   }

   public static <E> Codec<bsb<E>> b(MapCodec<E> $$0) {
      return ays.b(bsa.a($$0).listOf()).xmap(bsb::a, bsb::d);
   }

   public boolean b(E $$0) {
      for (bsa<E> $$1 : this.c) {
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
         return !($$0 instanceof bsb<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<bsa<E>> a = ImmutableList.builder();

      public bsb.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bsb.a<E> a(E $$0, int $$1) {
         this.a.add(new bsa<>($$0, $$1));
         return this;
      }

      public bsb<E> a() {
         return new bsb<>(this.a.build());
      }
   }

   static class b<E> implements bsb.d<E> {
      private final bsa<?>[] a;

      b(List<bsa<E>> $$0) {
         this.a = $$0.toArray(bsa[]::new);
      }

      @Override
      public E a(int $$0) {
         for (bsa<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements bsb.d<E> {
      private final Object[] a;

      c(List<bsa<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (bsa<E> $$3 : $$0) {
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
