import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class enw {
   public static final int a = 90;
   static final ali b = ali.b("igloo/top");
   private static final ali c = ali.b("igloo/middle");
   private static final ali d = ali.b("igloo/bottom");
   static final Map<ali, jh> e = ImmutableMap.of(b, new jh(3, 5, 5), c, new jh(1, 3, 1), d, new jh(3, 6, 7));
   static final Map<ali, jh> f = ImmutableMap.of(b, jh.c, c, new jh(2, -3, 4), d, new jh(0, -3, -2));

   public static void a(eqa $$0, jh $$1, dor $$2, emc $$3, azs $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new enw.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new enw.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new enw.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends emh {
      public a(eqa $$0, ali $$1, jh $$2, dor $$3, int $$4) {
         super(emo.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eqa $$0, uk $$1) {
         super(emo.I, $$1, $$0, $$1x -> a(dor.valueOf($$1.l("Rot")), $$1x));
      }

      private static epv a(dor $$0, ali $$1) {
         return new epv().a($$0).a(dna.a).a(enw.e.get($$1)).a(epa.b).a(epj.a);
      }

      private static jh a(ali $$0, jh $$1, int $$2) {
         return $$1.a(enw.f.get($$0)).c($$2);
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dfr $$2, azs $$3, elp $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dig.a.m(), 3);
            dsm $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dst) {
               ((dst)$$5).a(ety.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         ali $$7 = ali.a(this.a);
         epv $$8 = a(this.c.d(), $$7);
         jh $$9 = enw.f.get($$7);
         jh $$10 = this.d.a((kl)epz.a($$8, new jh(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ebf.a.a, $$10.u(), $$10.w());
         jh $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(enw.b)) {
            jh $$13 = this.d.a((kl)epz.a($$8, new jh(3, 0, 5)));
            dvj $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dig.cO)) {
               $$0.a($$13, dig.dP.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
