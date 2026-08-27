import java.util.Map;

public class eab {
   static final hx a = new hx(4, 0, 15);
   private static final agm[] b = new agm[]{
      new agm("shipwreck/with_mast"),
      new agm("shipwreck/sideways_full"),
      new agm("shipwreck/sideways_fronthalf"),
      new agm("shipwreck/sideways_backhalf"),
      new agm("shipwreck/rightsideup_full"),
      new agm("shipwreck/rightsideup_fronthalf"),
      new agm("shipwreck/rightsideup_backhalf"),
      new agm("shipwreck/with_mast_degraded"),
      new agm("shipwreck/rightsideup_full_degraded"),
      new agm("shipwreck/rightsideup_fronthalf_degraded"),
      new agm("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final agm[] c = new agm[]{
      new agm("shipwreck/with_mast"),
      new agm("shipwreck/upsidedown_full"),
      new agm("shipwreck/upsidedown_fronthalf"),
      new agm("shipwreck/upsidedown_backhalf"),
      new agm("shipwreck/sideways_full"),
      new agm("shipwreck/sideways_fronthalf"),
      new agm("shipwreck/sideways_backhalf"),
      new agm("shipwreck/rightsideup_full"),
      new agm("shipwreck/rightsideup_fronthalf"),
      new agm("shipwreck/rightsideup_backhalf"),
      new agm("shipwreck/with_mast_degraded"),
      new agm("shipwreck/upsidedown_full_degraded"),
      new agm("shipwreck/upsidedown_fronthalf_degraded"),
      new agm("shipwreck/upsidedown_backhalf_degraded"),
      new agm("shipwreck/sideways_full_degraded"),
      new agm("shipwreck/sideways_fronthalf_degraded"),
      new agm("shipwreck/sideways_backhalf_degraded"),
      new agm("shipwreck/rightsideup_full_degraded"),
      new agm("shipwreck/rightsideup_fronthalf_degraded"),
      new agm("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, agm> d = Map.of("map_chest", efa.H, "treasure_chest", efa.J, "supply_chest", efa.I);

   public static void a(ebn $$0, hx $$1, dbr $$2, dxr $$3, atw $$4, boolean $$5) {
      agm $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eab.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dxw {
      private final boolean h;

      public a(ebn $$0, agm $$1, hx $$2, dbr $$3, boolean $$4) {
         super(dyd.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ebn $$0, sd $$1) {
         super(dyd.ab, $$1, $$0, $$1x -> a(dbr.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ebi a(dbr $$0) {
         return new ebi().a($$0).a(dab.a).a(eab.a).a(eao.d);
      }

      @Override
      protected void a(String $$0, hx $$1, csu $$2, atw $$3, dxe $$4) {
         agm $$5 = eab.d.get($$0);
         if ($$5 != null) {
            bji.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         int $$7 = $$0.ak();
         int $$8 = 0;
         ja $$9 = this.b.a();
         dmw.a $$10 = this.h ? dmw.a.a : dmw.a.c;
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
