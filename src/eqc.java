import java.util.Map;

public class eqc {
   private static final int a = 32;
   static final ji b = new ji(4, 0, 15);
   private static final aku[] c = new aku[]{
      aku.b("shipwreck/with_mast"),
      aku.b("shipwreck/sideways_full"),
      aku.b("shipwreck/sideways_fronthalf"),
      aku.b("shipwreck/sideways_backhalf"),
      aku.b("shipwreck/rightsideup_full"),
      aku.b("shipwreck/rightsideup_fronthalf"),
      aku.b("shipwreck/rightsideup_backhalf"),
      aku.b("shipwreck/with_mast_degraded"),
      aku.b("shipwreck/rightsideup_full_degraded"),
      aku.b("shipwreck/rightsideup_fronthalf_degraded"),
      aku.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aku[] d = new aku[]{
      aku.b("shipwreck/with_mast"),
      aku.b("shipwreck/upsidedown_full"),
      aku.b("shipwreck/upsidedown_fronthalf"),
      aku.b("shipwreck/upsidedown_backhalf"),
      aku.b("shipwreck/sideways_full"),
      aku.b("shipwreck/sideways_fronthalf"),
      aku.b("shipwreck/sideways_backhalf"),
      aku.b("shipwreck/rightsideup_full"),
      aku.b("shipwreck/rightsideup_fronthalf"),
      aku.b("shipwreck/rightsideup_backhalf"),
      aku.b("shipwreck/with_mast_degraded"),
      aku.b("shipwreck/upsidedown_full_degraded"),
      aku.b("shipwreck/upsidedown_fronthalf_degraded"),
      aku.b("shipwreck/upsidedown_backhalf_degraded"),
      aku.b("shipwreck/sideways_full_degraded"),
      aku.b("shipwreck/sideways_fronthalf_degraded"),
      aku.b("shipwreck/sideways_backhalf_degraded"),
      aku.b("shipwreck/rightsideup_full_degraded"),
      aku.b("shipwreck/rightsideup_fronthalf_degraded"),
      aku.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akt<evw>> e = Map.of("map_chest", evn.G, "treasure_chest", evn.I, "supply_chest", evn.H);

   public static eqc.a a(erp $$0, ji $$1, dqe $$2, enr $$3, azh $$4, boolean $$5) {
      aku $$6 = af.a($$5 ? c : d, $$4);
      eqc.a $$7 = new eqc.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends enw {
      private final boolean h;

      public a(erp $$0, aku $$1, ji $$2, dqe $$3, boolean $$4) {
         super(eod.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(erp $$0, tq $$1) {
         super(eod.ab, $$1, $$0, $$1x -> a(dqe.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eoc $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static erk a(dqe $$0) {
         return new erk().a($$0).a(dol.a).a(eqc.b).a(eqp.d);
      }

      @Override
      protected void a(String $$0, ji $$1, dgz $$2, azh $$3, ene $$4) {
         akt<evw> $$5 = eqc.e.get($$0);
         if ($$5 != null) {
            bsp.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dhg $$0, dhe $$1, dyt $$2, azh $$3, ene $$4, dfo $$5, ji $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.an() + 1;
            int $$8 = 0;
            km $$9 = this.b.a();
            ecs.a $$10 = this.h ? ecs.a.a : ecs.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               ji $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (ji $$13 : ji.c(this.d, $$12)) {
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
         km $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azh $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new ji(this.d.u(), $$0, this.d.w());
      }
   }
}
