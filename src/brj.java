import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public final class brj<E> {
   private static final int a = 64;
   private final int b;
   private final List<bri<E>> c;
   @Nullable
   private final brj.d<E> d;

   brj(List<? extends bri<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = brk.a($$0, bri::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new brj.c<>(this.c, this.b);
      } else {
         this.d = new brj.b<>(this.c);
      }
   }

   public static <E> brj<E> a() {
      return new brj<>(List.of());
   }

   public static <E> brj<E> a(E $$0) {
      return new brj<>(List.of(new bri<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> brj<E> a(bri<E>... $$0) {
      return new brj<>(List.of($$0));
   }

   public static <E> brj<E> a(List<bri<E>> $$0) {
      return new brj<>($$0);
   }

   public static <E> brj.a<E> b() {
      return new brj.a<>();
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public Optional<E> a(azh $$0) {
      if (this.d == null) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.b);
         return Optional.of(this.d.a($$1));
      }
   }

   public E b(azh $$0) {
      if (this.d == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int $$1 = $$0.a(this.b);
         return this.d.a($$1);
      }
   }

   public List<bri<E>> d() {
      return this.c;
   }

   public static <E> Codec<brj<E>> a(Codec<E> $$0) {
      return bri.a($$0).listOf().xmap(brj::a, brj::d);
   }

   public static <E> Codec<brj<E>> a(MapCodec<E> $$0) {
      return bri.a($$0).listOf().xmap(brj::a, brj::d);
   }

   public static <E> Codec<brj<E>> b(Codec<E> $$0) {
      return ayi.b(bri.a($$0).listOf()).xmap(brj::a, brj::d);
   }

   public static <E> Codec<brj<E>> b(MapCodec<E> $$0) {
      return ayi.b(bri.a($$0).listOf()).xmap(brj::a, brj::d);
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof brj<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<bri<E>> a = ImmutableList.builder();

      public brj.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public brj.a<E> a(E $$0, int $$1) {
         this.a.add(new bri<>($$0, $$1));
         return this;
      }

      public brj<E> a() {
         return new brj<>(this.a.build());
      }
   }

   static class b<E> implements brj.d<E> {
      private final bri<?>[] a;

      b(List<bri<E>> $$0) {
         this.a = $$0.toArray(bri[]::new);
      }

      @Override
      public E a(int $$0) {
         for (bri<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements brj.d<E> {
      private final Object[] a;

      c(List<bri<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (bri<E> $$3 : $$0) {
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
