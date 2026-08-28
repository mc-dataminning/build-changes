import java.util.Map;

public class eoy {
   private static final int a = 32;
   static final jh b = new jh(4, 0, 15);
   private static final alj[] c = new alj[]{
      alj.b("shipwreck/with_mast"),
      alj.b("shipwreck/sideways_full"),
      alj.b("shipwreck/sideways_fronthalf"),
      alj.b("shipwreck/sideways_backhalf"),
      alj.b("shipwreck/rightsideup_full"),
      alj.b("shipwreck/rightsideup_fronthalf"),
      alj.b("shipwreck/rightsideup_backhalf"),
      alj.b("shipwreck/with_mast_degraded"),
      alj.b("shipwreck/rightsideup_full_degraded"),
      alj.b("shipwreck/rightsideup_fronthalf_degraded"),
      alj.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alj[] d = new alj[]{
      alj.b("shipwreck/with_mast"),
      alj.b("shipwreck/upsidedown_full"),
      alj.b("shipwreck/upsidedown_fronthalf"),
      alj.b("shipwreck/upsidedown_backhalf"),
      alj.b("shipwreck/sideways_full"),
      alj.b("shipwreck/sideways_fronthalf"),
      alj.b("shipwreck/sideways_backhalf"),
      alj.b("shipwreck/rightsideup_full"),
      alj.b("shipwreck/rightsideup_fronthalf"),
      alj.b("shipwreck/rightsideup_backhalf"),
      alj.b("shipwreck/with_mast_degraded"),
      alj.b("shipwreck/upsidedown_full_degraded"),
      alj.b("shipwreck/upsidedown_fronthalf_degraded"),
      alj.b("shipwreck/upsidedown_backhalf_degraded"),
      alj.b("shipwreck/sideways_full_degraded"),
      alj.b("shipwreck/sideways_fronthalf_degraded"),
      alj.b("shipwreck/sideways_backhalf_degraded"),
      alj.b("shipwreck/rightsideup_full_degraded"),
      alj.b("shipwreck/rightsideup_fronthalf_degraded"),
      alj.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ali<eus>> e = Map.of("map_chest", euj.G, "treasure_chest", euj.I, "supply_chest", euj.H);

   public static eoy.a a(eql $$0, jh $$1, dpd $$2, emn $$3, azu $$4, boolean $$5) {
      alj $$6 = ae.a($$5 ? c : d, $$4);
      eoy.a $$7 = new eoy.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends ems {
      private final boolean h;

      public a(eql $$0, alj $$1, jh $$2, dpd $$3, boolean $$4) {
         super(emz.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eql $$0, ul $$1) {
         super(emz.ab, $$1, $$0, $$1x -> a(dpd.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(emy $$0, ul $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static eqg a(dpd $$0) {
         return new eqg().a($$0).a(dnm.a).a(eoy.b).a(epl.d);
      }

      @Override
      protected void a(String $$0, jh $$1, dgd $$2, azu $$3, ema $$4) {
         ali<eus> $$5 = eoy.e.get($$0);
         if ($$5 != null) {
            bsq.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dgk $$0, dgi $$1, dxr $$2, azu $$3, ema $$4, des $$5, jh $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.al() + 1;
            int $$8 = 0;
            kl $$9 = this.b.a();
            ebq.a $$10 = this.h ? ebq.a.a : ebq.a.c;
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

      public int a(int $$0, azu $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jh(this.d.u(), $$0, this.d.w());
      }
   }
}
