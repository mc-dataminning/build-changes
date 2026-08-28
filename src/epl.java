import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class epl {
   public static final int a = 90;
   static final akv b = akv.b("igloo/top");
   private static final akv c = akv.b("igloo/middle");
   private static final akv d = akv.b("igloo/bottom");
   static final Map<akv, ji> e = ImmutableMap.of(b, new ji(3, 5, 5), c, new ji(1, 3, 1), d, new ji(3, 6, 7));
   static final Map<akv, ji> f = ImmutableMap.of(b, ji.c, c, new ji(2, -3, 4), d, new ji(0, -3, -2));

   public static void a(erp $$0, ji $$1, dqe $$2, enr $$3, azh $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new epl.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new epl.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new epl.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends enw {
      public a(erp $$0, akv $$1, ji $$2, dqe $$3, int $$4) {
         super(eod.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(erp $$0, tq $$1) {
         super(eod.I, $$1, $$0, $$1x -> a(dqe.valueOf($$1.l("Rot")), $$1x));
      }

      private static erk a(dqe $$0, akv $$1) {
         return new erk().a($$0).a(dol.a).a(epl.e.get($$1)).a(eqp.b).a(eqy.a);
      }

      private static ji a(akv $$0, ji $$1, int $$2) {
         return $$1.a(epl.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eoc $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ji $$1, dgz $$2, azh $$3, ene $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, djo.a.m(), 3);
            dtz $$5 = $$2.c_($$1.e());
            if ($$5 instanceof dug) {
               ((dug)$$5).a(evn.B, $$3.g());
            }
         }
      }

      @Override
      public void a(dhg $$0, dhe $$1, dyt $$2, azh $$3, ene $$4, dfo $$5, ji $$6) {
         akv $$7 = akv.a(this.a);
         erk $$8 = a(this.c.d(), $$7);
         ji $$9 = epl.f.get($$7);
         ji $$10 = this.d.a((km)ero.a($$8, new ji(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(ecs.a.a, $$10.u(), $$10.w());
         ji $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(epl.b)) {
            ji $$13 = this.d.a((km)ero.a($$8, new ji(3, 0, 5)));
            dwx $$14 = $$0.a_($$13.e());
            if (!$$14.l() && !$$14.a(djo.cX)) {
               $$0.a($$13, djo.ec.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
