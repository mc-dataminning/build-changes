import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eth {
   public static final int a = 90;
   static final alg b = alg.b("igloo/top");
   private static final alg c = alg.b("igloo/middle");
   private static final alg d = alg.b("igloo/bottom");
   static final Map<alg, iv> e = ImmutableMap.of(b, new iv(3, 5, 5), c, new iv(1, 3, 1), d, new iv(3, 6, 7));
   static final Map<alg, iv> f = ImmutableMap.of(b, iv.c, c, new iv(2, -3, 4), d, new iv(0, -3, -2));

   public static void a(evl $$0, iv $$1, dtg $$2, ern $$3, azv $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eth.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eth.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eth.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ers {
      public a(evl $$0, alg $$1, iv $$2, dtg $$3, int $$4) {
         super(erz.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(evl $$0, tz $$1) {
         super(erz.I, $$1, $$0, $$1x -> a($$1.<dtg>a("Rot", dtg.h).orElseThrow(), $$1x));
      }

      private static evg a(dtg $$0, alg $$1) {
         return new evg().a($$0).a(drp.a).a(eth.e.get($$1)).a(eul.b).a(euu.a);
      }

      private static iv a(alg $$0, iv $$1, int $$2) {
         return $$1.a(eth.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ery $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtg.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iv $$1, djy $$2, azv $$3, era $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dmo.a.m(), 3);
            dxm $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dxu) {
               ((dxu)$$5).a(ezk.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
         alg $$7 = alg.a(this.a);
         evg $$8 = a(this.c.d(), $$7);
         iv $$9 = eth.f.get($$7);
         iv $$10 = this.d.a((ka)evk.a($$8, new iv(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(egn.a.a, $$10.u(), $$10.w());
         iv $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eth.b)) {
            iv $$13 = this.d.a((ka)evk.a($$8, new iv(3, 0, 5)));
            eao $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dmo.da)) {
               $$0.a($$13, dmo.ef.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
