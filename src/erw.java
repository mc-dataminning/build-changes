import java.util.Map;

public class erw {
   private static final int a = 32;
   static final jj b = new jj(4, 0, 15);
   private static final ald[] c = new ald[]{
      ald.b("shipwreck/with_mast"),
      ald.b("shipwreck/sideways_full"),
      ald.b("shipwreck/sideways_fronthalf"),
      ald.b("shipwreck/sideways_backhalf"),
      ald.b("shipwreck/rightsideup_full"),
      ald.b("shipwreck/rightsideup_fronthalf"),
      ald.b("shipwreck/rightsideup_backhalf"),
      ald.b("shipwreck/with_mast_degraded"),
      ald.b("shipwreck/rightsideup_full_degraded"),
      ald.b("shipwreck/rightsideup_fronthalf_degraded"),
      ald.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ald[] d = new ald[]{
      ald.b("shipwreck/with_mast"),
      ald.b("shipwreck/upsidedown_full"),
      ald.b("shipwreck/upsidedown_fronthalf"),
      ald.b("shipwreck/upsidedown_backhalf"),
      ald.b("shipwreck/sideways_full"),
      ald.b("shipwreck/sideways_fronthalf"),
      ald.b("shipwreck/sideways_backhalf"),
      ald.b("shipwreck/rightsideup_full"),
      ald.b("shipwreck/rightsideup_fronthalf"),
      ald.b("shipwreck/rightsideup_backhalf"),
      ald.b("shipwreck/with_mast_degraded"),
      ald.b("shipwreck/upsidedown_full_degraded"),
      ald.b("shipwreck/upsidedown_fronthalf_degraded"),
      ald.b("shipwreck/upsidedown_backhalf_degraded"),
      ald.b("shipwreck/sideways_full_degraded"),
      ald.b("shipwreck/sideways_fronthalf_degraded"),
      ald.b("shipwreck/sideways_backhalf_degraded"),
      ald.b("shipwreck/rightsideup_full_degraded"),
      ald.b("shipwreck/rightsideup_fronthalf_degraded"),
      ald.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alc<exq>> e = Map.of("map_chest", exh.G, "treasure_chest", exh.I, "supply_chest", exh.H);

   public static erw.a a(etj $$0, jj $$1, drm $$2, epl $$3, azs $$4, boolean $$5) {
      ald $$6 = af.a($$5 ? c : d, $$4);
      erw.a $$7 = new erw.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends epq {
      private final boolean h;

      public a(etj $$0, ald $$1, jj $$2, drm $$3, boolean $$4) {
         super(epx.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(etj $$0, tw $$1) {
         super(epx.ab, $$1, $$0, $$1x -> a(drm.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(epw $$0, tw $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ete a(drm $$0) {
         return new ete().a($$0).a(dpv.a).a(erw.b).a(esj.d);
      }

      @Override
      protected void a(String $$0, jj $$1, dig $$2, azs $$3, eoy $$4) {
         alc<exq> $$5 = erw.e.get($$0);
         if ($$5 != null) {
            btw.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dio $$0, dil $$1, eak $$2, azs $$3, eoy $$4, dgw $$5, jj $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.ao() + 1;
            int $$8 = 0;
            kn $$9 = this.b.a();
            eel.a $$10 = this.h ? eel.a.a : eel.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               jj $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (jj $$13 : jj.c(this.d, $$12)) {
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
         kn $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azs $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jj(this.d.u(), $$0, this.d.w());
      }
   }
}
