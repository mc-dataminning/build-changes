import java.util.Map;

public class emi {
   static final ir a = new ir(4, 0, 15);
   private static final akt[] b = new akt[]{
      new akt("shipwreck/with_mast"),
      new akt("shipwreck/sideways_full"),
      new akt("shipwreck/sideways_fronthalf"),
      new akt("shipwreck/sideways_backhalf"),
      new akt("shipwreck/rightsideup_full"),
      new akt("shipwreck/rightsideup_fronthalf"),
      new akt("shipwreck/rightsideup_backhalf"),
      new akt("shipwreck/with_mast_degraded"),
      new akt("shipwreck/rightsideup_full_degraded"),
      new akt("shipwreck/rightsideup_fronthalf_degraded"),
      new akt("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akt[] c = new akt[]{
      new akt("shipwreck/with_mast"),
      new akt("shipwreck/upsidedown_full"),
      new akt("shipwreck/upsidedown_fronthalf"),
      new akt("shipwreck/upsidedown_backhalf"),
      new akt("shipwreck/sideways_full"),
      new akt("shipwreck/sideways_fronthalf"),
      new akt("shipwreck/sideways_backhalf"),
      new akt("shipwreck/rightsideup_full"),
      new akt("shipwreck/rightsideup_fronthalf"),
      new akt("shipwreck/rightsideup_backhalf"),
      new akt("shipwreck/with_mast_degraded"),
      new akt("shipwreck/upsidedown_full_degraded"),
      new akt("shipwreck/upsidedown_fronthalf_degraded"),
      new akt("shipwreck/upsidedown_backhalf_degraded"),
      new akt("shipwreck/sideways_full_degraded"),
      new akt("shipwreck/sideways_fronthalf_degraded"),
      new akt("shipwreck/sideways_backhalf_degraded"),
      new akt("shipwreck/rightsideup_full_degraded"),
      new akt("shipwreck/rightsideup_fronthalf_degraded"),
      new akt("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aks<eru>> d = Map.of("map_chest", ern.J, "treasure_chest", ern.L, "supply_chest", ern.K);

   public static void a(enu $$0, ir $$1, dmd $$2, ejy $$3, ayt $$4, boolean $$5) {
      akt $$6 = ad.a($$5 ? b : c, $$4);
      $$3.a(new emi.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends ekd {
      private final boolean h;

      public a(enu $$0, akt $$1, ir $$2, dmd $$3, boolean $$4) {
         super(ekk.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(enu $$0, uk $$1) {
         super(ekk.ab, $$1, $$0, $$1x -> a(dmd.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ekj $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static enp a(dmd $$0) {
         return new enp().a($$0).a(dke.a).a(emi.a).a(emv.d);
      }

      @Override
      protected void a(String $$0, ir $$1, dcp $$2, ayt $$3, ejl $$4) {
         aks<eru> $$5 = emi.d.get($$0);
         if ($$5 != null) {
            bqi.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dcv $$0, dct $$1, duz $$2, ayt $$3, ejl $$4, dbh $$5, ir $$6) {
         int $$7 = $$0.am();
         int $$8 = 0;
         jv $$9 = this.b.a();
         dyu.a $$10 = this.h ? dyu.a.a : dyu.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            ir $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (ir $$13 : ir.c(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new ir(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
