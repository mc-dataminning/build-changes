import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class etm {
   public static final int a = 90;
   static final alg b = alg.b("igloo/top");
   private static final alg c = alg.b("igloo/middle");
   private static final alg d = alg.b("igloo/bottom");
   static final Map<alg, iv> e = ImmutableMap.of(b, new iv(3, 5, 5), c, new iv(1, 3, 1), d, new iv(3, 6, 7));
   static final Map<alg, iv> f = ImmutableMap.of(b, iv.c, c, new iv(2, -3, 4), d, new iv(0, -3, -2));

   public static void a(evq $$0, iv $$1, dtl $$2, ers $$3, azv $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new etm.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new etm.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new etm.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends erx {
      public a(evq $$0, alg $$1, iv $$2, dtl $$3, int $$4) {
         super(ese.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(evq $$0, tz $$1) {
         super(ese.I, $$1, $$0, $$1x -> a($$1.<dtl>a("Rot", dtl.h).orElseThrow(), $$1x));
      }

      private static evl a(dtl $$0, alg $$1) {
         return new evl().a($$0).a(dru.a).a(etm.e.get($$1)).a(euq.b).a(euz.a);
      }

      private static iv a(alg $$0, iv $$1, int $$2) {
         return $$1.a(etm.f.get($$0)).c($$2);
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtl.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iv $$1, dkd $$2, azv $$3, erf $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dmt.a.m(), 3);
            dxr $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dxz) {
               ((dxz)$$5).a(ezp.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         alg $$7 = alg.a(this.a);
         evl $$8 = a(this.c.d(), $$7);
         iv $$9 = etm.f.get($$7);
         iv $$10 = this.d.a((ka)evp.a($$8, new iv(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(egs.a.a, $$10.u(), $$10.w());
         iv $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(etm.b)) {
            iv $$13 = this.d.a((ka)evp.a($$8, new iv(3, 0, 5)));
            eat $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dmt.da)) {
               $$0.a($$13, dmt.ef.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
