import java.util.Map;

public class esy {
   private static final int a = 32;
   static final iu b = new iu(4, 0, 15);
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
   static final Map<String, ald<eys>> e = Map.of("map_chest", eyj.G, "treasure_chest", eyj.I, "supply_chest", eyj.H);

   public static esy.a a(eul $$0, iu $$1, dsm $$2, eqn $$3, azt $$4, boolean $$5) {
      ale $$6 = af.a($$5 ? c : d, $$4);
      esy.a $$7 = new esy.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends eqs {
      private final boolean h;

      public a(eul $$0, ale $$1, iu $$2, dsm $$3, boolean $$4) {
         super(eqz.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eul $$0, tx $$1) {
         super(eqz.ab, $$1, $$0, $$1x -> a(dsm.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eqy $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static eug a(dsm $$0) {
         return new eug().a($$0).a(dqv.a).a(esy.b).a(etl.d);
      }

      @Override
      protected void a(String $$0, iu $$1, djg $$2, azt $$3, eqa $$4) {
         ald<eys> $$5 = esy.e.get($$0);
         if ($$5 != null) {
            bue.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(djo $$0, djl $$1, ebm $$2, azt $$3, eqa $$4, dhw $$5, iu $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.ao() + 1;
            int $$8 = 0;
            jz $$9 = this.b.a();
            efn.a $$10 = this.h ? efn.a.a : efn.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               iu $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (iu $$13 : iu.c(this.d, $$12)) {
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
         jz $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azt $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iu(this.d.u(), $$0, this.d.w());
      }
   }
}
