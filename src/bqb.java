import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public final class bqb {
   private static final int b = -1;
   private static final Object c = new Object() {
      @Override
      public String toString() {
         return "frame";
      }
   };
   private static final int d = 2;
   private Object[] e = new Object[128];
   private int f = 0;
   private int g = 0;

   public bqb() {
      this.e[0] = c;
      this.e[1] = null;
   }

   private int c(bpr<?> $$0) {
      for (int $$1 = this.f; $$1 > this.g; $$1 -= 2) {
         Object $$2 = this.e[$$1];

         assert $$2 instanceof bpr;

         if ($$2 == $$0) {
            return $$1 + 1;
         }
      }

      return -1;
   }

   public int a(bpr<?>... $$0) {
      for (int $$1 = this.f; $$1 > this.g; $$1 -= 2) {
         Object $$2 = this.e[$$1];

         assert $$2 instanceof bpr;

         for (bpr<?> $$3 : $$0) {
            if ($$3 == $$2) {
               return $$1 + 1;
            }
         }
      }

      return -1;
   }

   private void a(int $$0) {
      int $$1 = this.e.length;
      int $$2 = this.f + 1;
      int $$3 = $$2 + $$0 * 2;
      if ($$3 >= $$1) {
         int $$4 = ag.a($$1, $$3 + 1);
         Object[] $$5 = new Object[$$4];
         System.arraycopy(this.e, 0, $$5, 0, $$1);
         this.e = $$5;
      }

      assert this.i();
   }

   private void h() {
      this.f += 2;
      this.e[this.f] = c;
      this.e[this.f + 1] = this.g;
      this.g = this.f;
   }

   public void a() {
      this.a(1);
      this.h();

      assert this.i();
   }

   private int b(int $$0) {
      return (Integer)this.e[$$0 + 1];
   }

   public void b() {
      assert this.g != 0;

      this.f = this.g - 2;
      this.g = this.b(this.g);

      assert this.i();
   }

   public void c() {
      int $$0 = this.g;
      int $$1 = (this.f - this.g) / 2;
      this.a($$1 + 1);
      this.h();
      int $$2 = $$0 + 2;
      int $$3 = this.f;

      for (int $$4 = 0; $$4 < $$1; $$4++) {
         $$3 += 2;
         Object $$5 = this.e[$$2];

         assert $$5 != null;

         this.e[$$3] = $$5;
         this.e[$$3 + 1] = null;
         $$2 += 2;
      }

      this.f = $$3;

      assert this.i();
   }

   public void d() {
      for (int $$0 = this.f; $$0 > this.g; $$0 -= 2) {
         assert this.e[$$0] instanceof bpr;

         this.e[$$0 + 1] = null;
      }

      assert this.i();
   }

   public void e() {
      int $$0 = this.b(this.g);
      int $$1 = $$0;
      int $$2 = this.g;

      while ($$2 < this.f) {
         $$1 += 2;
         $$2 += 2;
         Object $$3 = this.e[$$2];

         assert $$3 instanceof bpr;

         Object $$4 = this.e[$$2 + 1];
         Object $$5 = this.e[$$1];
         if ($$5 != $$3) {
            this.e[$$1] = $$3;
            this.e[$$1 + 1] = $$4;
         } else if ($$4 != null) {
            this.e[$$1 + 1] = $$4;
         }
      }

      this.f = $$1;
      this.g = $$0;

      assert this.i();
   }

   public <T> void a(bpr<T> $$0, @Nullable T $$1) {
      int $$2 = this.c($$0);
      if ($$2 != -1) {
         this.e[$$2] = $$1;
      } else {
         this.a(1);
         this.f += 2;
         this.e[this.f] = $$0;
         this.e[this.f + 1] = $$1;
      }

      assert this.i();
   }

   @Nullable
   public <T> T a(bpr<T> $$0) {
      int $$1 = this.c($$0);
      return (T)($$1 != -1 ? this.e[$$1] : null);
   }

   public <T> T b(bpr<T> $$0) {
      int $$1 = this.c($$0);
      if ($$1 == -1) {
         throw new IllegalArgumentException("No value for atom " + $$0);
      } else {
         return (T)this.e[$$1];
      }
   }

   public <T> T b(bpr<T> $$0, T $$1) {
      int $$2 = this.c($$0);
      return (T)($$2 != -1 ? this.e[$$2] : $$1);
   }

   @Nullable
   @SafeVarargs
   public final <T> T b(bpr<? extends T>... $$0) {
      int $$1 = this.a($$0);
      return (T)($$1 != -1 ? this.e[$$1] : null);
   }

   @SafeVarargs
   public final <T> T c(bpr<? extends T>... $$0) {
      int $$1 = this.a($$0);
      if ($$1 == -1) {
         throw new IllegalArgumentException("No value for atoms " + Arrays.toString((Object[])$$0));
      } else {
         return (T)this.e[$$1];
      }
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      boolean $$1 = true;

      for (int $$2 = 0; $$2 <= this.f; $$2 += 2) {
         Object $$3 = this.e[$$2];
         Object $$4 = this.e[$$2 + 1];
         if ($$3 == c) {
            $$0.append('|');
            $$1 = true;
         } else {
            if (!$$1) {
               $$0.append(',');
            }

            $$1 = false;
            $$0.append($$3).append(':').append($$4);
         }
      }

      return $$0.toString();
   }

   @VisibleForTesting
   public Map<bpr<?>, ?> f() {
      HashMap<bpr<?>, Object> $$0 = new HashMap<>();

      for (int $$1 = this.f; $$1 > this.g; $$1 -= 2) {
         Object $$2 = this.e[$$1];
         Object $$3 = this.e[$$1 + 1];
         $$0.put((bpr<?>)$$2, $$3);
      }

      return $$0;
   }

   public boolean g() {
      for (int $$0 = this.f; $$0 > 0; $$0--) {
         if (this.e[$$0] == c) {
            return false;
         }
      }

      if (this.e[0] != c) {
         throw new IllegalStateException("Corrupted stack");
      } else {
         return true;
      }
   }

   private boolean i() {
      assert this.g >= 0;

      assert this.f >= this.g;

      for (int $$0 = 0; $$0 <= this.f; $$0 += 2) {
         Object $$1 = this.e[$$0];
         if ($$1 != c && !($$1 instanceof bpr)) {
            return false;
         }
      }

      for (int $$2 = this.g; $$2 != 0; $$2 = this.b($$2)) {
         Object $$3 = this.e[$$2];
         if ($$3 != c) {
            return false;
         }
      }

      return true;
   }
}
