import java.util.Map;

public class dxf {
   static final gv a = new gv(4, 0, 15);
   private static final aep[] b = new aep[]{
      new aep("shipwreck/with_mast"),
      new aep("shipwreck/sideways_full"),
      new aep("shipwreck/sideways_fronthalf"),
      new aep("shipwreck/sideways_backhalf"),
      new aep("shipwreck/rightsideup_full"),
      new aep("shipwreck/rightsideup_fronthalf"),
      new aep("shipwreck/rightsideup_backhalf"),
      new aep("shipwreck/with_mast_degraded"),
      new aep("shipwreck/rightsideup_full_degraded"),
      new aep("shipwreck/rightsideup_fronthalf_degraded"),
      new aep("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aep[] c = new aep[]{
      new aep("shipwreck/with_mast"),
      new aep("shipwreck/upsidedown_full"),
      new aep("shipwreck/upsidedown_fronthalf"),
      new aep("shipwreck/upsidedown_backhalf"),
      new aep("shipwreck/sideways_full"),
      new aep("shipwreck/sideways_fronthalf"),
      new aep("shipwreck/sideways_backhalf"),
      new aep("shipwreck/rightsideup_full"),
      new aep("shipwreck/rightsideup_fronthalf"),
      new aep("shipwreck/rightsideup_backhalf"),
      new aep("shipwreck/with_mast_degraded"),
      new aep("shipwreck/upsidedown_full_degraded"),
      new aep("shipwreck/upsidedown_fronthalf_degraded"),
      new aep("shipwreck/upsidedown_backhalf_degraded"),
      new aep("shipwreck/sideways_full_degraded"),
      new aep("shipwreck/sideways_fronthalf_degraded"),
      new aep("shipwreck/sideways_backhalf_degraded"),
      new aep("shipwreck/rightsideup_full_degraded"),
      new aep("shipwreck/rightsideup_fronthalf_degraded"),
      new aep("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aep> d = Map.of("map_chest", ecd.H, "treasure_chest", ecd.J, "supply_chest", ecd.I);

   public static void a(dyr $$0, gv $$1, cyw $$2, dvc $$3, art $$4, boolean $$5) {
      aep $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dxf.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dvh {
      private final boolean h;

      public a(dyr $$0, aep $$1, gv $$2, cyw $$3, boolean $$4) {
         super(dvo.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dyr $$0, qs $$1) {
         super(dvo.ab, $$1, $$0, $$1x -> a(cyw.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dvn $$0, qs $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dym a(cyw $$0) {
         return new dym().a($$0).a(cxf.a).a(dxf.a).a(dxs.d);
      }

      @Override
      protected void a(String $$0, gv $$1, cpz $$2, art $$3, dup $$4) {
         aep $$5 = dxf.d.get($$0);
         if ($$5 != null) {
            ddn.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cqe $$0, cqc $$1, dgv $$2, art $$3, dup $$4, cor $$5, gv $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         ia $$9 = this.b.a();
         dkh.a $$10 = this.h ? dkh.a.a : dkh.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            gv $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (gv $$13 : gv.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new gv(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
