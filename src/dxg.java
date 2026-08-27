import java.util.Map;

public class dxg {
   static final gu a = new gu(4, 0, 15);
   private static final aer[] b = new aer[]{
      new aer("shipwreck/with_mast"),
      new aer("shipwreck/sideways_full"),
      new aer("shipwreck/sideways_fronthalf"),
      new aer("shipwreck/sideways_backhalf"),
      new aer("shipwreck/rightsideup_full"),
      new aer("shipwreck/rightsideup_fronthalf"),
      new aer("shipwreck/rightsideup_backhalf"),
      new aer("shipwreck/with_mast_degraded"),
      new aer("shipwreck/rightsideup_full_degraded"),
      new aer("shipwreck/rightsideup_fronthalf_degraded"),
      new aer("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aer[] c = new aer[]{
      new aer("shipwreck/with_mast"),
      new aer("shipwreck/upsidedown_full"),
      new aer("shipwreck/upsidedown_fronthalf"),
      new aer("shipwreck/upsidedown_backhalf"),
      new aer("shipwreck/sideways_full"),
      new aer("shipwreck/sideways_fronthalf"),
      new aer("shipwreck/sideways_backhalf"),
      new aer("shipwreck/rightsideup_full"),
      new aer("shipwreck/rightsideup_fronthalf"),
      new aer("shipwreck/rightsideup_backhalf"),
      new aer("shipwreck/with_mast_degraded"),
      new aer("shipwreck/upsidedown_full_degraded"),
      new aer("shipwreck/upsidedown_fronthalf_degraded"),
      new aer("shipwreck/upsidedown_backhalf_degraded"),
      new aer("shipwreck/sideways_full_degraded"),
      new aer("shipwreck/sideways_fronthalf_degraded"),
      new aer("shipwreck/sideways_backhalf_degraded"),
      new aer("shipwreck/rightsideup_full_degraded"),
      new aer("shipwreck/rightsideup_fronthalf_degraded"),
      new aer("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aer> d = Map.of("map_chest", ece.H, "treasure_chest", ece.J, "supply_chest", ece.I);

   public static void a(dys $$0, gu $$1, cyx $$2, dvd $$3, aru $$4, boolean $$5) {
      aer $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dxg.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dvi {
      private final boolean h;

      public a(dys $$0, aer $$1, gu $$2, cyx $$3, boolean $$4) {
         super(dvp.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dys $$0, qr $$1) {
         super(dvp.ab, $$1, $$0, $$1x -> a(cyx.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dvo $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dyn a(cyx $$0) {
         return new dyn().a($$0).a(cxg.a).a(dxg.a).a(dxt.d);
      }

      @Override
      protected void a(String $$0, gu $$1, cqa $$2, aru $$3, duq $$4) {
         aer $$5 = dxg.d.get($$0);
         if ($$5 != null) {
            ddo.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         hz $$9 = this.b.a();
         dki.a $$10 = this.h ? dki.a.a : dki.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            gu $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (gu $$13 : gu.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new gu(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
