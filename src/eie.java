import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class eie {
   public static final int a = 90;
   static final akf b = new akf("igloo/top");
   private static final akf c = new akf("igloo/middle");
   private static final akf d = new akf("igloo/bottom");
   static final Map<akf, im> e = ImmutableMap.of(b, new im(3, 5, 5), c, new im(1, 3, 1), d, new im(3, 6, 7));
   static final Map<akf, im> f = ImmutableMap.of(b, im.c, c, new im(2, -3, 4), d, new im(0, -3, -2));

   public static void a(ekh $$0, im $$1, dji $$2, egl $$3, ayd $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new eie.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new eie.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new eie.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends egq {
      public a(ekh $$0, akf $$1, im $$2, dji $$3, int $$4) {
         super(egx.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ekh $$0, ty $$1) {
         super(egx.I, $$1, $$0, $$1x -> a(dji.valueOf($$1.l("Rot")), $$1x));
      }

      private static ekc a(dji $$0, akf $$1) {
         return new ekc().a($$0).a(dhs.a).a(eie.e.get($$1)).a(eji.b);
      }

      private static im a(akf $$0, im $$1, int $$2) {
         return $$1.a(eie.f.get($$0)).c($$2);
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, im $$1, daj $$2, ayd $$3, efy $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dcx.a.n(), 3);
            dnd $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dnk) {
               ((dnk)$$5).a(eny.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         akf $$7 = new akf(this.a);
         ekc $$8 = a(this.c.d(), $$7);
         im $$9 = eie.f.get($$7);
         im $$10 = this.d.a((jq)ekg.a($$8, new im(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dvq.a.a, $$10.u(), $$10.w());
         im $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(eie.b)) {
            im $$13 = this.d.a((jq)ekg.a($$8, new im(3, 0, 5)));
            dpy $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dcx.cO)) {
               $$0.a($$13, dcx.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
