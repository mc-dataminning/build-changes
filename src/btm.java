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

public final class btm<E> {
   private static final int a = 64;
   private final int b;
   private final List<btl<E>> c;
   @Nullable
   private final btm.d<E> d;

   btm(List<? extends btl<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = btn.a($$0, btl::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new btm.c<>(this.c, this.b);
      } else {
         this.d = new btm.b<>(this.c);
      }
   }

   public static <E> btm<E> a() {
      return new btm<>(List.of());
   }

   public static <E> btm<E> a(E $$0) {
      return new btm<>(List.of(new btl<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> btm<E> a(btl<E>... $$0) {
      return new btm<>(List.of($$0));
   }

   public static <E> btm<E> a(List<btl<E>> $$0) {
      return new btm<>($$0);
   }

   public static <E> btm.a<E> b() {
      return new btm.a<>();
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public <T> btm<T> a(Function<E, T> $$0) {
      return new btm(Lists.transform(this.c, $$1 -> $$1.a($$0)));
   }

   public Optional<E> a(bai $$0) {
      if (this.d == null) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.b);
         return Optional.of(this.d.a($$1));
      }
   }

   public E b(bai $$0) {
      if (this.d == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int $$1 = $$0.a(this.b);
         return this.d.a($$1);
      }
   }

   public List<btl<E>> d() {
      return this.c;
   }

   public static <E> Codec<btm<E>> a(Codec<E> $$0) {
      return btl.a($$0).listOf().xmap(btm::a, btm::d);
   }

   public static <E> Codec<btm<E>> a(MapCodec<E> $$0) {
      return btl.a($$0).listOf().xmap(btm::a, btm::d);
   }

   public static <E> Codec<btm<E>> b(Codec<E> $$0) {
      return azg.b(btl.a($$0).listOf()).xmap(btm::a, btm::d);
   }

   public static <E> Codec<btm<E>> b(MapCodec<E> $$0) {
      return azg.b(btl.a($$0).listOf()).xmap(btm::a, btm::d);
   }

   public boolean b(E $$0) {
      for (btl<E> $$1 : this.c) {
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
         return !($$0 instanceof btm<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<btl<E>> a = ImmutableList.builder();

      public btm.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public btm.a<E> a(E $$0, int $$1) {
         this.a.add(new btl<>($$0, $$1));
         return this;
      }

      public btm<E> a() {
         return new btm<>(this.a.build());
      }
   }

   static class b<E> implements btm.d<E> {
      private final btl<?>[] a;

      b(List<btl<E>> $$0) {
         this.a = $$0.toArray(btl[]::new);
      }

      @Override
      public E a(int $$0) {
         for (btl<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements btm.d<E> {
      private final Object[] a;

      c(List<btl<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (btl<E> $$3 : $$0) {
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
