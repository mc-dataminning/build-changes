import javax.annotation.Nullable;

public class dch extends czx {
   @Nullable
   private static dfo f;
   @Nullable
   private static dfo g;

   protected dch(dfi.d $$0) {
      super(czx.b.b, $$0);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcv $$5 = $$0.c_($$1);
      if ($$5 instanceof def) {
         a($$0, $$1, (def)$$5);
      }
   }

   public static void a(cpv $$0, gw $$1, def $$2) {
      if (!$$0.B) {
         dfj $$3 = $$2.q();
         boolean $$4 = $$3.a(csw.gG) || $$3.a(csw.gH);
         if ($$4 && $$1.v() >= $$0.H_() && $$0.ai() != bgv.a) {
            dfo.b $$5 = u().a($$0, $$1);
            if ($$5 != null) {
               byb $$6 = biu.bk.a($$0);
               if ($$6 != null) {
                  cto.a($$0, $$5);
                  gw $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == hc.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == hc.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (aks $$8 : $$0.a(aks.class, $$6.cG().g(50.0))) {
                     al.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cto.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cpv $$0, gw $$1, cjf $$2) {
      return $$2.a(cji.ts) && $$1.v() >= $$0.H_() + 2 && $$0.ai() != bgv.a && !$$0.B ? v().a($$0, $$1) != null : false;
   }

   private static dfo u() {
      if (f == null) {
         f = dfp.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(apt.aE)).a('^', dfn.a(dfs.a(csw.gG).or(dfs.a(csw.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return f;
   }

   private static dfo v() {
      if (g == null) {
         g = dfp.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(apt.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return g;
   }
}
