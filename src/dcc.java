import javax.annotation.Nullable;

public class dcc extends czs {
   @Nullable
   private static dfj f;
   @Nullable
   private static dfj g;

   protected dcc(dfd.d $$0) {
      super(czs.b.b, $$0);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcq $$5 = $$0.c_($$1);
      if ($$5 instanceof dea) {
         a($$0, $$1, (dea)$$5);
      }
   }

   public static void a(cpq $$0, gw $$1, dea $$2) {
      if (!$$0.B) {
         dfe $$3 = $$2.q();
         boolean $$4 = $$3.a(csr.gG) || $$3.a(csr.gH);
         if ($$4 && $$1.v() >= $$0.C_() && $$0.ai() != bgq.a) {
            dfj.b $$5 = u().a($$0, $$1);
            if ($$5 != null) {
               bxw $$6 = bip.bk.a($$0);
               if ($$6 != null) {
                  ctj.a($$0, $$5);
                  gw $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == hc.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == hc.a.a ? 0.0F : 90.0F;
                  $$6.p();

                  for (ako $$8 : $$0.a(ako.class, $$6.cG().g(50.0))) {
                     al.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  ctj.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cpq $$0, gw $$1, cja $$2) {
      return $$2.a(cjd.ts) && $$1.v() >= $$0.C_() + 2 && $$0.ai() != bgq.a && !$$0.B ? v().a($$0, $$1) != null : false;
   }

   private static dfj u() {
      if (f == null) {
         f = dfk.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(apo.aE)).a('^', dfi.a(dfn.a(csr.gG).or(dfn.a(csr.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return f;
   }

   private static dfj v() {
      if (g == null) {
         g = dfk.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(apo.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return g;
   }
}
