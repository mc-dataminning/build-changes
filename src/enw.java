import java.util.Map;

public class enw {
   private static final int a = 32;
   static final jf b = new jf(4, 0, 15);
   private static final ale[] c = new ale[]{
      ale.b("shipwreck/with_mast"),
      ale.b("shipwreck/sideways_full"),
      ale.b("shipwreck/sideways_fronthalf"),
      ale.b("shipwreck/sideways_backhalf"),
      ale.b("shipwreck/rightsideup_full"),
      ale.b("shipwreck/rightsideup_fronthalf"),
      ale.b("shipwreck/rightsideup_backhalf"),
      ale.b("shipwreck/with_mast_degraded"),
      ale.b("shipwreck/rightsideup_full_degraded"),
      ale.b("shipwreck/rightsideup_fronthalf_degraded"),
      ale.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ale[] d = new ale[]{
      ale.b("shipwreck/with_mast"),
      ale.b("shipwreck/upsidedown_full"),
      ale.b("shipwreck/upsidedown_fronthalf"),
      ale.b("shipwreck/upsidedown_backhalf"),
      ale.b("shipwreck/sideways_full"),
      ale.b("shipwreck/sideways_fronthalf"),
      ale.b("shipwreck/sideways_backhalf"),
      ale.b("shipwreck/rightsideup_full"),
      ale.b("shipwreck/rightsideup_fronthalf"),
      ale.b("shipwreck/rightsideup_backhalf"),
      ale.b("shipwreck/with_mast_degraded"),
      ale.b("shipwreck/upsidedown_full_degraded"),
      ale.b("shipwreck/upsidedown_fronthalf_degraded"),
      ale.b("shipwreck/upsidedown_backhalf_degraded"),
      ale.b("shipwreck/sideways_full_degraded"),
      ale.b("shipwreck/sideways_fronthalf_degraded"),
      ale.b("shipwreck/sideways_backhalf_degraded"),
      ale.b("shipwreck/rightsideup_full_degraded"),
      ale.b("shipwreck/rightsideup_fronthalf_degraded"),
      ale.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ald<etq>> e = Map.of("map_chest", eth.G, "treasure_chest", eth.I, "supply_chest", eth.H);

   public static enw.a a(epj $$0, jf $$1, doa $$2, ell $$3, azn $$4, boolean $$5) {
      ale $$6 = ad.a($$5 ? c : d, $$4);
      enw.a $$7 = new enw.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends elq {
      private final boolean h;

      public a(epj $$0, ale $$1, jf $$2, doa $$3, boolean $$4) {
         super(elx.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(epj $$0, ug $$1) {
         super(elx.ab, $$1, $$0, $$1x -> a(doa.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(elw $$0, ug $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static epe a(doa $$0) {
         return new epe().a($$0).a(dmj.a).a(enw.b).a(eoj.d);
      }

      @Override
      protected void a(String $$0, jf $$1, dez $$2, azn $$3, eky $$4) {
         ald<etq> $$5 = enw.e.get($$0);
         if ($$5 != null) {
            bry.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.an() + 1;
            int $$8 = 0;
            kj $$9 = this.b.a();
            eao.a $$10 = this.h ? eao.a.a : eao.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               jf $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (jf $$13 : jf.c(this.d, $$12)) {
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
         kj $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azn $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jf(this.d.u(), $$0, this.d.w());
      }
   }
}
