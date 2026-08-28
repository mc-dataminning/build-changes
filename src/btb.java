import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class btb<E> {
   private static final int a = 64;
   private final int b;
   private final List<bta<E>> c;
   @Nullable
   private final btb.d<E> d;

   btb(List<? extends bta<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = btc.a($$0, bta::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new btb.c<>(this.c, this.b);
      } else {
         this.d = new btb.b<>(this.c);
      }
   }

   public static <E> btb<E> a() {
      return new btb<>(List.of());
   }

   public static <E> btb<E> a(E $$0) {
      return new btb<>(List.of(new bta<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> btb<E> a(bta<E>... $$0) {
      return new btb<>(List.of($$0));
   }

   public static <E> btb<E> a(List<bta<E>> $$0) {
      return new btb<>($$0);
   }

   public static <E> btb.a<E> b() {
      return new btb.a<>();
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public <T> btb<T> a(Function<E, T> $$0) {
      return new btb(Lists.transform(this.c, $$1 -> $$1.a($$0)));
   }

   public Optional<E> a(azx $$0) {
      if (this.d == null) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.b);
         return Optional.of(this.d.a($$1));
      }
   }

   public E b(azx $$0) {
      if (this.d == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int $$1 = $$0.a(this.b);
         return this.d.a($$1);
      }
   }

   public List<bta<E>> d() {
      return this.c;
   }

   public static <E> Codec<btb<E>> a(Codec<E> $$0) {
      return bta.a($$0).listOf().xmap(btb::a, btb::d);
   }

   public static <E> Codec<btb<E>> a(MapCodec<E> $$0) {
      return bta.a($$0).listOf().xmap(btb::a, btb::d);
   }

   public static <E> Codec<btb<E>> b(Codec<E> $$0) {
      return ayw.b(bta.a($$0).listOf()).xmap(btb::a, btb::d);
   }

   public static <E> Codec<btb<E>> b(MapCodec<E> $$0) {
      return ayw.b(bta.a($$0).listOf()).xmap(btb::a, btb::d);
   }

   public boolean b(E $$0) {
      for (bta<E> $$1 : this.c) {
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
         return !($$0 instanceof btb<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<bta<E>> a = ImmutableList.builder();

      public btb.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public btb.a<E> a(E $$0, int $$1) {
         this.a.add(new bta<>($$0, $$1));
         return this;
      }

      public btb<E> a() {
         return new btb<>(this.a.build());
      }
   }

   static class b<E> implements btb.d<E> {
      private final bta<?>[] a;

      b(List<bta<E>> $$0) {
         this.a = $$0.toArray(bta[]::new);
      }

      @Override
      public E a(int $$0) {
         for (bta<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements btb.d<E> {
      private final Object[] a;

      c(List<bta<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (bta<E> $$3 : $$0) {
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
