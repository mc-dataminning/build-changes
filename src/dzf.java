import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dzf {
   public static final int a = 90;
   static final agi b = new agi("igloo/top");
   private static final agi c = new agi("igloo/middle");
   private static final agi d = new agi("igloo/bottom");
   static final Map<agi, ht> e = ImmutableMap.of(b, new ht(3, 5, 5), c, new ht(1, 3, 1), d, new ht(3, 6, 7));
   static final Map<agi, ht> f = ImmutableMap.of(b, ht.b, c, new ht(2, -3, 4), d, new ht(0, -3, -2));

   public static void a(ebi $$0, ht $$1, dbm $$2, dxm $$3, ats $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dzf.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dzf.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dzf.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dxr {
      public a(ebi $$0, agi $$1, ht $$2, dbm $$3, int $$4) {
         super(dxy.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ebi $$0, rz $$1) {
         super(dxy.I, $$1, $$0, $$1x -> a(dbm.valueOf($$1.l("Rot")), $$1x));
      }

      private static ebd a(dbm $$0, agi $$1) {
         return new ebd().a($$0).a(czw.a).a(dzf.e.get($$1)).a(eaj.b);
      }

      private static ht a(agi $$0, ht $$1, int $$2) {
         return $$1.a(dzf.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dxx $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ht $$1, csp $$2, ats $$3, dwz $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cvc.a.o(), 3);
            dfd $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dfk) {
               ((dfk)$$5).a(eev.C, $$3.g());
            }
         }
      }

      @Override
      public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, ht $$6) {
         agi $$7 = new agi(this.a);
         ebd $$8 = a(this.c.d(), $$7);
         ht $$9 = dzf.f.get($$7);
         ht $$10 = this.d.a((iw)ebh.a($$8, new ht(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dmr.a.a, $$10.u(), $$10.w());
         ht $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dzf.b)) {
            ht $$13 = this.d.a((iw)ebh.a($$8, new ht(3, 0, 5)));
            dhi $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cvc.cO)) {
               $$0.a($$13, cvc.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
