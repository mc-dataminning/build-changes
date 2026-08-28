import java.util.Map;

public class emc {
   private static final int a = 32;
   static final jd b = new jd(4, 0, 15);
   private static final akq[] c = new akq[]{
      akq.b("shipwreck/with_mast"),
      akq.b("shipwreck/sideways_full"),
      akq.b("shipwreck/sideways_fronthalf"),
      akq.b("shipwreck/sideways_backhalf"),
      akq.b("shipwreck/rightsideup_full"),
      akq.b("shipwreck/rightsideup_fronthalf"),
      akq.b("shipwreck/rightsideup_backhalf"),
      akq.b("shipwreck/with_mast_degraded"),
      akq.b("shipwreck/rightsideup_full_degraded"),
      akq.b("shipwreck/rightsideup_fronthalf_degraded"),
      akq.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akq[] d = new akq[]{
      akq.b("shipwreck/with_mast"),
      akq.b("shipwreck/upsidedown_full"),
      akq.b("shipwreck/upsidedown_fronthalf"),
      akq.b("shipwreck/upsidedown_backhalf"),
      akq.b("shipwreck/sideways_full"),
      akq.b("shipwreck/sideways_fronthalf"),
      akq.b("shipwreck/sideways_backhalf"),
      akq.b("shipwreck/rightsideup_full"),
      akq.b("shipwreck/rightsideup_fronthalf"),
      akq.b("shipwreck/rightsideup_backhalf"),
      akq.b("shipwreck/with_mast_degraded"),
      akq.b("shipwreck/upsidedown_full_degraded"),
      akq.b("shipwreck/upsidedown_fronthalf_degraded"),
      akq.b("shipwreck/upsidedown_backhalf_degraded"),
      akq.b("shipwreck/sideways_full_degraded"),
      akq.b("shipwreck/sideways_fronthalf_degraded"),
      akq.b("shipwreck/sideways_backhalf_degraded"),
      akq.b("shipwreck/rightsideup_full_degraded"),
      akq.b("shipwreck/rightsideup_fronthalf_degraded"),
      akq.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akp<erq>> e = Map.of("map_chest", erh.H, "treasure_chest", erh.J, "supply_chest", erh.I);

   public static emc.a a(eno $$0, jd $$1, dmk $$2, ejr $$3, ayv $$4, boolean $$5) {
      akq $$6 = ad.a($$5 ? c : d, $$4);
      emc.a $$7 = new emc.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends ejw {
      private final boolean h;

      public a(eno $$0, akq $$1, jd $$2, dmk $$3, boolean $$4) {
         super(ekd.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eno $$0, ua $$1) {
         super(ekd.ab, $$1, $$0, $$1x -> a(dmk.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static enj a(dmk $$0) {
         return new enj().a($$0).a(dkt.a).a(emc.b).a(emp.d);
      }

      @Override
      protected void a(String $$0, jd $$1, ddj $$2, ayv $$3, eje $$4) {
         akp<erq> $$5 = emc.e.get($$0);
         if ($$5 != null) {
            bqy.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.am();
            int $$8 = 0;
            kh $$9 = this.b.a();
            dyv.a $$10 = this.h ? dyv.a.a : dyv.a.c;
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

      public int a(int $$0, ayv $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jd(this.d.u(), $$0, this.d.w());
      }
   }
}
