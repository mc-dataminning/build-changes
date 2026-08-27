import java.util.Map;

public class eiv {
   static final im a = new im(4, 0, 15);
   private static final akf[] b = new akf[]{
      new akf("shipwreck/with_mast"),
      new akf("shipwreck/sideways_full"),
      new akf("shipwreck/sideways_fronthalf"),
      new akf("shipwreck/sideways_backhalf"),
      new akf("shipwreck/rightsideup_full"),
      new akf("shipwreck/rightsideup_fronthalf"),
      new akf("shipwreck/rightsideup_backhalf"),
      new akf("shipwreck/with_mast_degraded"),
      new akf("shipwreck/rightsideup_full_degraded"),
      new akf("shipwreck/rightsideup_fronthalf_degraded"),
      new akf("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akf[] c = new akf[]{
      new akf("shipwreck/with_mast"),
      new akf("shipwreck/upsidedown_full"),
      new akf("shipwreck/upsidedown_fronthalf"),
      new akf("shipwreck/upsidedown_backhalf"),
      new akf("shipwreck/sideways_full"),
      new akf("shipwreck/sideways_fronthalf"),
      new akf("shipwreck/sideways_backhalf"),
      new akf("shipwreck/rightsideup_full"),
      new akf("shipwreck/rightsideup_fronthalf"),
      new akf("shipwreck/rightsideup_backhalf"),
      new akf("shipwreck/with_mast_degraded"),
      new akf("shipwreck/upsidedown_full_degraded"),
      new akf("shipwreck/upsidedown_fronthalf_degraded"),
      new akf("shipwreck/upsidedown_backhalf_degraded"),
      new akf("shipwreck/sideways_full_degraded"),
      new akf("shipwreck/sideways_fronthalf_degraded"),
      new akf("shipwreck/sideways_backhalf_degraded"),
      new akf("shipwreck/rightsideup_full_degraded"),
      new akf("shipwreck/rightsideup_fronthalf_degraded"),
      new akf("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akf> d = Map.of("map_chest", eny.H, "treasure_chest", eny.J, "supply_chest", eny.I);

   public static void a(ekh $$0, im $$1, dji $$2, egl $$3, ayd $$4, boolean $$5) {
      akf $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eiv.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends egq {
      private final boolean h;

      public a(ekh $$0, akf $$1, im $$2, dji $$3, boolean $$4) {
         super(egx.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ekh $$0, ty $$1) {
         super(egx.ab, $$1, $$0, $$1x -> a(dji.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ekc a(dji $$0) {
         return new ekc().a($$0).a(dhs.a).a(eiv.a).a(eji.d);
      }

      @Override
      protected void a(String $$0, im $$1, daj $$2, ayd $$3, efy $$4) {
         akf $$5 = eiv.d.get($$0);
         if ($$5 != null) {
            boy.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         jq $$9 = this.b.a();
         dvq.a $$10 = this.h ? dvq.a.a : dvq.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            im $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (im $$13 : im.c(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new im(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
