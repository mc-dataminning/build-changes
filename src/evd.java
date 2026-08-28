import java.util.Map;

public class evd {
   private static final int a = 32;
   static final iw b = new iw(4, 0, 15);
   private static final alr[] c = new alr[]{
      alr.b("shipwreck/with_mast"),
      alr.b("shipwreck/sideways_full"),
      alr.b("shipwreck/sideways_fronthalf"),
      alr.b("shipwreck/sideways_backhalf"),
      alr.b("shipwreck/rightsideup_full"),
      alr.b("shipwreck/rightsideup_fronthalf"),
      alr.b("shipwreck/rightsideup_backhalf"),
      alr.b("shipwreck/with_mast_degraded"),
      alr.b("shipwreck/rightsideup_full_degraded"),
      alr.b("shipwreck/rightsideup_fronthalf_degraded"),
      alr.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alr[] d = new alr[]{
      alr.b("shipwreck/with_mast"),
      alr.b("shipwreck/upsidedown_full"),
      alr.b("shipwreck/upsidedown_fronthalf"),
      alr.b("shipwreck/upsidedown_backhalf"),
      alr.b("shipwreck/sideways_full"),
      alr.b("shipwreck/sideways_fronthalf"),
      alr.b("shipwreck/sideways_backhalf"),
      alr.b("shipwreck/rightsideup_full"),
      alr.b("shipwreck/rightsideup_fronthalf"),
      alr.b("shipwreck/rightsideup_backhalf"),
      alr.b("shipwreck/with_mast_degraded"),
      alr.b("shipwreck/upsidedown_full_degraded"),
      alr.b("shipwreck/upsidedown_fronthalf_degraded"),
      alr.b("shipwreck/upsidedown_backhalf_degraded"),
      alr.b("shipwreck/sideways_full_degraded"),
      alr.b("shipwreck/sideways_fronthalf_degraded"),
      alr.b("shipwreck/sideways_backhalf_degraded"),
      alr.b("shipwreck/rightsideup_full_degraded"),
      alr.b("shipwreck/rightsideup_fronthalf_degraded"),
      alr.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alq<fay>> e = Map.of("map_chest", fap.G, "treasure_chest", fap.I, "supply_chest", fap.H);

   public static evd.a a(ewq $$0, iw $$1, dui $$2, ess $$3, bai $$4, boolean $$5) {
      alr $$6 = ag.a($$5 ? c : d, $$4);
      evd.a $$7 = new evd.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends esx {
      private final boolean h;

      public a(ewq $$0, alr $$1, iw $$2, dui $$3, boolean $$4) {
         super(ete.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ewq $$0, ua $$1) {
         super(ete.ab, $$1, $$0, $$1x -> a($$1.<dui>a("Rot", dui.h).orElseThrow()));
         this.h = $$1.b("isBeached", false);
      }

      @Override
      protected void a(etd $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", dui.h, this.c.d());
      }

      private static ewl a(dui $$0) {
         return new ewl().a($$0).a(dsr.a).a(evd.b).a(evq.d);
      }

      @Override
      protected void a(String $$0, iw $$1, dla $$2, bai $$3, esf $$4) {
         alq<fay> $$5 = evd.e.get($$0);
         if ($$5 != null) {
            bvi.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dli $$0, dlf $$1, edo $$2, bai $$3, esf $$4, djo $$5, iw $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.ao() + 1;
            int $$8 = 0;
            kb $$9 = this.b.a();
            ehp.a $$10 = this.h ? ehp.a.a : ehp.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               iw $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (iw $$13 : iw.c(this.d, $$12)) {
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
         kb $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, bai $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iw(this.d.u(), $$0, this.d.w());
      }
   }
}
