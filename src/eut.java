import java.util.Map;

public class eut {
   private static final int a = 32;
   static final iw b = new iw(4, 0, 15);
   private static final alk[] c = new alk[]{
      alk.b("shipwreck/with_mast"),
      alk.b("shipwreck/sideways_full"),
      alk.b("shipwreck/sideways_fronthalf"),
      alk.b("shipwreck/sideways_backhalf"),
      alk.b("shipwreck/rightsideup_full"),
      alk.b("shipwreck/rightsideup_fronthalf"),
      alk.b("shipwreck/rightsideup_backhalf"),
      alk.b("shipwreck/with_mast_degraded"),
      alk.b("shipwreck/rightsideup_full_degraded"),
      alk.b("shipwreck/rightsideup_fronthalf_degraded"),
      alk.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alk[] d = new alk[]{
      alk.b("shipwreck/with_mast"),
      alk.b("shipwreck/upsidedown_full"),
      alk.b("shipwreck/upsidedown_fronthalf"),
      alk.b("shipwreck/upsidedown_backhalf"),
      alk.b("shipwreck/sideways_full"),
      alk.b("shipwreck/sideways_fronthalf"),
      alk.b("shipwreck/sideways_backhalf"),
      alk.b("shipwreck/rightsideup_full"),
      alk.b("shipwreck/rightsideup_fronthalf"),
      alk.b("shipwreck/rightsideup_backhalf"),
      alk.b("shipwreck/with_mast_degraded"),
      alk.b("shipwreck/upsidedown_full_degraded"),
      alk.b("shipwreck/upsidedown_fronthalf_degraded"),
      alk.b("shipwreck/upsidedown_backhalf_degraded"),
      alk.b("shipwreck/sideways_full_degraded"),
      alk.b("shipwreck/sideways_fronthalf_degraded"),
      alk.b("shipwreck/sideways_backhalf_degraded"),
      alk.b("shipwreck/rightsideup_full_degraded"),
      alk.b("shipwreck/rightsideup_fronthalf_degraded"),
      alk.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alj<fao>> e = Map.of("map_chest", faf.G, "treasure_chest", faf.I, "supply_chest", faf.H);

   public static eut.a a(ewg $$0, iw $$1, dty $$2, esi $$3, azz $$4, boolean $$5) {
      alk $$6 = ag.a($$5 ? c : d, $$4);
      eut.a $$7 = new eut.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends esn {
      private final boolean h;

      public a(ewg $$0, alk $$1, iw $$2, dty $$3, boolean $$4) {
         super(esu.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ewg $$0, ua $$1) {
         super(esu.ab, $$1, $$0, $$1x -> a($$1.<dty>a("Rot", dty.h).orElseThrow()));
         this.h = $$1.b("isBeached", false);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", dty.h, this.c.d());
      }

      private static ewb a(dty $$0) {
         return new ewb().a($$0).a(dsh.a).a(eut.b).a(evg.d);
      }

      @Override
      protected void a(String $$0, iw $$1, dkq $$2, azz $$3, erv $$4) {
         alj<fao> $$5 = eut.e.get($$0);
         if ($$5 != null) {
            buz.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.ao() + 1;
            int $$8 = 0;
            kb $$9 = this.b.a();
            ehf.a $$10 = this.h ? ehf.a.a : ehf.a.c;
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

      public int a(int $$0, azz $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iw(this.d.u(), $$0, this.d.w());
      }
   }
}
