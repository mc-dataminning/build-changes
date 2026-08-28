import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eqi {
   public static final int a = 90;
   static final aku b = aku.b("igloo/top");
   private static final aku c = aku.b("igloo/middle");
   private static final aku d = aku.b("igloo/bottom");
   static final Map<aku, ji> e = ImmutableMap.of(b, new ji(3, 5, 5), c, new ji(1, 3, 1), d, new ji(3, 6, 7));
   static final Map<aku, ji> f = ImmutableMap.of(b, ji.c, c, new ji(2, -3, 4), d, new ji(0, -3, -2));

   public static void a(esm $$0, ji $$1, dqw $$2, eoo $$3, azh $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eqi.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eqi.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eqi.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eot {
      public a(esm $$0, aku $$1, ji $$2, dqw $$3, int $$4) {
         super(epa.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(esm $$0, tq $$1) {
         super(epa.I, $$1, $$0, $$1x -> a(dqw.valueOf($$1.l("Rot")), $$1x));
      }

      private static esh a(dqw $$0, aku $$1) {
         return new esh().a($$0).a(dpf.a).a(eqi.e.get($$1)).a(erm.b).a(erv.a);
      }

      private static ji a(aku $$0, ji $$1, int $$2) {
         return $$1.a(eqi.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eoz $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dhq $$2, azh $$3, eob $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dkg.a.m(), 3);
            dus $$5 = $$2.c_($$1.e());
            if ($$5 instanceof duz) {
               ((duz)$$5).a(ewk.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dhy $$0, dhv $$1, dzn $$2, azh $$3, eob $$4, dgg $$5, ji $$6) {
         aku $$7 = aku.a(this.a);
         esh $$8 = a(this.c.d(), $$7);
         ji $$9 = eqi.f.get($$7);
         ji $$10 = this.d.a((km)esl.a($$8, new ji(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(edo.a.a, $$10.u(), $$10.w());
         ji $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eqi.b)) {
            ji $$13 = this.d.a((km)esl.a($$8, new ji(3, 0, 5)));
            dxq $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dkg.cX)) {
               $$0.a($$13, dkg.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
