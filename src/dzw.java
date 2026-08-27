import java.util.Map;

public class dzw {
   static final ht a = new ht(4, 0, 15);
   private static final agi[] b = new agi[]{
      new agi("shipwreck/with_mast"),
      new agi("shipwreck/sideways_full"),
      new agi("shipwreck/sideways_fronthalf"),
      new agi("shipwreck/sideways_backhalf"),
      new agi("shipwreck/rightsideup_full"),
      new agi("shipwreck/rightsideup_fronthalf"),
      new agi("shipwreck/rightsideup_backhalf"),
      new agi("shipwreck/with_mast_degraded"),
      new agi("shipwreck/rightsideup_full_degraded"),
      new agi("shipwreck/rightsideup_fronthalf_degraded"),
      new agi("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final agi[] c = new agi[]{
      new agi("shipwreck/with_mast"),
      new agi("shipwreck/upsidedown_full"),
      new agi("shipwreck/upsidedown_fronthalf"),
      new agi("shipwreck/upsidedown_backhalf"),
      new agi("shipwreck/sideways_full"),
      new agi("shipwreck/sideways_fronthalf"),
      new agi("shipwreck/sideways_backhalf"),
      new agi("shipwreck/rightsideup_full"),
      new agi("shipwreck/rightsideup_fronthalf"),
      new agi("shipwreck/rightsideup_backhalf"),
      new agi("shipwreck/with_mast_degraded"),
      new agi("shipwreck/upsidedown_full_degraded"),
      new agi("shipwreck/upsidedown_fronthalf_degraded"),
      new agi("shipwreck/upsidedown_backhalf_degraded"),
      new agi("shipwreck/sideways_full_degraded"),
      new agi("shipwreck/sideways_fronthalf_degraded"),
      new agi("shipwreck/sideways_backhalf_degraded"),
      new agi("shipwreck/rightsideup_full_degraded"),
      new agi("shipwreck/rightsideup_fronthalf_degraded"),
      new agi("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, agi> d = Map.of("map_chest", eev.H, "treasure_chest", eev.J, "supply_chest", eev.I);

   public static void a(ebi $$0, ht $$1, dbm $$2, dxm $$3, ats $$4, boolean $$5) {
      agi $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dzw.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dxr {
      private final boolean h;

      public a(ebi $$0, agi $$1, ht $$2, dbm $$3, boolean $$4) {
         super(dxy.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ebi $$0, rz $$1) {
         super(dxy.ab, $$1, $$0, $$1x -> a(dbm.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dxx $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ebd a(dbm $$0) {
         return new ebd().a($$0).a(czw.a).a(dzw.a).a(eaj.d);
      }

      @Override
      protected void a(String $$0, ht $$1, csp $$2, ats $$3, dwz $$4) {
         agi $$5 = dzw.d.get($$0);
         if ($$5 != null) {
            dgh.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(csu $$0, css $$1, djf $$2, ats $$3, dwz $$4, crh $$5, ht $$6) {
         int $$7 = $$0.ak();
         int $$8 = 0;
         iw $$9 = this.b.a();
         dmr.a $$10 = this.h ? dmr.a.a : dmr.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            ht $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (ht $$13 : ht.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new ht(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
