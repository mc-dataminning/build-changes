import java.util.Arrays;

public class ckn {
   public static final int a = 64;
   private static final int b = 63;
   private final ckn.a[] c = new ckn.a[64];
   private int d = -1;

   public ckn() {
      Arrays.fill(this.c, new ckn.a(0.0, 0.0F));
   }

   public void a(ckn $$0) {
      System.arraycopy($$0.c, 0, this.c, 0, 64);
      this.d = $$0.d;
   }

   public void a(double $$0, float $$1) {
      ckn.a $$2 = new ckn.a($$0, $$1);
      if (this.d < 0) {
         Arrays.fill(this.c, $$2);
      }

      if (++this.d == 64) {
         this.d = 0;
      }

      this.c[this.d] = $$2;
   }

   public ckn.a a(int $$0) {
      return this.c[this.d - $$0 & 63];
   }

   public ckn.a a(int $$0, float $$1) {
      ckn.a $$2 = this.a($$0);
      ckn.a $$3 = this.a($$0 + 1);
      return new ckn.a(bae.d((double)$$1, $$3.a, $$2.a), bae.i($$1, $$3.b, $$2.b));
   }

   public static record a(double a, float b) {
   }
}
