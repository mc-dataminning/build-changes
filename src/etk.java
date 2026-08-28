import java.util.Arrays;

public class etk {
   private etm[] a = new etm[128];
   private int b;

   public etm a(etm $$0) {
      if ($$0.d >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if (this.b == this.a.length) {
            etm[] $$1 = new etm[this.b << 1];
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

   public etm b() {
      return this.a[0];
   }

   public etm c() {
      etm $$0 = this.a[0];
      this.a[0] = this.a[--this.b];
      this.a[this.b] = null;
      if (this.b > 0) {
         this.b(0);
      }

      $$0.d = -1;
      return $$0;
   }

   public void b(etm $$0) {
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

   public void a(etm $$0, float $$1) {
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
      etm $$1 = this.a[$$0];
      float $$2 = $$1.g;

      while ($$0 > 0) {
         int $$3 = $$0 - 1 >> 1;
         etm $$4 = this.a[$$3];
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
      etm $$1 = this.a[$$0];
      float $$2 = $$1.g;

      while (true) {
         int $$3 = 1 + ($$0 << 1);
         int $$4 = $$3 + 1;
         if ($$3 >= this.b) {
            break;
         }

         etm $$5 = this.a[$$3];
         float $$6 = $$5.g;
         etm $$7;
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

   public etm[] f() {
      return Arrays.copyOf(this.a, this.b);
   }
}
