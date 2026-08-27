import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dwz {
   public static final int a = 90;
   static final aex b = new aex("igloo/top");
   private static final aex c = new aex("igloo/middle");
   private static final aex d = new aex("igloo/bottom");
   static final Map<aex, gw> e = ImmutableMap.of(b, new gw(3, 5, 5), c, new gw(1, 3, 1), d, new gw(3, 6, 7));
   static final Map<aex, gw> f = ImmutableMap.of(b, gw.b, c, new gw(2, -3, 4), d, new gw(0, -3, -2));

   public static void a(dzc $$0, gw $$1, czh $$2, dvn $$3, asc $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dwz.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dwz.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dwz.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dvs {
      public a(dzc $$0, aex $$1, gw $$2, czh $$3, int $$4) {
         super(dvz.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dzc $$0, qy $$1) {
         super(dvz.I, $$1, $$0, $$1x -> a(czh.valueOf($$1.l("Rot")), $$1x));
      }

      private static dyx a(czh $$0, aex $$1) {
         return new dyx().a($$0).a(cxq.a).a(dwz.e.get($$1)).a(dyd.b);
      }

      private static gw a(aex $$0, gw $$1, int $$2) {
         return $$1.a(dwz.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dvy $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqk $$2, asc $$3, dva $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csw.a.n(), 3);
            dcv $$5 = $$2.c_($$1.d());
            if ($$5 instanceof ddc) {
               ((ddc)$$5).a(eco.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, gw $$6) {
         aex $$7 = new aex(this.a);
         dyx $$8 = a(this.c.d(), $$7);
         gw $$9 = dwz.f.get($$7);
         gw $$10 = this.d.a((ib)dzb.a($$8, new gw(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dks.a.a, $$10.u(), $$10.w());
         gw $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dwz.b)) {
            gw $$13 = this.d.a((ib)dzb.a($$8, new gw(3, 0, 5)));
            dfj $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(csw.cO)) {
               $$0.a($$13, csw.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
