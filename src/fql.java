public class fql implements fqg<ddd> {
   private static final float a = 0.375F;
   private final fuh b;

   public fql(fqh.a $$0) {
      this.b = $$0.d();
   }

   public void a(ddd $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      hc $$6 = $$0.q().c(ctk.e);
      hp<cjh> $$7 = $$0.c();
      int $$8 = (int)$$0.p().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         cjh $$10 = $$7.get($$9);
         if ($$10 != cjh.b) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            hc $$11 = hc.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cje.i, $$4, $$5, $$2, $$3, $$0.k(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
