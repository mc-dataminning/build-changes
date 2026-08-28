import java.util.Map;

public class eon {
   private static final int a = 32;
   static final jh b = new jh(4, 0, 15);
   private static final ali[] c = new ali[]{
      ali.b("shipwreck/with_mast"),
      ali.b("shipwreck/sideways_full"),
      ali.b("shipwreck/sideways_fronthalf"),
      ali.b("shipwreck/sideways_backhalf"),
      ali.b("shipwreck/rightsideup_full"),
      ali.b("shipwreck/rightsideup_fronthalf"),
      ali.b("shipwreck/rightsideup_backhalf"),
      ali.b("shipwreck/with_mast_degraded"),
      ali.b("shipwreck/rightsideup_full_degraded"),
      ali.b("shipwreck/rightsideup_fronthalf_degraded"),
      ali.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ali[] d = new ali[]{
      ali.b("shipwreck/with_mast"),
      ali.b("shipwreck/upsidedown_full"),
      ali.b("shipwreck/upsidedown_fronthalf"),
      ali.b("shipwreck/upsidedown_backhalf"),
      ali.b("shipwreck/sideways_full"),
      ali.b("shipwreck/sideways_fronthalf"),
      ali.b("shipwreck/sideways_backhalf"),
      ali.b("shipwreck/rightsideup_full"),
      ali.b("shipwreck/rightsideup_fronthalf"),
      ali.b("shipwreck/rightsideup_backhalf"),
      ali.b("shipwreck/with_mast_degraded"),
      ali.b("shipwreck/upsidedown_full_degraded"),
      ali.b("shipwreck/upsidedown_fronthalf_degraded"),
      ali.b("shipwreck/upsidedown_backhalf_degraded"),
      ali.b("shipwreck/sideways_full_degraded"),
      ali.b("shipwreck/sideways_fronthalf_degraded"),
      ali.b("shipwreck/sideways_backhalf_degraded"),
      ali.b("shipwreck/rightsideup_full_degraded"),
      ali.b("shipwreck/rightsideup_fronthalf_degraded"),
      ali.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alh<euh>> e = Map.of("map_chest", ety.G, "treasure_chest", ety.I, "supply_chest", ety.H);

   public static eon.a a(eqa $$0, jh $$1, dor $$2, emc $$3, azs $$4, boolean $$5) {
      ali $$6 = ae.a($$5 ? c : d, $$4);
      eon.a $$7 = new eon.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends emh {
      private final boolean h;

      public a(eqa $$0, ali $$1, jh $$2, dor $$3, boolean $$4) {
         super(emo.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eqa $$0, uk $$1) {
         super(emo.ab, $$1, $$0, $$1x -> a(dor.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(emn $$0, uk $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static epv a(dor $$0) {
         return new epv().a($$0).a(dna.a).a(eon.b).a(epa.d);
      }

      @Override
      protected void a(String $$0, jh $$1, dfr $$2, azs $$3, elp $$4) {
         alh<euh> $$5 = eon.e.get($$0);
         if ($$5 != null) {
            bsj.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.al() + 1;
            int $$8 = 0;
            kl $$9 = this.b.a();
            ebf.a $$10 = this.h ? ebf.a.a : ebf.a.c;
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

      public int a(int $$0, azs $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jh(this.d.u(), $$0, this.d.w());
      }
   }
}
