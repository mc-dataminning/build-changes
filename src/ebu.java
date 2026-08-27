import java.util.Map;

public class ebu {
   static final hx a = new hx(4, 0, 15);
   private static final ahg[] b = new ahg[]{
      new ahg("shipwreck/with_mast"),
      new ahg("shipwreck/sideways_full"),
      new ahg("shipwreck/sideways_fronthalf"),
      new ahg("shipwreck/sideways_backhalf"),
      new ahg("shipwreck/rightsideup_full"),
      new ahg("shipwreck/rightsideup_fronthalf"),
      new ahg("shipwreck/rightsideup_backhalf"),
      new ahg("shipwreck/with_mast_degraded"),
      new ahg("shipwreck/rightsideup_full_degraded"),
      new ahg("shipwreck/rightsideup_fronthalf_degraded"),
      new ahg("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ahg[] c = new ahg[]{
      new ahg("shipwreck/with_mast"),
      new ahg("shipwreck/upsidedown_full"),
      new ahg("shipwreck/upsidedown_fronthalf"),
      new ahg("shipwreck/upsidedown_backhalf"),
      new ahg("shipwreck/sideways_full"),
      new ahg("shipwreck/sideways_fronthalf"),
      new ahg("shipwreck/sideways_backhalf"),
      new ahg("shipwreck/rightsideup_full"),
      new ahg("shipwreck/rightsideup_fronthalf"),
      new ahg("shipwreck/rightsideup_backhalf"),
      new ahg("shipwreck/with_mast_degraded"),
      new ahg("shipwreck/upsidedown_full_degraded"),
      new ahg("shipwreck/upsidedown_fronthalf_degraded"),
      new ahg("shipwreck/upsidedown_backhalf_degraded"),
      new ahg("shipwreck/sideways_full_degraded"),
      new ahg("shipwreck/sideways_fronthalf_degraded"),
      new ahg("shipwreck/sideways_backhalf_degraded"),
      new ahg("shipwreck/rightsideup_full_degraded"),
      new ahg("shipwreck/rightsideup_fronthalf_degraded"),
      new ahg("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ahg> d = Map.of("map_chest", egt.H, "treasure_chest", egt.J, "supply_chest", egt.I);

   public static void a(edg $$0, hx $$1, ddb $$2, dzk $$3, auu $$4, boolean $$5) {
      ahg $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new ebu.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dzp {
      private final boolean h;

      public a(edg $$0, ahg $$1, hx $$2, ddb $$3, boolean $$4) {
         super(dzw.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(edg $$0, sn $$1) {
         super(dzw.ab, $$1, $$0, $$1x -> a(ddb.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dzv $$0, sn $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static edb a(ddb $$0) {
         return new edb().a($$0).a(dbl.a).a(ebu.a).a(ech.d);
      }

      @Override
      protected void a(String $$0, hx $$1, cud $$2, auu $$3, dyx $$4) {
         ahg $$5 = ebu.d.get($$0);
         if ($$5 != null) {
            bkh.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cuj $$0, cuh $$1, dld $$2, auu $$3, dyx $$4, csv $$5, hx $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         jb $$9 = this.b.a();
         dop.a $$10 = this.h ? dop.a.a : dop.a.c;
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
