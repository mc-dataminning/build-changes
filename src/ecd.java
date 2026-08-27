import java.util.Map;

public class ecd {
   static final hx a = new hx(4, 0, 15);
   private static final ahh[] b = new ahh[]{
      new ahh("shipwreck/with_mast"),
      new ahh("shipwreck/sideways_full"),
      new ahh("shipwreck/sideways_fronthalf"),
      new ahh("shipwreck/sideways_backhalf"),
      new ahh("shipwreck/rightsideup_full"),
      new ahh("shipwreck/rightsideup_fronthalf"),
      new ahh("shipwreck/rightsideup_backhalf"),
      new ahh("shipwreck/with_mast_degraded"),
      new ahh("shipwreck/rightsideup_full_degraded"),
      new ahh("shipwreck/rightsideup_fronthalf_degraded"),
      new ahh("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ahh[] c = new ahh[]{
      new ahh("shipwreck/with_mast"),
      new ahh("shipwreck/upsidedown_full"),
      new ahh("shipwreck/upsidedown_fronthalf"),
      new ahh("shipwreck/upsidedown_backhalf"),
      new ahh("shipwreck/sideways_full"),
      new ahh("shipwreck/sideways_fronthalf"),
      new ahh("shipwreck/sideways_backhalf"),
      new ahh("shipwreck/rightsideup_full"),
      new ahh("shipwreck/rightsideup_fronthalf"),
      new ahh("shipwreck/rightsideup_backhalf"),
      new ahh("shipwreck/with_mast_degraded"),
      new ahh("shipwreck/upsidedown_full_degraded"),
      new ahh("shipwreck/upsidedown_fronthalf_degraded"),
      new ahh("shipwreck/upsidedown_backhalf_degraded"),
      new ahh("shipwreck/sideways_full_degraded"),
      new ahh("shipwreck/sideways_fronthalf_degraded"),
      new ahh("shipwreck/sideways_backhalf_degraded"),
      new ahh("shipwreck/rightsideup_full_degraded"),
      new ahh("shipwreck/rightsideup_fronthalf_degraded"),
      new ahh("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ahh> d = Map.of("map_chest", ehd.H, "treasure_chest", ehd.J, "supply_chest", ehd.I);

   public static void a(edp $$0, hx $$1, ddk $$2, dzt $$3, auw $$4, boolean $$5) {
      ahh $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new ecd.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dzy {
      private final boolean h;

      public a(edp $$0, ahh $$1, hx $$2, ddk $$3, boolean $$4) {
         super(eaf.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(edp $$0, so $$1) {
         super(eaf.ab, $$1, $$0, $$1x -> a(ddk.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static edk a(ddk $$0) {
         return new edk().a($$0).a(dbu.a).a(ecd.a).a(ecq.d);
      }

      @Override
      protected void a(String $$0, hx $$1, cum $$2, auw $$3, dzg $$4) {
         ahh $$5 = ecd.d.get($$0);
         if ($$5 != null) {
            bkk.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         jb $$9 = this.b.a();
         doy.a $$10 = this.h ? doy.a.a : doy.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            hx $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (hx $$13 : hx.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new hx(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
