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

public final class btd<E> {
   private static final int a = 64;
   private final int b;
   private final List<btc<E>> c;
   @Nullable
   private final btd.d<E> d;

   btd(List<? extends btc<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = bte.a($$0, btc::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new btd.c<>(this.c, this.b);
      } else {
         this.d = new btd.b<>(this.c);
      }
   }

   public static <E> btd<E> a() {
      return new btd<>(List.of());
   }

   public static <E> btd<E> a(E $$0) {
      return new btd<>(List.of(new btc<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> btd<E> a(btc<E>... $$0) {
      return new btd<>(List.of($$0));
   }

   public static <E> btd<E> a(List<btc<E>> $$0) {
      return new btd<>($$0);
   }

   public static <E> btd.a<E> b() {
      return new btd.a<>();
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public <T> btd<T> a(Function<E, T> $$0) {
      return new btd(Lists.transform(this.c, $$1 -> $$1.a($$0)));
   }

   public Optional<E> a(azz $$0) {
      if (this.d == null) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.b);
         return Optional.of(this.d.a($$1));
      }
   }

   public E b(azz $$0) {
      if (this.d == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int $$1 = $$0.a(this.b);
         return this.d.a($$1);
      }
   }

   public List<btc<E>> d() {
      return this.c;
   }

   public static <E> Codec<btd<E>> a(Codec<E> $$0) {
      return btc.a($$0).listOf().xmap(btd::a, btd::d);
   }

   public static <E> Codec<btd<E>> a(MapCodec<E> $$0) {
      return btc.a($$0).listOf().xmap(btd::a, btd::d);
   }

   public static <E> Codec<btd<E>> b(Codec<E> $$0) {
      return ayy.b(btc.a($$0).listOf()).xmap(btd::a, btd::d);
   }

   public static <E> Codec<btd<E>> b(MapCodec<E> $$0) {
      return ayy.b(btc.a($$0).listOf()).xmap(btd::a, btd::d);
   }

   public boolean b(E $$0) {
      for (btc<E> $$1 : this.c) {
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
         return !($$0 instanceof btd<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<btc<E>> a = ImmutableList.builder();

      public btd.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public btd.a<E> a(E $$0, int $$1) {
         this.a.add(new btc<>($$0, $$1));
         return this;
      }

      public btd<E> a() {
         return new btd<>(this.a.build());
      }
   }

   static class b<E> implements btd.d<E> {
      private final btc<?>[] a;

      b(List<btc<E>> $$0) {
         this.a = $$0.toArray(btc[]::new);
      }

      @Override
      public E a(int $$0) {
         for (btc<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements btd.d<E> {
      private final Object[] a;

      c(List<btc<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (btc<E> $$3 : $$0) {
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
