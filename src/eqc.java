import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eqc {
   public static final int a = 90;
   static final alp b = alp.b("igloo/top");
   private static final alp c = alp.b("igloo/middle");
   private static final alp d = alp.b("igloo/bottom");
   static final Map<alp, jh> e = ImmutableMap.of(b, new jh(3, 5, 5), c, new jh(1, 3, 1), d, new jh(3, 6, 7));
   static final Map<alp, jh> f = ImmutableMap.of(b, jh.c, c, new jh(2, -3, 4), d, new jh(0, -3, -2));

   public static void a(esg $$0, jh $$1, dqv $$2, eoi $$3, bac $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eqc.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eqc.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eqc.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eon {
      public a(esg $$0, alp $$1, jh $$2, dqv $$3, int $$4) {
         super(eou.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(esg $$0, um $$1) {
         super(eou.I, $$1, $$0, $$1x -> a(dqv.valueOf($$1.l("Rot")), $$1x));
      }

      private static esb a(dqv $$0, alp $$1) {
         return new esb().a($$0).a(dpc.a).a(eqc.e.get($$1)).a(erg.b).a(erp.a);
      }

      private static jh a(alp $$0, jh $$1, int $$2) {
         return $$1.a(eqc.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jh $$1, dhq $$2, bac $$3, env $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dkf.a.m(), 3);
            duq $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dux) {
               ((dux)$$5).a(ewe.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         alp $$7 = alp.a(this.a);
         esb $$8 = a(this.c.d(), $$7);
         jh $$9 = eqc.f.get($$7);
         jh $$10 = this.d.a((kl)esf.a($$8, new jh(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(edj.a.a, $$10.u(), $$10.w());
         jh $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eqc.b)) {
            jh $$13 = this.d.a((kl)esf.a($$8, new jh(3, 0, 5)));
            dxo $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(dkf.cX)) {
               $$0.a($$13, dkf.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
