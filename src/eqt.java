import java.util.Map;

public class eqt {
   private static final int a = 32;
   static final jh b = new jh(4, 0, 15);
   private static final alp[] c = new alp[]{
      alp.b("shipwreck/with_mast"),
      alp.b("shipwreck/sideways_full"),
      alp.b("shipwreck/sideways_fronthalf"),
      alp.b("shipwreck/sideways_backhalf"),
      alp.b("shipwreck/rightsideup_full"),
      alp.b("shipwreck/rightsideup_fronthalf"),
      alp.b("shipwreck/rightsideup_backhalf"),
      alp.b("shipwreck/with_mast_degraded"),
      alp.b("shipwreck/rightsideup_full_degraded"),
      alp.b("shipwreck/rightsideup_fronthalf_degraded"),
      alp.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alp[] d = new alp[]{
      alp.b("shipwreck/with_mast"),
      alp.b("shipwreck/upsidedown_full"),
      alp.b("shipwreck/upsidedown_fronthalf"),
      alp.b("shipwreck/upsidedown_backhalf"),
      alp.b("shipwreck/sideways_full"),
      alp.b("shipwreck/sideways_fronthalf"),
      alp.b("shipwreck/sideways_backhalf"),
      alp.b("shipwreck/rightsideup_full"),
      alp.b("shipwreck/rightsideup_fronthalf"),
      alp.b("shipwreck/rightsideup_backhalf"),
      alp.b("shipwreck/with_mast_degraded"),
      alp.b("shipwreck/upsidedown_full_degraded"),
      alp.b("shipwreck/upsidedown_fronthalf_degraded"),
      alp.b("shipwreck/upsidedown_backhalf_degraded"),
      alp.b("shipwreck/sideways_full_degraded"),
      alp.b("shipwreck/sideways_fronthalf_degraded"),
      alp.b("shipwreck/sideways_backhalf_degraded"),
      alp.b("shipwreck/rightsideup_full_degraded"),
      alp.b("shipwreck/rightsideup_fronthalf_degraded"),
      alp.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alo<ewn>> e = Map.of("map_chest", ewe.G, "treasure_chest", ewe.I, "supply_chest", ewe.H);

   public static eqt.a a(esg $$0, jh $$1, dqv $$2, eoi $$3, bac $$4, boolean $$5) {
      alp $$6 = ae.a($$5 ? c : d, $$4);
      eqt.a $$7 = new eqt.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends eon {
      private final boolean h;

      public a(esg $$0, alp $$1, jh $$2, dqv $$3, boolean $$4) {
         super(eou.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(esg $$0, um $$1) {
         super(eou.ab, $$1, $$0, $$1x -> a(dqv.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eot $$0, um $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static esb a(dqv $$0) {
         return new esb().a($$0).a(dpc.a).a(eqt.b).a(erg.d);
      }

      @Override
      protected void a(String $$0, jh $$1, dhq $$2, bac $$3, env $$4) {
         alo<ewn> $$5 = eqt.e.get($$0);
         if ($$5 != null) {
            btg.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dhx $$0, dhv $$1, dzk $$2, bac $$3, env $$4, dgf $$5, jh $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.an() + 1;
            int $$8 = 0;
            kl $$9 = this.b.a();
            edj.a $$10 = this.h ? edj.a.a : edj.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               jh $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (jh $$13 : jh.c(this.d, $$12)) {
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
         kl $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, bac $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jh(this.d.u(), $$0, this.d.w());
      }
   }
}
