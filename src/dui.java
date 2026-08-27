import java.util.Map;

public class dui {
   static final gu a = new gu(4, 0, 15);
   private static final acq[] b = new acq[]{
      new acq("shipwreck/with_mast"),
      new acq("shipwreck/sideways_full"),
      new acq("shipwreck/sideways_fronthalf"),
      new acq("shipwreck/sideways_backhalf"),
      new acq("shipwreck/rightsideup_full"),
      new acq("shipwreck/rightsideup_fronthalf"),
      new acq("shipwreck/rightsideup_backhalf"),
      new acq("shipwreck/with_mast_degraded"),
      new acq("shipwreck/rightsideup_full_degraded"),
      new acq("shipwreck/rightsideup_fronthalf_degraded"),
      new acq("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final acq[] c = new acq[]{
      new acq("shipwreck/with_mast"),
      new acq("shipwreck/upsidedown_full"),
      new acq("shipwreck/upsidedown_fronthalf"),
      new acq("shipwreck/upsidedown_backhalf"),
      new acq("shipwreck/sideways_full"),
      new acq("shipwreck/sideways_fronthalf"),
      new acq("shipwreck/sideways_backhalf"),
      new acq("shipwreck/rightsideup_full"),
      new acq("shipwreck/rightsideup_fronthalf"),
      new acq("shipwreck/rightsideup_backhalf"),
      new acq("shipwreck/with_mast_degraded"),
      new acq("shipwreck/upsidedown_full_degraded"),
      new acq("shipwreck/upsidedown_fronthalf_degraded"),
      new acq("shipwreck/upsidedown_backhalf_degraded"),
      new acq("shipwreck/sideways_full_degraded"),
      new acq("shipwreck/sideways_fronthalf_degraded"),
      new acq("shipwreck/sideways_backhalf_degraded"),
      new acq("shipwreck/rightsideup_full_degraded"),
      new acq("shipwreck/rightsideup_fronthalf_degraded"),
      new acq("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, acq> d = Map.of("map_chest", dzg.H, "treasure_chest", dzg.J, "supply_chest", dzg.I);

   public static void a(dvu $$0, gu $$1, cvz $$2, dsf $$3, apf $$4, boolean $$5) {
      acq $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dui.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dsk {
      private final boolean h;

      public a(dvu $$0, acq $$1, gu $$2, cvz $$3, boolean $$4) {
         super(dsr.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dvu $$0, qr $$1) {
         super(dsr.ab, $$1, $$0, $$1x -> a(cvz.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dvp a(cvz $$0) {
         return new dvp().a($$0).a(cui.a).a(dui.a).a(duv.d);
      }

      @Override
      protected void a(String $$0, gu $$1, cnb $$2, apf $$3, drs $$4) {
         acq $$5 = dui.d.get($$0);
         if ($$5 != null) {
            daq.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         hz $$9 = this.b.a();
         dhk.a $$10 = this.h ? dhk.a.a : dhk.a.c;
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
