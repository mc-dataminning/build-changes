import java.util.Map;

public class eor {
   private static final int a = 32;
   static final jh b = new jh(4, 0, 15);
   private static final all[] c = new all[]{
      all.b("shipwreck/with_mast"),
      all.b("shipwreck/sideways_full"),
      all.b("shipwreck/sideways_fronthalf"),
      all.b("shipwreck/sideways_backhalf"),
      all.b("shipwreck/rightsideup_full"),
      all.b("shipwreck/rightsideup_fronthalf"),
      all.b("shipwreck/rightsideup_backhalf"),
      all.b("shipwreck/with_mast_degraded"),
      all.b("shipwreck/rightsideup_full_degraded"),
      all.b("shipwreck/rightsideup_fronthalf_degraded"),
      all.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final all[] d = new all[]{
      all.b("shipwreck/with_mast"),
      all.b("shipwreck/upsidedown_full"),
      all.b("shipwreck/upsidedown_fronthalf"),
      all.b("shipwreck/upsidedown_backhalf"),
      all.b("shipwreck/sideways_full"),
      all.b("shipwreck/sideways_fronthalf"),
      all.b("shipwreck/sideways_backhalf"),
      all.b("shipwreck/rightsideup_full"),
      all.b("shipwreck/rightsideup_fronthalf"),
      all.b("shipwreck/rightsideup_backhalf"),
      all.b("shipwreck/with_mast_degraded"),
      all.b("shipwreck/upsidedown_full_degraded"),
      all.b("shipwreck/upsidedown_fronthalf_degraded"),
      all.b("shipwreck/upsidedown_backhalf_degraded"),
      all.b("shipwreck/sideways_full_degraded"),
      all.b("shipwreck/sideways_fronthalf_degraded"),
      all.b("shipwreck/sideways_backhalf_degraded"),
      all.b("shipwreck/rightsideup_full_degraded"),
      all.b("shipwreck/rightsideup_fronthalf_degraded"),
      all.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alk<eul>> e = Map.of("map_chest", euc.G, "treasure_chest", euc.I, "supply_chest", euc.H);

   public static eor.a a(eqe $$0, jh $$1, dow $$2, emg $$3, azv $$4, boolean $$5) {
      all $$6 = ae.a($$5 ? c : d, $$4);
      eor.a $$7 = new eor.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends eml {
      private final boolean h;

      public a(eqe $$0, all $$1, jh $$2, dow $$3, boolean $$4) {
         super(ems.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eqe $$0, un $$1) {
         super(ems.ab, $$1, $$0, $$1x -> a(dow.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(emr $$0, un $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static epz a(dow $$0) {
         return new epz().a($$0).a(dnf.a).a(eor.b).a(epe.d);
      }

      @Override
      protected void a(String $$0, jh $$1, dfw $$2, azv $$3, elt $$4) {
         alk<eul> $$5 = eor.e.get($$0);
         if ($$5 != null) {
            bsn.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.al() + 1;
            int $$8 = 0;
            kl $$9 = this.b.a();
            ebj.a $$10 = this.h ? ebj.a.a : ebj.a.c;
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

      public int a(int $$0, azv $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jh(this.d.u(), $$0, this.d.w());
      }
   }
}
