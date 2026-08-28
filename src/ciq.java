import java.util.Arrays;

public class ciq {
   public static final int a = 64;
   private static final int b = 63;
   private final ciq.a[] c = new ciq.a[64];
   private int d = -1;

   public ciq() {
      Arrays.fill(this.c, new ciq.a(0.0, 0.0F));
   }

   public void a(ciq $$0) {
      System.arraycopy($$0.c, 0, this.c, 0, 64);
      this.d = $$0.d;
   }

   public void a(double $$0, float $$1) {
      ciq.a $$2 = new ciq.a($$0, $$1);
      if (this.d < 0) {
         Arrays.fill(this.c, $$2);
      }

      if (++this.d == 64) {
         this.d = 0;
      }

      this.c[this.d] = $$2;
   }

   public ciq.a a(int $$0) {
      return this.c[this.d - $$0 & 63];
   }

   public ciq.a a(int $$0, float $$1) {
      ciq.a $$2 = this.a($$0);
      ciq.a $$3 = this.a($$0 + 1);
      return new ciq.a(azc.d((double)$$1, $$3.a, $$2.a), azc.i($$1, $$3.b, $$2.b));
   }

   public static record a(double a, float b) {
   }
}
