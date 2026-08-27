public class fsm implements fsh<dex> {
   private static final float a = 0.375F;
   private final fwi b;

   public fsm(fsi.a $$0) {
      this.b = $$0.d();
   }

   public void a(dex $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      hx $$6 = $$0.q().c(cvh.f);
      il<clb> $$7 = $$0.c();
      int $$8 = (int)$$0.p().a();

      for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
         clb $$10 = $$7.get($$9);
         if ($$10 != clb.b) {
            $$2.a();
            $$2.a(0.5F, 0.44921875F, 0.5F);
            hx $$11 = hx.b(($$9 + $$6.e()) % 4);
            float $$12 = -$$11.p();
            $$2.a(a.d.rotationDegrees($$12));
            $$2.a(a.b.rotationDegrees(90.0F));
            $$2.a(-0.3125F, -0.3125F, 0.0F);
            $$2.b(0.375F, 0.375F, 0.375F);
            this.b.a($$10, cky.i, $$4, $$5, $$2, $$3, $$0.k(), $$8 + $$9);
            $$2.b();
         }
      }
   }
}
