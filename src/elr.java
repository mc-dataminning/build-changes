import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class elr {
   public static final int a = 90;
   static final akt b = new akt("igloo/top");
   private static final akt c = new akt("igloo/middle");
   private static final akt d = new akt("igloo/bottom");
   static final Map<akt, ir> e = ImmutableMap.of(b, new ir(3, 5, 5), c, new ir(1, 3, 1), d, new ir(3, 6, 7));
   static final Map<akt, ir> f = ImmutableMap.of(b, ir.c, c, new ir(2, -3, 4), d, new ir(0, -3, -2));

   public static void a(enu $$0, ir $$1, dmd $$2, ejy $$3, ayt $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new elr.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new elr.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new elr.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ekd {
      public a(enu $$0, akt $$1, ir $$2, dmd $$3, int $$4) {
         super(ekk.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(enu $$0, uk $$1) {
         super(ekk.I, $$1, $$0, $$1x -> a(dmd.valueOf($$1.l("Rot")), $$1x));
      }

      private static enp a(dmd $$0, akt $$1) {
         return new enp().a($$0).a(dke.a).a(elr.e.get($$1)).a(emv.b);
      }

      private static ir a(akt $$0, ir $$1, int $$2) {
         return $$1.a(elr.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ir $$1, dcp $$2, ayt $$3, ejl $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfe.a.n(), 3);
            dqc $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dqj) {
               ((dqj)$$5).a(ern.E, $$3.g());
            }
         }
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         akt $$7 = new akt(this.a);
         enp $$8 = a(this.c.d(), $$7);
         ir $$9 = elr.f.get($$7);
         ir $$10 = this.d.a((jv)ent.a($$8, new ir(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dyu.a.a, $$10.u(), $$10.w());
         ir $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(elr.b)) {
            ir $$13 = this.d.a((jv)ent.a($$8, new ir(3, 0, 5)));
            dtc $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dfe.dA)) {
               $$0.a($$13, dfe.eD.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
