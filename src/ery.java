import java.util.Arrays;

public class ery {
   private esa[] a = new esa[128];
   private int b;

   public esa a(esa $$0) {
      if ($$0.d >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if (this.b == this.a.length) {
            esa[] $$1 = new esa[this.b << 1];
            System.arraycopy(this.a, 0, $$1, 0, this.b);
            this.a = $$1;
         }

         this.a[this.b] = $$0;
         $$0.d = this.b;
         this.a(this.b++);
         return $$0;
      }
   }

   public void a() {
      this.b = 0;
   }

   public esa b() {
      return this.a[0];
   }

   public esa c() {
      esa $$0 = this.a[0];
      this.a[0] = this.a[--this.b];
      this.a[this.b] = null;
      if (this.b > 0) {
         this.b(0);
      }

      $$0.d = -1;
      return $$0;
   }

   public void b(esa $$0) {
      this.a[$$0.d] = this.a[--this.b];
      this.a[this.b] = null;
      if (this.b > $$0.d) {
         if (this.a[$$0.d].g < $$0.g) {
            this.a($$0.d);
         } else {
            this.b($$0.d);
         }
      }

      $$0.d = -1;
   }

   public void a(esa $$0, float $$1) {
      float $$2 = $$0.g;
      $$0.g = $$1;
      if ($$1 < $$2) {
         this.a($$0.d);
      } else {
         this.b($$0.d);
      }
   }

   public int d() {
      return this.b;
   }

   private void a(int $$0) {
      esa $$1 = this.a[$$0];
      float $$2 = $$1.g;

      while ($$0 > 0) {
         int $$3 = $$0 - 1 >> 1;
         esa $$4 = this.a[$$3];
         if (!($$2 < $$4.g)) {
            break;
         }

         this.a[$$0] = $$4;
         $$4.d = $$0;
         $$0 = $$3;
      }

      this.a[$$0] = $$1;
      $$1.d = $$0;
   }

   private void b(int $$0) {
      esa $$1 = this.a[$$0];
      float $$2 = $$1.g;

      while (true) {
         int $$3 = 1 + ($$0 << 1);
         int $$4 = $$3 + 1;
         if ($$3 >= this.b) {
            break;
         }

         esa $$5 = this.a[$$3];
         float $$6 = $$5.g;
         esa $$7;
         float $$8;
         if ($$4 >= this.b) {
            $$7 = null;
            $$8 = Float.POSITIVE_INFINITY;
         } else {
            $$7 = this.a[$$4];
            $$8 = $$7.g;
         }

         if ($$6 < $$8) {
            if (!($$6 < $$2)) {
               break;
            }

            this.a[$$0] = $$5;
            $$5.d = $$0;
            $$0 = $$3;
         } else {
            if (!($$8 < $$2)) {
               break;
            }

            this.a[$$0] = $$7;
            $$7.d = $$0;
            $$0 = $$4;
         }
      }

      this.a[$$0] = $$1;
      $$1.d = $$0;
   }

   public boolean e() {
      return this.b == 0;
   }

   public esa[] f() {
      return Arrays.copyOf(this.a, this.b);
   }
}
