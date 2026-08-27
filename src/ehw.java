import java.util.Map;

public class ehw {
   static final ib a = new ib(4, 0, 15);
   private static final ajt[] b = new ajt[]{
      new ajt("shipwreck/with_mast"),
      new ajt("shipwreck/sideways_full"),
      new ajt("shipwreck/sideways_fronthalf"),
      new ajt("shipwreck/sideways_backhalf"),
      new ajt("shipwreck/rightsideup_full"),
      new ajt("shipwreck/rightsideup_fronthalf"),
      new ajt("shipwreck/rightsideup_backhalf"),
      new ajt("shipwreck/with_mast_degraded"),
      new ajt("shipwreck/rightsideup_full_degraded"),
      new ajt("shipwreck/rightsideup_fronthalf_degraded"),
      new ajt("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ajt[] c = new ajt[]{
      new ajt("shipwreck/with_mast"),
      new ajt("shipwreck/upsidedown_full"),
      new ajt("shipwreck/upsidedown_fronthalf"),
      new ajt("shipwreck/upsidedown_backhalf"),
      new ajt("shipwreck/sideways_full"),
      new ajt("shipwreck/sideways_fronthalf"),
      new ajt("shipwreck/sideways_backhalf"),
      new ajt("shipwreck/rightsideup_full"),
      new ajt("shipwreck/rightsideup_fronthalf"),
      new ajt("shipwreck/rightsideup_backhalf"),
      new ajt("shipwreck/with_mast_degraded"),
      new ajt("shipwreck/upsidedown_full_degraded"),
      new ajt("shipwreck/upsidedown_fronthalf_degraded"),
      new ajt("shipwreck/upsidedown_backhalf_degraded"),
      new ajt("shipwreck/sideways_full_degraded"),
      new ajt("shipwreck/sideways_fronthalf_degraded"),
      new ajt("shipwreck/sideways_backhalf_degraded"),
      new ajt("shipwreck/rightsideup_full_degraded"),
      new ajt("shipwreck/rightsideup_fronthalf_degraded"),
      new ajt("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ajt> d = Map.of("map_chest", emz.H, "treasure_chest", emz.J, "supply_chest", emz.I);

   public static void a(eji $$0, ib $$1, dik $$2, efm $$3, axr $$4, boolean $$5) {
      ajt $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new ehw.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends efr {
      private final boolean h;

      public a(eji $$0, ajt $$1, ib $$2, dik $$3, boolean $$4) {
         super(efy.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eji $$0, tm $$1) {
         super(efy.ab, $$1, $$0, $$1x -> a(dik.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(efx $$0, tm $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ejd a(dik $$0) {
         return new ejd().a($$0).a(dgu.a).a(ehw.a).a(eij.d);
      }

      @Override
      protected void a(String $$0, ib $$1, czm $$2, axr $$3, eez $$4) {
         ajt $$5 = ehw.d.get($$0);
         if ($$5 != null) {
            boi.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(czs $$0, czq $$1, dqw $$2, axr $$3, eez $$4, cye $$5, ib $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         jg $$9 = this.b.a();
         dur.a $$10 = this.h ? dur.a.a : dur.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            ib $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (ib $$13 : ib.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new ib(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
