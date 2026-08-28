import java.util.Map;

public class ens {
   private static final int a = 32;
   static final je b = new je(4, 0, 15);
   private static final alc[] c = new alc[]{
      alc.b("shipwreck/with_mast"),
      alc.b("shipwreck/sideways_full"),
      alc.b("shipwreck/sideways_fronthalf"),
      alc.b("shipwreck/sideways_backhalf"),
      alc.b("shipwreck/rightsideup_full"),
      alc.b("shipwreck/rightsideup_fronthalf"),
      alc.b("shipwreck/rightsideup_backhalf"),
      alc.b("shipwreck/with_mast_degraded"),
      alc.b("shipwreck/rightsideup_full_degraded"),
      alc.b("shipwreck/rightsideup_fronthalf_degraded"),
      alc.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alc[] d = new alc[]{
      alc.b("shipwreck/with_mast"),
      alc.b("shipwreck/upsidedown_full"),
      alc.b("shipwreck/upsidedown_fronthalf"),
      alc.b("shipwreck/upsidedown_backhalf"),
      alc.b("shipwreck/sideways_full"),
      alc.b("shipwreck/sideways_fronthalf"),
      alc.b("shipwreck/sideways_backhalf"),
      alc.b("shipwreck/rightsideup_full"),
      alc.b("shipwreck/rightsideup_fronthalf"),
      alc.b("shipwreck/rightsideup_backhalf"),
      alc.b("shipwreck/with_mast_degraded"),
      alc.b("shipwreck/upsidedown_full_degraded"),
      alc.b("shipwreck/upsidedown_fronthalf_degraded"),
      alc.b("shipwreck/upsidedown_backhalf_degraded"),
      alc.b("shipwreck/sideways_full_degraded"),
      alc.b("shipwreck/sideways_fronthalf_degraded"),
      alc.b("shipwreck/sideways_backhalf_degraded"),
      alc.b("shipwreck/rightsideup_full_degraded"),
      alc.b("shipwreck/rightsideup_fronthalf_degraded"),
      alc.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alb<etm>> e = Map.of("map_chest", etd.H, "treasure_chest", etd.J, "supply_chest", etd.I);

   public static ens.a a(epf $$0, je $$1, dnx $$2, elh $$3, azl $$4, boolean $$5) {
      alc $$6 = ad.a($$5 ? c : d, $$4);
      ens.a $$7 = new ens.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends elm {
      private final boolean h;

      public a(epf $$0, alc $$1, je $$2, dnx $$3, boolean $$4) {
         super(elt.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(epf $$0, uf $$1) {
         super(elt.ab, $$1, $$0, $$1x -> a(dnx.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static epa a(dnx $$0) {
         return new epa().a($$0).a(dmg.a).a(ens.b).a(eof.d);
      }

      @Override
      protected void a(String $$0, je $$1, dew $$2, azl $$3, eku $$4) {
         alb<etm> $$5 = ens.e.get($$0);
         if ($$5 != null) {
            brv.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.an() + 1;
            int $$8 = 0;
            ki $$9 = this.b.a();
            eak.a $$10 = this.h ? eak.a.a : eak.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               je $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (je $$13 : je.c(this.d, $$12)) {
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
         ki $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azl $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new je(this.d.u(), $$0, this.d.w());
      }
   }
}
