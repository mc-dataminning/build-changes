import java.util.Arrays;

public class fgn<T extends cau> extends fgg<T> {
   private static final int a = 8;
   private final fiw b;
   private final fiw[] f = new fiw[8];

   public fgn(fiw $$0) {
      this.b = $$0;
      Arrays.setAll(this.f, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "cube" + $$0;
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         int $$3 = 0;
         int $$4 = $$2;
         if ($$2 == 2) {
            $$3 = 24;
            $$4 = 10;
         } else if ($$2 == 3) {
            $$3 = 24;
            $$4 = 19;
         }

         $$1.a(a($$2), fjb.c().a($$3, $$4).a(-4.0F, (float)(16 + $$2), -4.0F, 8.0F, 1.0F, 8.0F), fiy.a);
      }

      $$1.a("inside_cube", fjb.c().a(0, 16).a(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F), fiy.a);
      return fjc.a($$0, 64, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      float $$4 = asy.i($$3, $$0.bS, $$0.e);
      if ($$4 < 0.0F) {
         $$4 = 0.0F;
      }

      for (int $$5 = 0; $$5 < this.f.length; $$5++) {
         this.f[$$5].c = (float)(-(4 - $$5)) * $$4 * 1.7F;
      }
   }

   @Override
   public fiw a() {
      return this.b;
   }
}
