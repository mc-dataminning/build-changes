import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eqi {
   public static final int a = 90;
   static final alz b = alz.b("igloo/top");
   private static final alz c = alz.b("igloo/middle");
   private static final alz d = alz.b("igloo/bottom");
   static final Map<alz, jh> e = ImmutableMap.of(b, new jh(3, 5, 5), c, new jh(1, 3, 1), d, new jh(3, 6, 7));
   static final Map<alz, jh> f = ImmutableMap.of(b, jh.c, c, new jh(2, -3, 4), d, new jh(0, -3, -2));

   public static void a(esm $$0, jh $$1, drb $$2, eoo $$3, bam $$4) {
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
      public a(esm $$0, alz $$1, jh $$2, drb $$3, int $$4) {
         super(epa.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(esm $$0, ux $$1) {
         super(epa.I, $$1, $$0, $$1x -> a(drb.valueOf($$1.l("Rot")), $$1x));
      }

      private static esh a(drb $$0, alz $$1) {
         return new esh().a($$0).a(dpk.a).a(eqi.e.get($$1)).a(erm.b).a(erv.a);
      }

      private static jh a(alz $$0, jh $$1, int $$2) {
         return $$1.a(eqi.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eoz $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dhy $$2, bam $$3, eob $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dkn.a.m(), 3);
            duw $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dvd) {
               ((dvd)$$5).a(ewk.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dif $$0, did $$1, dzq $$2, bam $$3, eob $$4, dgn $$5, jh $$6) {
         alz $$7 = alz.a(this.a);
         esh $$8 = a(this.c.d(), $$7);
         jh $$9 = eqi.f.get($$7);
         jh $$10 = this.d.a((kl)esl.a($$8, new jh(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(edp.a.a, $$10.u(), $$10.w());
         jh $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eqi.b)) {
            jh $$13 = this.d.a((kl)esl.a($$8, new jh(3, 0, 5)));
            dxu $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dkn.cX)) {
               $$0.a($$13, dkn.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
