import java.util.Map;

public class emh {
   private static final int a = 32;
   static final jd b = new jd(4, 0, 15);
   private static final akr[] c = new akr[]{
      akr.b("shipwreck/with_mast"),
      akr.b("shipwreck/sideways_full"),
      akr.b("shipwreck/sideways_fronthalf"),
      akr.b("shipwreck/sideways_backhalf"),
      akr.b("shipwreck/rightsideup_full"),
      akr.b("shipwreck/rightsideup_fronthalf"),
      akr.b("shipwreck/rightsideup_backhalf"),
      akr.b("shipwreck/with_mast_degraded"),
      akr.b("shipwreck/rightsideup_full_degraded"),
      akr.b("shipwreck/rightsideup_fronthalf_degraded"),
      akr.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akr[] d = new akr[]{
      akr.b("shipwreck/with_mast"),
      akr.b("shipwreck/upsidedown_full"),
      akr.b("shipwreck/upsidedown_fronthalf"),
      akr.b("shipwreck/upsidedown_backhalf"),
      akr.b("shipwreck/sideways_full"),
      akr.b("shipwreck/sideways_fronthalf"),
      akr.b("shipwreck/sideways_backhalf"),
      akr.b("shipwreck/rightsideup_full"),
      akr.b("shipwreck/rightsideup_fronthalf"),
      akr.b("shipwreck/rightsideup_backhalf"),
      akr.b("shipwreck/with_mast_degraded"),
      akr.b("shipwreck/upsidedown_full_degraded"),
      akr.b("shipwreck/upsidedown_fronthalf_degraded"),
      akr.b("shipwreck/upsidedown_backhalf_degraded"),
      akr.b("shipwreck/sideways_full_degraded"),
      akr.b("shipwreck/sideways_fronthalf_degraded"),
      akr.b("shipwreck/sideways_backhalf_degraded"),
      akr.b("shipwreck/rightsideup_full_degraded"),
      akr.b("shipwreck/rightsideup_fronthalf_degraded"),
      akr.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akq<erw>> e = Map.of("map_chest", ern.H, "treasure_chest", ern.J, "supply_chest", ern.I);

   public static emh.a a(enu $$0, jd $$1, dmm $$2, ejw $$3, ayw $$4, boolean $$5) {
      akr $$6 = ad.a($$5 ? c : d, $$4);
      emh.a $$7 = new emh.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends ekb {
      private final boolean h;

      public a(enu $$0, akr $$1, jd $$2, dmm $$3, boolean $$4) {
         super(eki.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(enu $$0, ub $$1) {
         super(eki.ab, $$1, $$0, $$1x -> a(dmm.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ekh $$0, ub $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static enp a(dmm $$0) {
         return new enp().a($$0).a(dkv.a).a(emh.b).a(emu.d);
      }

      @Override
      protected void a(String $$0, jd $$1, ddl $$2, ayw $$3, ejj $$4) {
         akq<erw> $$5 = emh.e.get($$0);
         if ($$5 != null) {
            bqz.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dds $$0, ddq $$1, duz $$2, ayw $$3, ejj $$4, dcd $$5, jd $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.am();
            int $$8 = 0;
            kh $$9 = this.b.a();
            dyy.a $$10 = this.h ? dyy.a.a : dyy.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               jd $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (jd $$13 : jd.c(this.d, $$12)) {
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
         kh $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, ayw $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jd(this.d.u(), $$0, this.d.w());
      }
   }
}
