import java.util.Map;

public class dzk {
   static final ht a = new ht(4, 0, 15);
   private static final agg[] b = new agg[]{
      new agg("shipwreck/with_mast"),
      new agg("shipwreck/sideways_full"),
      new agg("shipwreck/sideways_fronthalf"),
      new agg("shipwreck/sideways_backhalf"),
      new agg("shipwreck/rightsideup_full"),
      new agg("shipwreck/rightsideup_fronthalf"),
      new agg("shipwreck/rightsideup_backhalf"),
      new agg("shipwreck/with_mast_degraded"),
      new agg("shipwreck/rightsideup_full_degraded"),
      new agg("shipwreck/rightsideup_fronthalf_degraded"),
      new agg("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final agg[] c = new agg[]{
      new agg("shipwreck/with_mast"),
      new agg("shipwreck/upsidedown_full"),
      new agg("shipwreck/upsidedown_fronthalf"),
      new agg("shipwreck/upsidedown_backhalf"),
      new agg("shipwreck/sideways_full"),
      new agg("shipwreck/sideways_fronthalf"),
      new agg("shipwreck/sideways_backhalf"),
      new agg("shipwreck/rightsideup_full"),
      new agg("shipwreck/rightsideup_fronthalf"),
      new agg("shipwreck/rightsideup_backhalf"),
      new agg("shipwreck/with_mast_degraded"),
      new agg("shipwreck/upsidedown_full_degraded"),
      new agg("shipwreck/upsidedown_fronthalf_degraded"),
      new agg("shipwreck/upsidedown_backhalf_degraded"),
      new agg("shipwreck/sideways_full_degraded"),
      new agg("shipwreck/sideways_fronthalf_degraded"),
      new agg("shipwreck/sideways_backhalf_degraded"),
      new agg("shipwreck/rightsideup_full_degraded"),
      new agg("shipwreck/rightsideup_fronthalf_degraded"),
      new agg("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, agg> d = Map.of("map_chest", eej.H, "treasure_chest", eej.J, "supply_chest", eej.I);

   public static void a(eaw $$0, ht $$1, dbf $$2, dxa $$3, ato $$4, boolean $$5) {
      agg $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dzk.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dxf {
      private final boolean h;

      public a(eaw $$0, agg $$1, ht $$2, dbf $$3, boolean $$4) {
         super(dxm.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eaw $$0, rz $$1) {
         super(dxm.ab, $$1, $$0, $$1x -> a(dbf.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dxl $$0, rz $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ear a(dbf $$0) {
         return new ear().a($$0).a(czp.a).a(dzk.a).a(dzx.d);
      }

      @Override
      protected void a(String $$0, ht $$1, csh $$2, ato $$3, dwn $$4) {
         agg $$5 = dzk.d.get($$0);
         if ($$5 != null) {
            dfv.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(csm $$0, csk $$1, dit $$2, ato $$3, dwn $$4, cqz $$5, ht $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         iw $$9 = this.b.a();
         dmf.a $$10 = this.h ? dmf.a.a : dmf.a.c;
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
