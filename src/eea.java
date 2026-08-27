import java.util.Map;

public class eea {
   static final hz a = new hz(4, 0, 15);
   private static final aiy[] b = new aiy[]{
      new aiy("shipwreck/with_mast"),
      new aiy("shipwreck/sideways_full"),
      new aiy("shipwreck/sideways_fronthalf"),
      new aiy("shipwreck/sideways_backhalf"),
      new aiy("shipwreck/rightsideup_full"),
      new aiy("shipwreck/rightsideup_fronthalf"),
      new aiy("shipwreck/rightsideup_backhalf"),
      new aiy("shipwreck/with_mast_degraded"),
      new aiy("shipwreck/rightsideup_full_degraded"),
      new aiy("shipwreck/rightsideup_fronthalf_degraded"),
      new aiy("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aiy[] c = new aiy[]{
      new aiy("shipwreck/with_mast"),
      new aiy("shipwreck/upsidedown_full"),
      new aiy("shipwreck/upsidedown_fronthalf"),
      new aiy("shipwreck/upsidedown_backhalf"),
      new aiy("shipwreck/sideways_full"),
      new aiy("shipwreck/sideways_fronthalf"),
      new aiy("shipwreck/sideways_backhalf"),
      new aiy("shipwreck/rightsideup_full"),
      new aiy("shipwreck/rightsideup_fronthalf"),
      new aiy("shipwreck/rightsideup_backhalf"),
      new aiy("shipwreck/with_mast_degraded"),
      new aiy("shipwreck/upsidedown_full_degraded"),
      new aiy("shipwreck/upsidedown_fronthalf_degraded"),
      new aiy("shipwreck/upsidedown_backhalf_degraded"),
      new aiy("shipwreck/sideways_full_degraded"),
      new aiy("shipwreck/sideways_fronthalf_degraded"),
      new aiy("shipwreck/sideways_backhalf_degraded"),
      new aiy("shipwreck/rightsideup_full_degraded"),
      new aiy("shipwreck/rightsideup_fronthalf_degraded"),
      new aiy("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aiy> d = Map.of("map_chest", eja.H, "treasure_chest", eja.J, "supply_chest", eja.I);

   public static void a(efm $$0, hz $$1, dfe $$2, ebq $$3, awp $$4, boolean $$5) {
      aiy $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eea.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends ebv {
      private final boolean h;

      public a(efm $$0, aiy $$1, hz $$2, dfe $$3, boolean $$4) {
         super(ecc.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(efm $$0, sw $$1) {
         super(ecc.ab, $$1, $$0, $$1x -> a(dfe.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ecb $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static efh a(dfe $$0) {
         return new efh().a($$0).a(ddo.a).a(eea.a).a(een.d);
      }

      @Override
      protected void a(String $$0, hz $$1, cwg $$2, awp $$3, ebd $$4) {
         aiy $$5 = eea.d.get($$0);
         if ($$5 != null) {
            bme.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
         int $$7 = $$0.ak();
         int $$8 = 0;
         jd $$9 = this.b.a();
         dqv.a $$10 = this.h ? dqv.a.a : dqv.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            hz $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (hz $$13 : hz.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new hz(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
