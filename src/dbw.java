import javax.annotation.Nullable;

public class dbw extends czm {
   @Nullable
   private static dfd e;
   @Nullable
   private static dfd f;

   protected dbw(dex.d $$0) {
      super(czm.b.b, $$0);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dck $$5 = $$0.c_($$1);
      if ($$5 instanceof ddu) {
         a($$0, $$1, (ddu)$$5);
      }
   }

   public static void a(cpk $$0, gv $$1, ddu $$2) {
      if (!$$0.B) {
         dey $$3 = $$2.q();
         boolean $$4 = $$3.a(csl.gG) || $$3.a(csl.gH);
         if ($$4 && $$1.v() >= $$0.C_() && $$0.ai() != bgl.a) {
            dfd.b $$5 = u().a($$0, $$1);
            if ($$5 != null) {
               bxs $$6 = bik.bk.a($$0);
               if ($$6 != null) {
                  ctd.a($$0, $$5);
                  gv $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == hb.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == hb.a.a ? 0.0F : 90.0F;
                  $$6.p();

                  for (akj $$8 : $$0.a(akj.class, $$6.cG().g(50.0))) {
                     ai.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  ctd.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cpk $$0, gv $$1, ciw $$2) {
      return $$2.a(ciz.ts) && $$1.v() >= $$0.C_() + 2 && $$0.ai() != bgl.a && !$$0.B ? v().a($$0, $$1) != null : false;
   }

   private static dfd u() {
      if (e == null) {
         e = dfe.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(apj.aE)).a('^', dfc.a(dfh.a(csl.gG).or(dfh.a(csl.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return e;
   }

   private static dfd v() {
      if (f == null) {
         f = dfe.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(apj.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return f;
   }
}
