import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public final class bsj<E> {
   private static final int a = 64;
   private final int b;
   private final List<bsi<E>> c;
   @Nullable
   private final bsj.d<E> d;

   bsj(List<? extends bsi<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = bsk.a($$0, bsi::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new bsj.c<>(this.c, this.b);
      } else {
         this.d = new bsj.b<>(this.c);
      }
   }

   public static <E> bsj<E> a() {
      return new bsj<>(List.of());
   }

   public static <E> bsj<E> a(E $$0) {
      return new bsj<>(List.of(new bsi<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> bsj<E> a(bsi<E>... $$0) {
      return new bsj<>(List.of($$0));
   }

   public static <E> bsj<E> a(List<bsi<E>> $$0) {
      return new bsj<>($$0);
   }

   public static <E> bsj.a<E> b() {
      return new bsj.a<>();
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public Optional<E> a(azt $$0) {
      if (this.d == null) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.b);
         return Optional.of(this.d.a($$1));
      }
   }

   public E b(azt $$0) {
      if (this.d == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int $$1 = $$0.a(this.b);
         return this.d.a($$1);
      }
   }

   public List<bsi<E>> d() {
      return this.c;
   }

   public static <E> Codec<bsj<E>> a(Codec<E> $$0) {
      return bsi.a($$0).listOf().xmap(bsj::a, bsj::d);
   }

   public static <E> Codec<bsj<E>> a(MapCodec<E> $$0) {
      return bsi.a($$0).listOf().xmap(bsj::a, bsj::d);
   }

   public static <E> Codec<bsj<E>> b(Codec<E> $$0) {
      return ays.b(bsi.a($$0).listOf()).xmap(bsj::a, bsj::d);
   }

   public static <E> Codec<bsj<E>> b(MapCodec<E> $$0) {
      return ays.b(bsi.a($$0).listOf()).xmap(bsj::a, bsj::d);
   }

   public boolean b(E $$0) {
      for (bsi<E> $$1 : this.c) {
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
         return !($$0 instanceof bsj<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<bsi<E>> a = ImmutableList.builder();

      public bsj.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bsj.a<E> a(E $$0, int $$1) {
         this.a.add(new bsi<>($$0, $$1));
         return this;
      }

      public bsj<E> a() {
         return new bsj<>(this.a.build());
      }
   }

   static class b<E> implements bsj.d<E> {
      private final bsi<?>[] a;

      b(List<bsi<E>> $$0) {
         this.a = $$0.toArray(bsi[]::new);
      }

      @Override
      public E a(int $$0) {
         for (bsi<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements bsj.d<E> {
      private final Object[] a;

      c(List<bsi<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (bsi<E> $$3 : $$0) {
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
