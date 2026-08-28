import java.util.Arrays;

public class civ {
   public static final int a = 64;
   private static final int b = 63;
   private final civ.a[] c = new civ.a[64];
   private int d = -1;

   public civ() {
      Arrays.fill(this.c, new civ.a(0.0, 0.0F));
   }

   public void a(civ $$0) {
      System.arraycopy($$0.c, 0, this.c, 0, 64);
      this.d = $$0.d;
   }

   public void a(double $$0, float $$1) {
      civ.a $$2 = new civ.a($$0, $$1);
      if (this.d < 0) {
         Arrays.fill(this.c, $$2);
      }

      if (++this.d == 64) {
         this.d = 0;
      }

      this.c[this.d] = $$2;
   }

   public civ.a a(int $$0) {
      return this.c[this.d - $$0 & 63];
   }

   public civ.a a(int $$0, float $$1) {
      civ.a $$2 = this.a($$0);
      civ.a $$3 = this.a($$0 + 1);
      return new civ.a(azd.d((double)$$1, $$3.a, $$2.a), azd.i($$1, $$3.b, $$2.b));
   }

   public static record a(double a, float b) {
   }
}
