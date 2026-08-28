import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eqb {
   public static final int a = 90;
   static final alz b = alz.b("igloo/top");
   private static final alz c = alz.b("igloo/middle");
   private static final alz d = alz.b("igloo/bottom");
   static final Map<alz, jh> e = ImmutableMap.of(b, new jh(3, 5, 5), c, new jh(1, 3, 1), d, new jh(3, 6, 7));
   static final Map<alz, jh> f = ImmutableMap.of(b, jh.c, c, new jh(2, -3, 4), d, new jh(0, -3, -2));

   public static void a(esf $$0, jh $$1, dqu $$2, eoh $$3, bam $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eqb.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eqb.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eqb.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eom {
      public a(esf $$0, alz $$1, jh $$2, dqu $$3, int $$4) {
         super(eot.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(esf $$0, ux $$1) {
         super(eot.I, $$1, $$0, $$1x -> a(dqu.valueOf($$1.l("Rot")), $$1x));
      }

      private static esa a(dqu $$0, alz $$1) {
         return new esa().a($$0).a(dpd.a).a(eqb.e.get($$1)).a(erf.b).a(ero.a);
      }

      private static jh a(alz $$0, jh $$1, int $$2) {
         return $$1.a(eqb.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eos $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dhr $$2, bam $$3, enu $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dkg.a.m(), 3);
            dup $$5 = $$2.c_($$1.e());
            if ($$5 instanceof duw) {
               ((duw)$$5).a(ewd.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dhy $$0, dhw $$1, dzj $$2, bam $$3, enu $$4, dgg $$5, jh $$6) {
         alz $$7 = alz.a(this.a);
         esa $$8 = a(this.c.d(), $$7);
         jh $$9 = eqb.f.get($$7);
         jh $$10 = this.d.a((kl)ese.a($$8, new jh(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(edi.a.a, $$10.u(), $$10.w());
         jh $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eqb.b)) {
            jh $$13 = this.d.a((kl)ese.a($$8, new jh(3, 0, 5)));
            dxn $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dkg.cX)) {
               $$0.a($$13, dkg.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
