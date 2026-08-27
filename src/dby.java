import javax.annotation.Nullable;

public class dby extends czo {
   @Nullable
   private static dff e;
   @Nullable
   private static dff f;

   protected dby(dez.d $$0) {
      super(czo.b.b, $$0);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcm $$5 = $$0.c_($$1);
      if ($$5 instanceof ddw) {
         a($$0, $$1, (ddw)$$5);
      }
   }

   public static void a(cpm $$0, gu $$1, ddw $$2) {
      if (!$$0.B) {
         dfa $$3 = $$2.q();
         boolean $$4 = $$3.a(csn.gG) || $$3.a(csn.gH);
         if ($$4 && $$1.v() >= $$0.C_() && $$0.ai() != bgn.a) {
            dff.b $$5 = u().a($$0, $$1);
            if ($$5 != null) {
               bxu $$6 = bim.bk.a($$0);
               if ($$6 != null) {
                  ctf.a($$0, $$5);
                  gu $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ha.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ha.a.a ? 0.0F : 90.0F;
                  $$6.p();

                  for (akl $$8 : $$0.a(akl.class, $$6.cG().g(50.0))) {
                     ai.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  ctf.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cpm $$0, gu $$1, ciy $$2) {
      return $$2.a(cjb.ts) && $$1.v() >= $$0.C_() + 2 && $$0.ai() != bgn.a && !$$0.B ? v().a($$0, $$1) != null : false;
   }

   private static dff u() {
      if (e == null) {
         e = dfg.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(apl.aE)).a('^', dfe.a(dfj.a(csn.gG).or(dfj.a(csn.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return e;
   }

   private static dff v() {
      if (f == null) {
         f = dfg.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(apl.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return f;
   }
}
