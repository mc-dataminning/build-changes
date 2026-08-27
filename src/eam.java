import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eam {
   public static final int a = 90;
   static final agt b = new agt("igloo/top");
   private static final agt c = new agt("igloo/middle");
   private static final agt d = new agt("igloo/bottom");
   static final Map<agt, hv> e = ImmutableMap.of(b, new hv(3, 5, 5), c, new hv(1, 3, 1), d, new hv(3, 6, 7));
   static final Map<agt, hv> f = ImmutableMap.of(b, hv.b, c, new hv(2, -3, 4), d, new hv(0, -3, -2));

   public static void a(ecp $$0, hv $$1, dcl $$2, dyt $$3, auf $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eam.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eam.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eam.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dyy {
      public a(ecp $$0, agt $$1, hv $$2, dcl $$3, int $$4) {
         super(dzf.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ecp $$0, sj $$1) {
         super(dzf.I, $$1, $$0, $$1x -> a(dcl.valueOf($$1.l("Rot")), $$1x));
      }

      private static eck a(dcl $$0, agt $$1) {
         return new eck().a($$0).a(dav.a).a(eam.e.get($$1)).a(ebq.b);
      }

      private static hv a(agt $$0, hv $$1, int $$2) {
         return $$1.a(eam.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hv $$1, ctn $$2, auf $$3, dyg $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cwb.a.o(), 3);
            dgd $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dgk) {
               ((dgk)$$5).a(egc.C, $$3.g());
            }
         }
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         agt $$7 = new agt(this.a);
         eck $$8 = a(this.c.d(), $$7);
         hv $$9 = eam.f.get($$7);
         hv $$10 = this.d.a((iz)eco.a($$8, new hv(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dny.a.a, $$10.u(), $$10.w());
         hv $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eam.b)) {
            hv $$13 = this.d.a((iz)eco.a($$8, new hv(3, 0, 5)));
            dip $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cwb.cO)) {
               $$0.a($$13, cwb.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
