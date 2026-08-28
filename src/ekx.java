import java.util.Map;

public class ekx {
   static final iz a = new iz(4, 0, 15);
   private static final ale[] b = new ale[]{
      new ale("shipwreck/with_mast"),
      new ale("shipwreck/sideways_full"),
      new ale("shipwreck/sideways_fronthalf"),
      new ale("shipwreck/sideways_backhalf"),
      new ale("shipwreck/rightsideup_full"),
      new ale("shipwreck/rightsideup_fronthalf"),
      new ale("shipwreck/rightsideup_backhalf"),
      new ale("shipwreck/with_mast_degraded"),
      new ale("shipwreck/rightsideup_full_degraded"),
      new ale("shipwreck/rightsideup_fronthalf_degraded"),
      new ale("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ale[] c = new ale[]{
      new ale("shipwreck/with_mast"),
      new ale("shipwreck/upsidedown_full"),
      new ale("shipwreck/upsidedown_fronthalf"),
      new ale("shipwreck/upsidedown_backhalf"),
      new ale("shipwreck/sideways_full"),
      new ale("shipwreck/sideways_fronthalf"),
      new ale("shipwreck/sideways_backhalf"),
      new ale("shipwreck/rightsideup_full"),
      new ale("shipwreck/rightsideup_fronthalf"),
      new ale("shipwreck/rightsideup_backhalf"),
      new ale("shipwreck/with_mast_degraded"),
      new ale("shipwreck/upsidedown_full_degraded"),
      new ale("shipwreck/upsidedown_fronthalf_degraded"),
      new ale("shipwreck/upsidedown_backhalf_degraded"),
      new ale("shipwreck/sideways_full_degraded"),
      new ale("shipwreck/sideways_fronthalf_degraded"),
      new ale("shipwreck/sideways_backhalf_degraded"),
      new ale("shipwreck/rightsideup_full_degraded"),
      new ale("shipwreck/rightsideup_fronthalf_degraded"),
      new ale("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ald<eql>> d = Map.of("map_chest", eqc.H, "treasure_chest", eqc.J, "supply_chest", eqc.I);

   public static void a(emj $$0, iz $$1, dlk $$2, ein $$3, azf $$4, boolean $$5) {
      ale $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new ekx.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends eis {
      private final boolean h;

      public a(emj $$0, ale $$1, iz $$2, dlk $$3, boolean $$4) {
         super(eiz.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(emj $$0, ur $$1) {
         super(eiz.ab, $$1, $$0, $$1x -> a(dlk.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eiy $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static eme a(dlk $$0) {
         return new eme().a($$0).a(dju.a).a(ekx.a).a(elk.d);
      }

      @Override
      protected void a(String $$0, iz $$1, dcl $$2, azf $$3, eia $$4) {
         ald<eql> $$5 = ekx.d.get($$0);
         if ($$5 != null) {
            bra.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, iz $$6) {
         int $$7 = $$0.am();
         int $$8 = 0;
         kd $$9 = this.b.a();
         dxs.a $$10 = this.h ? dxs.a.a : dxs.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            iz $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (iz $$13 : iz.c(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new iz(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
