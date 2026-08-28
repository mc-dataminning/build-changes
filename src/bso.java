import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public final class bso<E> {
   private static final int a = 64;
   private final int b;
   private final List<bsn<E>> c;
   @Nullable
   private final bso.d<E> d;

   bso(List<? extends bsn<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = bsp.a($$0, bsn::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new bso.c<>(this.c, this.b);
      } else {
         this.d = new bso.b<>(this.c);
      }
   }

   public static <E> bso<E> a() {
      return new bso<>(List.of());
   }

   public static <E> bso<E> a(E $$0) {
      return new bso<>(List.of(new bsn<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> bso<E> a(bsn<E>... $$0) {
      return new bso<>(List.of($$0));
   }

   public static <E> bso<E> a(List<bsn<E>> $$0) {
      return new bso<>($$0);
   }

   public static <E> bso.a<E> b() {
      return new bso.a<>();
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

   public List<bsn<E>> d() {
      return this.c;
   }

   public static <E> Codec<bso<E>> a(Codec<E> $$0) {
      return bsn.a($$0).listOf().xmap(bso::a, bso::d);
   }

   public static <E> Codec<bso<E>> a(MapCodec<E> $$0) {
      return bsn.a($$0).listOf().xmap(bso::a, bso::d);
   }

   public static <E> Codec<bso<E>> b(Codec<E> $$0) {
      return ayu.b(bsn.a($$0).listOf()).xmap(bso::a, bso::d);
   }

   public static <E> Codec<bso<E>> b(MapCodec<E> $$0) {
      return ayu.b(bsn.a($$0).listOf()).xmap(bso::a, bso::d);
   }

   public boolean b(E $$0) {
      for (bsn<E> $$1 : this.c) {
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
         return !($$0 instanceof bso<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<bsn<E>> a = ImmutableList.builder();

      public bso.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bso.a<E> a(E $$0, int $$1) {
         this.a.add(new bsn<>($$0, $$1));
         return this;
      }

      public bso<E> a() {
         return new bso<>(this.a.build());
      }
   }

   static class b<E> implements bso.d<E> {
      private final bsn<?>[] a;

      b(List<bsn<E>> $$0) {
         this.a = $$0.toArray(bsn[]::new);
      }

      @Override
      public E a(int $$0) {
         for (bsn<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements bso.d<E> {
      private final Object[] a;

      c(List<bsn<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (bsn<E> $$3 : $$0) {
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
