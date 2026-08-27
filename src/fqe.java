public class fqe implements fpz<dcw> {
   private static final float a = 0.375F;
   private final fua b;

   public fqe(fqa.a $$0) {
      this.b = $$0.d();
   }

   public void a(dcw $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      hc $$6 = $$0.q().c(ctd.e);
      hp<cja> $$7 = $$0.c();
      int $$8 = (int)$$0.p().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         cja $$10 = $$7.get($$9);
         if ($$10 != cja.b) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            hc $$11 = hc.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cix.i, $$4, $$5, $$2, $$3, $$0.k(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
