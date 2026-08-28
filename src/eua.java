import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eua {
   public static final int a = 90;
   static final ali b = ali.b("igloo/top");
   private static final ali c = ali.b("igloo/middle");
   private static final ali d = ali.b("igloo/bottom");
   static final Map<ali, iv> e = ImmutableMap.of(b, new iv(3, 5, 5), c, new iv(1, 3, 1), d, new iv(3, 6, 7));
   static final Map<ali, iv> f = ImmutableMap.of(b, iv.c, c, new iv(2, -3, 4), d, new iv(0, -3, -2));

   public static void a(ewe $$0, iv $$1, dtw $$2, esg $$3, azx $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eua.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eua.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eua.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends esl {
      public a(ewe $$0, ali $$1, iv $$2, dtw $$3, int $$4) {
         super(ess.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ewe $$0, tz $$1) {
         super(ess.I, $$1, $$0, $$1x -> a($$1.<dtw>a("Rot", dtw.h).orElseThrow(), $$1x));
      }

      private static evz a(dtw $$0, ali $$1) {
         return new evz().a($$0).a(dsf.a).a(eua.e.get($$1)).a(eve.b).a(evn.a);
      }

      private static iv a(ali $$0, iv $$1, int $$2) {
         return $$1.a(eua.f.get($$0)).c($$2);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dtw.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iv $$1, dko $$2, azx $$3, ert $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dne.a.m(), 3);
            dyc $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dyk) {
               ((dyk)$$5).a(fad.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         ali $$7 = ali.a(this.a);
         evz $$8 = a(this.c.d(), $$7);
         iv $$9 = eua.f.get($$7);
         iv $$10 = this.d.a((ka)ewd.a($$8, new iv(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ehd.a.a, $$10.u(), $$10.w());
         iv $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eua.b)) {
            iv $$13 = this.d.a((ka)ewd.a($$8, new iv(3, 0, 5)));
            ebe $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dne.da)) {
               $$0.a($$13, dne.ef.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
