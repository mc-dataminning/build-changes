import java.util.Map;

public class ebd {
   static final hv a = new hv(4, 0, 15);
   private static final agt[] b = new agt[]{
      new agt("shipwreck/with_mast"),
      new agt("shipwreck/sideways_full"),
      new agt("shipwreck/sideways_fronthalf"),
      new agt("shipwreck/sideways_backhalf"),
      new agt("shipwreck/rightsideup_full"),
      new agt("shipwreck/rightsideup_fronthalf"),
      new agt("shipwreck/rightsideup_backhalf"),
      new agt("shipwreck/with_mast_degraded"),
      new agt("shipwreck/rightsideup_full_degraded"),
      new agt("shipwreck/rightsideup_fronthalf_degraded"),
      new agt("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final agt[] c = new agt[]{
      new agt("shipwreck/with_mast"),
      new agt("shipwreck/upsidedown_full"),
      new agt("shipwreck/upsidedown_fronthalf"),
      new agt("shipwreck/upsidedown_backhalf"),
      new agt("shipwreck/sideways_full"),
      new agt("shipwreck/sideways_fronthalf"),
      new agt("shipwreck/sideways_backhalf"),
      new agt("shipwreck/rightsideup_full"),
      new agt("shipwreck/rightsideup_fronthalf"),
      new agt("shipwreck/rightsideup_backhalf"),
      new agt("shipwreck/with_mast_degraded"),
      new agt("shipwreck/upsidedown_full_degraded"),
      new agt("shipwreck/upsidedown_fronthalf_degraded"),
      new agt("shipwreck/upsidedown_backhalf_degraded"),
      new agt("shipwreck/sideways_full_degraded"),
      new agt("shipwreck/sideways_fronthalf_degraded"),
      new agt("shipwreck/sideways_backhalf_degraded"),
      new agt("shipwreck/rightsideup_full_degraded"),
      new agt("shipwreck/rightsideup_fronthalf_degraded"),
      new agt("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, agt> d = Map.of("map_chest", egc.H, "treasure_chest", egc.J, "supply_chest", egc.I);

   public static void a(ecp $$0, hv $$1, dcl $$2, dyt $$3, auf $$4, boolean $$5) {
      agt $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new ebd.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dyy {
      private final boolean h;

      public a(ecp $$0, agt $$1, hv $$2, dcl $$3, boolean $$4) {
         super(dzf.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ecp $$0, sj $$1) {
         super(dzf.ab, $$1, $$0, $$1x -> a(dcl.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dze $$0, sj $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static eck a(dcl $$0) {
         return new eck().a($$0).a(dav.a).a(ebd.a).a(ebq.d);
      }

      @Override
      protected void a(String $$0, hv $$1, ctn $$2, auf $$3, dyg $$4) {
         agt $$5 = ebd.d.get($$0);
         if ($$5 != null) {
            bjs.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(ctt $$0, ctr $$1, dkm $$2, auf $$3, dyg $$4, csf $$5, hv $$6) {
         int $$7 = $$0.ak();
         int $$8 = 0;
         iz $$9 = this.b.a();
         dny.a $$10 = this.h ? dny.a.a : dny.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            hv $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (hv $$13 : hv.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new hv(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
