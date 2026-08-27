import java.util.Map;

public class dxq {
   static final gw a = new gw(4, 0, 15);
   private static final aex[] b = new aex[]{
      new aex("shipwreck/with_mast"),
      new aex("shipwreck/sideways_full"),
      new aex("shipwreck/sideways_fronthalf"),
      new aex("shipwreck/sideways_backhalf"),
      new aex("shipwreck/rightsideup_full"),
      new aex("shipwreck/rightsideup_fronthalf"),
      new aex("shipwreck/rightsideup_backhalf"),
      new aex("shipwreck/with_mast_degraded"),
      new aex("shipwreck/rightsideup_full_degraded"),
      new aex("shipwreck/rightsideup_fronthalf_degraded"),
      new aex("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aex[] c = new aex[]{
      new aex("shipwreck/with_mast"),
      new aex("shipwreck/upsidedown_full"),
      new aex("shipwreck/upsidedown_fronthalf"),
      new aex("shipwreck/upsidedown_backhalf"),
      new aex("shipwreck/sideways_full"),
      new aex("shipwreck/sideways_fronthalf"),
      new aex("shipwreck/sideways_backhalf"),
      new aex("shipwreck/rightsideup_full"),
      new aex("shipwreck/rightsideup_fronthalf"),
      new aex("shipwreck/rightsideup_backhalf"),
      new aex("shipwreck/with_mast_degraded"),
      new aex("shipwreck/upsidedown_full_degraded"),
      new aex("shipwreck/upsidedown_fronthalf_degraded"),
      new aex("shipwreck/upsidedown_backhalf_degraded"),
      new aex("shipwreck/sideways_full_degraded"),
      new aex("shipwreck/sideways_fronthalf_degraded"),
      new aex("shipwreck/sideways_backhalf_degraded"),
      new aex("shipwreck/rightsideup_full_degraded"),
      new aex("shipwreck/rightsideup_fronthalf_degraded"),
      new aex("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aex> d = Map.of("map_chest", eco.H, "treasure_chest", eco.J, "supply_chest", eco.I);

   public static void a(dzc $$0, gw $$1, czh $$2, dvn $$3, asc $$4, boolean $$5) {
      aex $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dxq.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dvs {
      private final boolean h;

      public a(dzc $$0, aex $$1, gw $$2, czh $$3, boolean $$4) {
         super(dvz.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dzc $$0, qy $$1) {
         super(dvz.ab, $$1, $$0, $$1x -> a(czh.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dvy $$0, qy $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dyx a(czh $$0) {
         return new dyx().a($$0).a(cxq.a).a(dxq.a).a(dyd.d);
      }

      @Override
      protected void a(String $$0, gw $$1, cqk $$2, asc $$3, dva $$4) {
         aex $$5 = dxq.d.get($$0);
         if ($$5 != null) {
            ddy.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cqp $$0, cqn $$1, dhg $$2, asc $$3, dva $$4, cpc $$5, gw $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         ib $$9 = this.b.a();
         dks.a $$10 = this.h ? dks.a.a : dks.a.c;
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
