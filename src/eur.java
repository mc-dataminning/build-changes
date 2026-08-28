import java.util.Map;

public class eur {
   private static final int a = 32;
   static final iv b = new iv(4, 0, 15);
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
   static final Map<String, alh<fam>> e = Map.of("map_chest", fad.G, "treasure_chest", fad.I, "supply_chest", fad.H);

   public static eur.a a(ewe $$0, iv $$1, dtw $$2, esg $$3, azx $$4, boolean $$5) {
      ali $$6 = ag.a($$5 ? c : d, $$4);
      eur.a $$7 = new eur.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends esl {
      private final boolean h;

      public a(ewe $$0, ali $$1, iv $$2, dtw $$3, boolean $$4) {
         super(ess.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ewe $$0, tz $$1) {
         super(ess.ab, $$1, $$0, $$1x -> a($$1.<dtw>a("Rot", dtw.h).orElseThrow()));
         this.h = $$1.b("isBeached", false);
      }

      @Override
      protected void a(esr $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", dtw.h, this.c.d());
      }

      private static evz a(dtw $$0) {
         return new evz().a($$0).a(dsf.a).a(eur.b).a(eve.d);
      }

      @Override
      protected void a(String $$0, iv $$1, dko $$2, azx $$3, ert $$4) {
         alh<fam> $$5 = eur.e.get($$0);
         if ($$5 != null) {
            bux.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dkw $$0, dkt $$1, edc $$2, azx $$3, ert $$4, djc $$5, iv $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.ao() + 1;
            int $$8 = 0;
            ka $$9 = this.b.a();
            ehd.a $$10 = this.h ? ehd.a.a : ehd.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               iv $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (iv $$13 : iv.c(this.d, $$12)) {
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
         ka $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azx $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iv(this.d.u(), $$0, this.d.w());
      }
   }
}
