import java.util.Map;

public class ela {
   private static final int a = 32;
   static final iz b = new iz(4, 0, 15);
   private static final alf[] c = new alf[]{
      new alf("shipwreck/with_mast"),
      new alf("shipwreck/sideways_full"),
      new alf("shipwreck/sideways_fronthalf"),
      new alf("shipwreck/sideways_backhalf"),
      new alf("shipwreck/rightsideup_full"),
      new alf("shipwreck/rightsideup_fronthalf"),
      new alf("shipwreck/rightsideup_backhalf"),
      new alf("shipwreck/with_mast_degraded"),
      new alf("shipwreck/rightsideup_full_degraded"),
      new alf("shipwreck/rightsideup_fronthalf_degraded"),
      new alf("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alf[] d = new alf[]{
      new alf("shipwreck/with_mast"),
      new alf("shipwreck/upsidedown_full"),
      new alf("shipwreck/upsidedown_fronthalf"),
      new alf("shipwreck/upsidedown_backhalf"),
      new alf("shipwreck/sideways_full"),
      new alf("shipwreck/sideways_fronthalf"),
      new alf("shipwreck/sideways_backhalf"),
      new alf("shipwreck/rightsideup_full"),
      new alf("shipwreck/rightsideup_fronthalf"),
      new alf("shipwreck/rightsideup_backhalf"),
      new alf("shipwreck/with_mast_degraded"),
      new alf("shipwreck/upsidedown_full_degraded"),
      new alf("shipwreck/upsidedown_fronthalf_degraded"),
      new alf("shipwreck/upsidedown_backhalf_degraded"),
      new alf("shipwreck/sideways_full_degraded"),
      new alf("shipwreck/sideways_fronthalf_degraded"),
      new alf("shipwreck/sideways_backhalf_degraded"),
      new alf("shipwreck/rightsideup_full_degraded"),
      new alf("shipwreck/rightsideup_fronthalf_degraded"),
      new alf("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ale<eqo>> e = Map.of("map_chest", eqf.H, "treasure_chest", eqf.J, "supply_chest", eqf.I);

   public static ela.a a(emm $$0, iz $$1, dln $$2, eiq $$3, azh $$4, boolean $$5) {
      alf $$6 = ac.a($$5 ? c : d, $$4);
      ela.a $$7 = new ela.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends eiv {
      private final boolean h;

      public a(emm $$0, alf $$1, iz $$2, dln $$3, boolean $$4) {
         super(ejc.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(emm $$0, us $$1) {
         super(ejc.ab, $$1, $$0, $$1x -> a(dln.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ejb $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static emh a(dln $$0) {
         return new emh().a($$0).a(djx.a).a(ela.b).a(eln.d);
      }

      @Override
      protected void a(String $$0, iz $$1, dco $$2, azh $$3, eid $$4) {
         ale<eqo> $$5 = ela.e.get($$0);
         if ($$5 != null) {
            brd.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dcu $$0, dcs $$1, dua $$2, azh $$3, eid $$4, dbg $$5, iz $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.am();
            int $$8 = 0;
            kd $$9 = this.b.a();
            dxv.a $$10 = this.h ? dxv.a.a : dxv.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               iz $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (iz $$13 : iz.c(this.d, $$12)) {
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
         kd $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azh $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iz(this.d.u(), $$0, this.d.w());
      }
   }
}
