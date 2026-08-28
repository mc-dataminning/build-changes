import java.util.Map;

public class eky {
   private static final int a = 32;
   static final iz b = new iz(4, 0, 15);
   private static final ale[] c = new ale[]{
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
   private static final ale[] d = new ale[]{
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
   static final Map<String, ald<eqm>> e = Map.of("map_chest", eqd.H, "treasure_chest", eqd.J, "supply_chest", eqd.I);

   public static eky.a a(emk $$0, iz $$1, dll $$2, eio $$3, azg $$4, boolean $$5) {
      ale $$6 = ac.a($$5 ? c : d, $$4);
      eky.a $$7 = new eky.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends eit {
      private final boolean h;

      public a(emk $$0, ale $$1, iz $$2, dll $$3, boolean $$4) {
         super(eja.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(emk $$0, ur $$1) {
         super(eja.ab, $$1, $$0, $$1x -> a(dll.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eiz $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static emf a(dll $$0) {
         return new emf().a($$0).a(djv.a).a(eky.b).a(ell.d);
      }

      @Override
      protected void a(String $$0, iz $$1, dcm $$2, azg $$3, eib $$4) {
         ald<eqm> $$5 = eky.e.get($$0);
         if ($$5 != null) {
            brb.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dcs $$0, dcq $$1, dty $$2, azg $$3, eib $$4, dbe $$5, iz $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.am();
            int $$8 = 0;
            kd $$9 = this.b.a();
            dxt.a $$10 = this.h ? dxt.a.a : dxt.a.c;
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

            this.c(this.h ? this.a($$7, $$3) : $$8);
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         }
      }

      public boolean l() {
         kd $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azg $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iz(this.d.u(), $$0, this.d.w());
      }
   }
}
