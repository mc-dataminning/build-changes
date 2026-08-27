public class fpq implements fpl<dcs> {
   private static final float a = 0.375F;
   private final ftm b;

   public fpq(fpm.a $$0) {
      this.b = $$0.d();
   }

   public void a(dcs $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      ha $$6 = $$0.q().c(csz.e);
      hn<ciy> $$7 = $$0.c();
      int $$8 = (int)$$0.p().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         ciy $$10 = $$7.get($$9);
         if ($$10 != ciy.b) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            ha $$11 = ha.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, civ.i, $$4, $$5, $$2, $$3, $$0.k(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
