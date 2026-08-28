import java.util.Map;

public class eqb {
   private static final int a = 32;
   static final ji b = new ji(4, 0, 15);
   private static final akv[] c = new akv[]{
      akv.b("shipwreck/with_mast"),
      akv.b("shipwreck/sideways_full"),
      akv.b("shipwreck/sideways_fronthalf"),
      akv.b("shipwreck/sideways_backhalf"),
      akv.b("shipwreck/rightsideup_full"),
      akv.b("shipwreck/rightsideup_fronthalf"),
      akv.b("shipwreck/rightsideup_backhalf"),
      akv.b("shipwreck/with_mast_degraded"),
      akv.b("shipwreck/rightsideup_full_degraded"),
      akv.b("shipwreck/rightsideup_fronthalf_degraded"),
      akv.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akv[] d = new akv[]{
      akv.b("shipwreck/with_mast"),
      akv.b("shipwreck/upsidedown_full"),
      akv.b("shipwreck/upsidedown_fronthalf"),
      akv.b("shipwreck/upsidedown_backhalf"),
      akv.b("shipwreck/sideways_full"),
      akv.b("shipwreck/sideways_fronthalf"),
      akv.b("shipwreck/sideways_backhalf"),
      akv.b("shipwreck/rightsideup_full"),
      akv.b("shipwreck/rightsideup_fronthalf"),
      akv.b("shipwreck/rightsideup_backhalf"),
      akv.b("shipwreck/with_mast_degraded"),
      akv.b("shipwreck/upsidedown_full_degraded"),
      akv.b("shipwreck/upsidedown_fronthalf_degraded"),
      akv.b("shipwreck/upsidedown_backhalf_degraded"),
      akv.b("shipwreck/sideways_full_degraded"),
      akv.b("shipwreck/sideways_fronthalf_degraded"),
      akv.b("shipwreck/sideways_backhalf_degraded"),
      akv.b("shipwreck/rightsideup_full_degraded"),
      akv.b("shipwreck/rightsideup_fronthalf_degraded"),
      akv.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aku<evv>> e = Map.of("map_chest", evm.G, "treasure_chest", evm.I, "supply_chest", evm.H);

   public static eqb.a a(ero $$0, ji $$1, dqd $$2, enq $$3, azh $$4, boolean $$5) {
      akv $$6 = af.a($$5 ? c : d, $$4);
      eqb.a $$7 = new eqb.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends env {
      private final boolean h;

      public a(ero $$0, akv $$1, ji $$2, dqd $$3, boolean $$4) {
         super(eoc.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ero $$0, tq $$1) {
         super(eoc.ab, $$1, $$0, $$1x -> a(dqd.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eob $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static erj a(dqd $$0) {
         return new erj().a($$0).a(dok.a).a(eqb.b).a(eqo.d);
      }

      @Override
      protected void a(String $$0, ji $$1, dgy $$2, azh $$3, end $$4) {
         aku<evv> $$5 = eqb.e.get($$0);
         if ($$5 != null) {
            bsp.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dhf $$0, dhd $$1, dys $$2, azh $$3, end $$4, dfn $$5, ji $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.an() + 1;
            int $$8 = 0;
            km $$9 = this.b.a();
            ecr.a $$10 = this.h ? ecr.a.a : ecr.a.c;
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
