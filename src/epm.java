import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class epm {
   public static final int a = 90;
   static final akv b = akv.b("igloo/top");
   private static final akv c = akv.b("igloo/middle");
   private static final akv d = akv.b("igloo/bottom");
   static final Map<akv, ji> e = ImmutableMap.of(b, new ji(3, 5, 5), c, new ji(1, 3, 1), d, new ji(3, 6, 7));
   static final Map<akv, ji> f = ImmutableMap.of(b, ji.c, c, new ji(2, -3, 4), d, new ji(0, -3, -2));

   public static void a(erq $$0, ji $$1, dqf $$2, ens $$3, azh $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new epm.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new epm.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new epm.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends enx {
      public a(erq $$0, akv $$1, ji $$2, dqf $$3, int $$4) {
         super(eoe.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(erq $$0, tq $$1) {
         super(eoe.I, $$1, $$0, $$1x -> a(dqf.valueOf($$1.l("Rot")), $$1x));
      }

      private static erl a(dqf $$0, akv $$1) {
         return new erl().a($$0).a(dom.a).a(epm.e.get($$1)).a(eqq.b).a(eqz.a);
      }

      private static ji a(akv $$0, ji $$1, int $$2) {
         return $$1.a(epm.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eod $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dha $$2, azh $$3, enf $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, djp.a.m(), 3);
            dua $$5 = $$2.c_($$1.e());
            if ($$5 instanceof duh) {
               ((duh)$$5).a(evo.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dhh $$0, dhf $$1, dyu $$2, azh $$3, enf $$4, dfp $$5, ji $$6) {
         akv $$7 = akv.a(this.a);
         erl $$8 = a(this.c.d(), $$7);
         ji $$9 = epm.f.get($$7);
         ji $$10 = this.d.a((km)erp.a($$8, new ji(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ect.a.a, $$10.u(), $$10.w());
         ji $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(epm.b)) {
            ji $$13 = this.d.a((km)erp.a($$8, new ji(3, 0, 5)));
            dwy $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(djp.cX)) {
               $$0.a($$13, djp.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
