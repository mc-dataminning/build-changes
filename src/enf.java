import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class enf {
   public static final int a = 90;
   static final ale b = ale.b("igloo/top");
   private static final ale c = ale.b("igloo/middle");
   private static final ale d = ale.b("igloo/bottom");
   static final Map<ale, jf> e = ImmutableMap.of(b, new jf(3, 5, 5), c, new jf(1, 3, 1), d, new jf(3, 6, 7));
   static final Map<ale, jf> f = ImmutableMap.of(b, jf.c, c, new jf(2, -3, 4), d, new jf(0, -3, -2));

   public static void a(epj $$0, jf $$1, doa $$2, ell $$3, azn $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new enf.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new enf.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new enf.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends elq {
      public a(epj $$0, ale $$1, jf $$2, doa $$3, int $$4) {
         super(elx.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(epj $$0, ug $$1) {
         super(elx.I, $$1, $$0, $$1x -> a(doa.valueOf($$1.l("Rot")), $$1x));
      }

      private static epe a(doa $$0, ale $$1) {
         return new epe().a($$0).a(dmj.a).a(enf.e.get($$1)).a(eoj.b).a(eos.a);
      }

      private static jf a(ale $$0, jf $$1, int $$2) {
         return $$1.a(enf.f.get($$0)).c($$2);
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jf $$1, dez $$2, azn $$3, eky $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dho.a.n(), 3);
            drv $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dsc) {
               ((dsc)$$5).a(eth.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         ale $$7 = ale.a(this.a);
         epe $$8 = a(this.c.d(), $$7);
         jf $$9 = enf.f.get($$7);
         jf $$10 = this.d.a((kj)epi.a($$8, new jf(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(eao.a.a, $$10.u(), $$10.w());
         jf $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(enf.b)) {
            jf $$13 = this.d.a((kj)epi.a($$8, new jf(3, 0, 5)));
            dus $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dho.cO)) {
               $$0.a($$13, dho.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
