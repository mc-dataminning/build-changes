import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ekj {
   public static final int a = 90;
   static final alf b = new alf("igloo/top");
   private static final alf c = new alf("igloo/middle");
   private static final alf d = new alf("igloo/bottom");
   static final Map<alf, iz> e = ImmutableMap.of(b, new iz(3, 5, 5), c, new iz(1, 3, 1), d, new iz(3, 6, 7));
   static final Map<alf, iz> f = ImmutableMap.of(b, iz.c, c, new iz(2, -3, 4), d, new iz(0, -3, -2));

   public static void a(emm $$0, iz $$1, dln $$2, eiq $$3, azh $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ekj.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ekj.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ekj.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eiv {
      public a(emm $$0, alf $$1, iz $$2, dln $$3, int $$4) {
         super(ejc.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(emm $$0, us $$1) {
         super(ejc.I, $$1, $$0, $$1x -> a(dln.valueOf($$1.l("Rot")), $$1x));
      }

      private static emh a(dln $$0, alf $$1) {
         return new emh().a($$0).a(djx.a).a(ekj.e.get($$1)).a(eln.b);
      }

      private static iz a(alf $$0, iz $$1, int $$2) {
         return $$1.a(ekj.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dco $$2, azh $$3, eid $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfc.a.o(), 3);
            dpi $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dpp) {
               ((dpp)$$5).a(eqf.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         alf $$7 = new alf(this.a);
         emh $$8 = a(this.c.d(), $$7);
         iz $$9 = ekj.f.get($$7);
         iz $$10 = this.d.a((kd)eml.a($$8, new iz(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dxv.a.a, $$10.u(), $$10.w());
         iz $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ekj.b)) {
            iz $$13 = this.d.a((kd)eml.a($$8, new iz(3, 0, 5)));
            dsd $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dfc.cO)) {
               $$0.a($$13, dfc.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
