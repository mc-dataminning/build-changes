import java.util.Map;

public class dxs {
   static final gw a = new gw(4, 0, 15);
   private static final aey[] b = new aey[]{
      new aey("shipwreck/with_mast"),
      new aey("shipwreck/sideways_full"),
      new aey("shipwreck/sideways_fronthalf"),
      new aey("shipwreck/sideways_backhalf"),
      new aey("shipwreck/rightsideup_full"),
      new aey("shipwreck/rightsideup_fronthalf"),
      new aey("shipwreck/rightsideup_backhalf"),
      new aey("shipwreck/with_mast_degraded"),
      new aey("shipwreck/rightsideup_full_degraded"),
      new aey("shipwreck/rightsideup_fronthalf_degraded"),
      new aey("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aey[] c = new aey[]{
      new aey("shipwreck/with_mast"),
      new aey("shipwreck/upsidedown_full"),
      new aey("shipwreck/upsidedown_fronthalf"),
      new aey("shipwreck/upsidedown_backhalf"),
      new aey("shipwreck/sideways_full"),
      new aey("shipwreck/sideways_fronthalf"),
      new aey("shipwreck/sideways_backhalf"),
      new aey("shipwreck/rightsideup_full"),
      new aey("shipwreck/rightsideup_fronthalf"),
      new aey("shipwreck/rightsideup_backhalf"),
      new aey("shipwreck/with_mast_degraded"),
      new aey("shipwreck/upsidedown_full_degraded"),
      new aey("shipwreck/upsidedown_fronthalf_degraded"),
      new aey("shipwreck/upsidedown_backhalf_degraded"),
      new aey("shipwreck/sideways_full_degraded"),
      new aey("shipwreck/sideways_fronthalf_degraded"),
      new aey("shipwreck/sideways_backhalf_degraded"),
      new aey("shipwreck/rightsideup_full_degraded"),
      new aey("shipwreck/rightsideup_fronthalf_degraded"),
      new aey("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aey> d = Map.of("map_chest", ecq.H, "treasure_chest", ecq.J, "supply_chest", ecq.I);

   public static void a(dze $$0, gw $$1, czj $$2, dvp $$3, ase $$4, boolean $$5) {
      aey $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dxs.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dvu {
      private final boolean h;

      public a(dze $$0, aey $$1, gw $$2, czj $$3, boolean $$4) {
         super(dwb.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dze $$0, qy $$1) {
         super(dwb.ab, $$1, $$0, $$1x -> a(czj.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dwa $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dyz a(czj $$0) {
         return new dyz().a($$0).a(cxs.a).a(dxs.a).a(dyf.d);
      }

      @Override
      protected void a(String $$0, gw $$1, cqm $$2, ase $$3, dvc $$4) {
         aey $$5 = dxs.d.get($$0);
         if ($$5 != null) {
            dea.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cqr $$0, cqp $$1, dhi $$2, ase $$3, dvc $$4, cpe $$5, gw $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         ib $$9 = this.b.a();
         dku.a $$10 = this.h ? dku.a.a : dku.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            gw $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (gw $$13 : gw.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new gw(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
