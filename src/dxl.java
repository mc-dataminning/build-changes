import java.util.Map;

public class dxl {
   static final gw a = new gw(4, 0, 15);
   private static final aeu[] b = new aeu[]{
      new aeu("shipwreck/with_mast"),
      new aeu("shipwreck/sideways_full"),
      new aeu("shipwreck/sideways_fronthalf"),
      new aeu("shipwreck/sideways_backhalf"),
      new aeu("shipwreck/rightsideup_full"),
      new aeu("shipwreck/rightsideup_fronthalf"),
      new aeu("shipwreck/rightsideup_backhalf"),
      new aeu("shipwreck/with_mast_degraded"),
      new aeu("shipwreck/rightsideup_full_degraded"),
      new aeu("shipwreck/rightsideup_fronthalf_degraded"),
      new aeu("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aeu[] c = new aeu[]{
      new aeu("shipwreck/with_mast"),
      new aeu("shipwreck/upsidedown_full"),
      new aeu("shipwreck/upsidedown_fronthalf"),
      new aeu("shipwreck/upsidedown_backhalf"),
      new aeu("shipwreck/sideways_full"),
      new aeu("shipwreck/sideways_fronthalf"),
      new aeu("shipwreck/sideways_backhalf"),
      new aeu("shipwreck/rightsideup_full"),
      new aeu("shipwreck/rightsideup_fronthalf"),
      new aeu("shipwreck/rightsideup_backhalf"),
      new aeu("shipwreck/with_mast_degraded"),
      new aeu("shipwreck/upsidedown_full_degraded"),
      new aeu("shipwreck/upsidedown_fronthalf_degraded"),
      new aeu("shipwreck/upsidedown_backhalf_degraded"),
      new aeu("shipwreck/sideways_full_degraded"),
      new aeu("shipwreck/sideways_fronthalf_degraded"),
      new aeu("shipwreck/sideways_backhalf_degraded"),
      new aeu("shipwreck/rightsideup_full_degraded"),
      new aeu("shipwreck/rightsideup_fronthalf_degraded"),
      new aeu("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aeu> d = Map.of("map_chest", ecj.H, "treasure_chest", ecj.J, "supply_chest", ecj.I);

   public static void a(dyx $$0, gw $$1, czc $$2, dvi $$3, arx $$4, boolean $$5) {
      aeu $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dxl.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dvn {
      private final boolean h;

      public a(dyx $$0, aeu $$1, gw $$2, czc $$3, boolean $$4) {
         super(dvu.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dyx $$0, qu $$1) {
         super(dvu.ab, $$1, $$0, $$1x -> a(czc.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dys a(czc $$0) {
         return new dys().a($$0).a(cxl.a).a(dxl.a).a(dxy.d);
      }

      @Override
      protected void a(String $$0, gw $$1, cqf $$2, arx $$3, duv $$4) {
         aeu $$5 = dxl.d.get($$0);
         if ($$5 != null) {
            ddt.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         ib $$9 = this.b.a();
         dkn.a $$10 = this.h ? dkn.a.a : dkn.a.c;
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
