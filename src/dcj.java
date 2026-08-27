import javax.annotation.Nullable;

public class dcj extends czz {
   @Nullable
   private static dfq f;
   @Nullable
   private static dfq g;

   protected dcj(dfk.d $$0) {
      super(czz.b.b, $$0);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcx $$5 = $$0.c_($$1);
      if ($$5 instanceof deh) {
         a($$0, $$1, (deh)$$5);
      }
   }

   public static void a(cpx $$0, gw $$1, deh $$2) {
      if (!$$0.B) {
         dfl $$3 = $$2.q();
         boolean $$4 = $$3.a(csy.gG) || $$3.a(csy.gH);
         if ($$4 && $$1.v() >= $$0.H_() && $$0.ai() != bgx.a) {
            dfq.b $$5 = u().a($$0, $$1);
            if ($$5 != null) {
               byd $$6 = biw.bk.a($$0);
               if ($$6 != null) {
                  ctq.a($$0, $$5);
                  gw $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == hc.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aU = $$5.b().o() == hc.a.a ? 0.0F : 90.0F;
                  $$6.s();

                  for (akt $$8 : $$0.a(akt.class, $$6.cG().g(50.0))) {
                     al.n.a($$8, $$6);
                  }

                  $$0.b($$6);
                  ctq.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(cpx $$0, gw $$1, cjh $$2) {
      return $$2.a(cjk.ts) && $$1.v() >= $$0.H_() + 2 && $$0.ai() != bgx.a && !$$0.B ? v().a($$0, $$1) != null : false;
   }

   private static dfq u() {
      if (f == null) {
         f = dfr.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(apu.aE)).a('^', dfp.a(dfu.a(csy.gG).or(dfu.a(csy.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return f;
   }

   private static dfq v() {
      if (g == null) {
         g = dfr.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(apu.aE)).a('~', $$0 -> $$0.a().i()).b();
      }

      return g;
   }
}
