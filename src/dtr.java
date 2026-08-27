import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dtr {
   public static final int a = 90;
   static final acq b = new acq("igloo/top");
   private static final acq c = new acq("igloo/middle");
   private static final acq d = new acq("igloo/bottom");
   static final Map<acq, gu> e = ImmutableMap.of(b, new gu(3, 5, 5), c, new gu(1, 3, 1), d, new gu(3, 6, 7));
   static final Map<acq, gu> f = ImmutableMap.of(b, gu.b, c, new gu(2, -3, 4), d, new gu(0, -3, -2));

   public static void a(dvu $$0, gu $$1, cvz $$2, dsf $$3, apf $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dtr.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dtr.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dtr.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dsk {
      public a(dvu $$0, acq $$1, gu $$2, cvz $$3, int $$4) {
         super(dsr.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dvu $$0, qr $$1) {
         super(dsr.I, $$1, $$0, $$1x -> a(cvz.valueOf($$1.l("Rot")), $$1x));
      }

      private static dvp a(cvz $$0, acq $$1) {
         return new dvp().a($$0).a(cui.a).a(dtr.e.get($$1)).a(duv.b);
      }

      private static gu a(acq $$0, gu $$1, int $$2) {
         return $$1.a(dtr.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gu $$1, cnb $$2, apf $$3, drs $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cpo.a.n(), 3);
            czn $$5 = $$2.c_($$1.d());
            if ($$5 instanceof czu) {
               ((czu)$$5).a(dzg.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         acq $$7 = new acq(this.a);
         dvp $$8 = a(this.c.d(), $$7);
         gu $$9 = dtr.f.get($$7);
         gu $$10 = this.d.a((hz)dvt.a($$8, new gu(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dhk.a.a, $$10.u(), $$10.w());
         gu $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dtr.b)) {
            gu $$13 = this.d.a((hz)dvt.a($$8, new gu(3, 0, 5)));
            dcb $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cpo.cO)) {
               $$0.a($$13, cpo.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
