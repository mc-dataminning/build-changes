import javax.annotation.Nullable;

public class dbx extends czn {
   @Nullable
   private static dfe e;
   @Nullable
   private static dfe f;

   protected dbx(dey.d $$0) {
      super(czn.b.b, $$0);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, @Nullable biy $$3, cix $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcl $$5 = $$0.c_($$1);
      if ($$5 instanceof ddv) {
         a($$0, $$1, (ddv)$$5);
      }
   }

   public static void a(cpl $$0, gu $$1, ddv $$2) {
      if (!$$0.B) {
         dez $$3 = $$2.q();
         boolean $$4 = $$3.a(csm.gG) || $$3.a(csm.gH);
         if ($$4 && $$1.v() >= $$0.C_() && $$0.ai() != bgn.a) {
            dfe.b $$5 = u().a($$0, $$1);
            if ($$5 != null) {
               bxt $$6 = bim.bk.a($$0);
               if ($$6 != null) {
                  cte.a($$0, $$5);
                  gu $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == ha.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == ha.a.a ? 0.0F : 90.0F;
                  $$6.p();

                  for (akl $$8 : $$0.a(akl.class, $$6.cG().g(50.0))) {
                     ai.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  cte.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cpl $$0, gu $$1, cix $$2) {
      return $$2.a(cja.ts) && $$1.v() >= $$0.C_() + 2 && $$0.ai() != bgn.a && !$$0.B ? v().a($$0, $$1) != null : false;
   }

   private static dfe u() {
      if (e == null) {
         e = dff.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(apl.aE)).a('^', dfd.a(dfi.a(csm.gG).or(dfi.a(csm.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return e;
   }

   private static dfe v() {
      if (f == null) {
         f = dff.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(apl.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return f;
   }
}
