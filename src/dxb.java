import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dxb {
   public static final int a = 90;
   static final aey b = new aey("igloo/top");
   private static final aey c = new aey("igloo/middle");
   private static final aey d = new aey("igloo/bottom");
   static final Map<aey, gw> e = ImmutableMap.of(b, new gw(3, 5, 5), c, new gw(1, 3, 1), d, new gw(3, 6, 7));
   static final Map<aey, gw> f = ImmutableMap.of(b, gw.b, c, new gw(2, -3, 4), d, new gw(0, -3, -2));

   public static void a(dze $$0, gw $$1, czj $$2, dvp $$3, ase $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dxb.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dxb.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dxb.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dvu {
      public a(dze $$0, aey $$1, gw $$2, czj $$3, int $$4) {
         super(dwb.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dze $$0, qy $$1) {
         super(dwb.I, $$1, $$0, $$1x -> a(czj.valueOf($$1.l("Rot")), $$1x));
      }

      private static dyz a(czj $$0, aey $$1) {
         return new dyz().a($$0).a(cxs.a).a(dxb.e.get($$1)).a(dyf.b);
      }

      private static gw a(aey $$0, gw $$1, int $$2) {
         return $$1.a(dxb.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqm $$2, ase $$3, dvc $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csy.a.n(), 3);
            dcx $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dde) {
               ((dde)$$5).a(ecq.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         aey $$7 = new aey(this.a);
         dyz $$8 = a(this.c.d(), $$7);
         gw $$9 = dxb.f.get($$7);
         gw $$10 = this.d.a((ib)dzd.a($$8, new gw(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dku.a.a, $$10.u(), $$10.w());
         gw $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dxb.b)) {
            gw $$13 = this.d.a((ib)dzd.a($$8, new gw(3, 0, 5)));
            dfl $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(csy.cO)) {
               $$0.a($$13, csy.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
