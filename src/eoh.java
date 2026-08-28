import java.util.Map;

public class eoh {
   private static final int a = 32;
   static final jg b = new jg(4, 0, 15);
   private static final alh[] c = new alh[]{
      alh.b("shipwreck/with_mast"),
      alh.b("shipwreck/sideways_full"),
      alh.b("shipwreck/sideways_fronthalf"),
      alh.b("shipwreck/sideways_backhalf"),
      alh.b("shipwreck/rightsideup_full"),
      alh.b("shipwreck/rightsideup_fronthalf"),
      alh.b("shipwreck/rightsideup_backhalf"),
      alh.b("shipwreck/with_mast_degraded"),
      alh.b("shipwreck/rightsideup_full_degraded"),
      alh.b("shipwreck/rightsideup_fronthalf_degraded"),
      alh.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alh[] d = new alh[]{
      alh.b("shipwreck/with_mast"),
      alh.b("shipwreck/upsidedown_full"),
      alh.b("shipwreck/upsidedown_fronthalf"),
      alh.b("shipwreck/upsidedown_backhalf"),
      alh.b("shipwreck/sideways_full"),
      alh.b("shipwreck/sideways_fronthalf"),
      alh.b("shipwreck/sideways_backhalf"),
      alh.b("shipwreck/rightsideup_full"),
      alh.b("shipwreck/rightsideup_fronthalf"),
      alh.b("shipwreck/rightsideup_backhalf"),
      alh.b("shipwreck/with_mast_degraded"),
      alh.b("shipwreck/upsidedown_full_degraded"),
      alh.b("shipwreck/upsidedown_fronthalf_degraded"),
      alh.b("shipwreck/upsidedown_backhalf_degraded"),
      alh.b("shipwreck/sideways_full_degraded"),
      alh.b("shipwreck/sideways_fronthalf_degraded"),
      alh.b("shipwreck/sideways_backhalf_degraded"),
      alh.b("shipwreck/rightsideup_full_degraded"),
      alh.b("shipwreck/rightsideup_fronthalf_degraded"),
      alh.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alg<eub>> e = Map.of("map_chest", ets.G, "treasure_chest", ets.I, "supply_chest", ets.H);

   public static eoh.a a(epu $$0, jg $$1, dol $$2, elw $$3, azr $$4, boolean $$5) {
      alh $$6 = ad.a($$5 ? c : d, $$4);
      eoh.a $$7 = new eoh.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends emb {
      private final boolean h;

      public a(epu $$0, alh $$1, jg $$2, dol $$3, boolean $$4) {
         super(emi.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(epu $$0, uj $$1) {
         super(emi.ab, $$1, $$0, $$1x -> a(dol.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(emh $$0, uj $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static epp a(dol $$0) {
         return new epp().a($$0).a(dmu.a).a(eoh.b).a(eou.d);
      }

      @Override
      protected void a(String $$0, jg $$1, dfl $$2, azr $$3, elj $$4) {
         alg<eub> $$5 = eoh.e.get($$0);
         if ($$5 != null) {
            bse.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dfs $$0, dfq $$1, dxa $$2, azr $$3, elj $$4, deb $$5, jg $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.an() + 1;
            int $$8 = 0;
            kk $$9 = this.b.a();
            eaz.a $$10 = this.h ? eaz.a.a : eaz.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               jg $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (jg $$13 : jg.c(this.d, $$12)) {
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
         kk $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azr $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jg(this.d.u(), $$0, this.d.w());
      }
   }
}
