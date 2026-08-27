import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dwo {
   public static final int a = 90;
   static final aep b = new aep("igloo/top");
   private static final aep c = new aep("igloo/middle");
   private static final aep d = new aep("igloo/bottom");
   static final Map<aep, gv> e = ImmutableMap.of(b, new gv(3, 5, 5), c, new gv(1, 3, 1), d, new gv(3, 6, 7));
   static final Map<aep, gv> f = ImmutableMap.of(b, gv.b, c, new gv(2, -3, 4), d, new gv(0, -3, -2));

   public static void a(dyr $$0, gv $$1, cyw $$2, dvc $$3, art $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dwo.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dwo.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dwo.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dvh {
      public a(dyr $$0, aep $$1, gv $$2, cyw $$3, int $$4) {
         super(dvo.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dyr $$0, qs $$1) {
         super(dvo.I, $$1, $$0, $$1x -> a(cyw.valueOf($$1.l("Rot")), $$1x));
      }

      private static dym a(cyw $$0, aep $$1) {
         return new dym().a($$0).a(cxf.a).a(dwo.e.get($$1)).a(dxs.b);
      }

      private static gv a(aep $$0, gv $$1, int $$2) {
         return $$1.a(dwo.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dvn $$0, qs $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gv $$1, cpz $$2, art $$3, dup $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csl.a.n(), 3);
            dck $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dcr) {
               ((dcr)$$5).a(ecd.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
         aep $$7 = new aep(this.a);
         dym $$8 = a(this.c.d(), $$7);
         gv $$9 = dwo.f.get($$7);
         gv $$10 = this.d.a((ia)dyq.a($$8, new gv(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dkh.a.a, $$10.u(), $$10.w());
         gv $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dwo.b)) {
            gv $$13 = this.d.a((ia)dyq.a($$8, new gv(3, 0, 5)));
            dey $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(csl.cO)) {
               $$0.a($$13, csl.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
