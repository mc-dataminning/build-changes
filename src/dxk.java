import java.util.Map;

public class dxk {
   static final gw a = new gw(4, 0, 15);
   private static final aez[] b = new aez[]{
      new aez("shipwreck/with_mast"),
      new aez("shipwreck/sideways_full"),
      new aez("shipwreck/sideways_fronthalf"),
      new aez("shipwreck/sideways_backhalf"),
      new aez("shipwreck/rightsideup_full"),
      new aez("shipwreck/rightsideup_fronthalf"),
      new aez("shipwreck/rightsideup_backhalf"),
      new aez("shipwreck/with_mast_degraded"),
      new aez("shipwreck/rightsideup_full_degraded"),
      new aez("shipwreck/rightsideup_fronthalf_degraded"),
      new aez("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aez[] c = new aez[]{
      new aez("shipwreck/with_mast"),
      new aez("shipwreck/upsidedown_full"),
      new aez("shipwreck/upsidedown_fronthalf"),
      new aez("shipwreck/upsidedown_backhalf"),
      new aez("shipwreck/sideways_full"),
      new aez("shipwreck/sideways_fronthalf"),
      new aez("shipwreck/sideways_backhalf"),
      new aez("shipwreck/rightsideup_full"),
      new aez("shipwreck/rightsideup_fronthalf"),
      new aez("shipwreck/rightsideup_backhalf"),
      new aez("shipwreck/with_mast_degraded"),
      new aez("shipwreck/upsidedown_full_degraded"),
      new aez("shipwreck/upsidedown_fronthalf_degraded"),
      new aez("shipwreck/upsidedown_backhalf_degraded"),
      new aez("shipwreck/sideways_full_degraded"),
      new aez("shipwreck/sideways_fronthalf_degraded"),
      new aez("shipwreck/sideways_backhalf_degraded"),
      new aez("shipwreck/rightsideup_full_degraded"),
      new aez("shipwreck/rightsideup_fronthalf_degraded"),
      new aez("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aez> d = Map.of("map_chest", eci.H, "treasure_chest", eci.J, "supply_chest", eci.I);

   public static void a(dyw $$0, gw $$1, czn $$2, dvh $$3, ash $$4, boolean $$5) {
      aez $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dxk.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dvm {
      private final boolean h;

      public a(dyw $$0, aez $$1, gw $$2, czn $$3, boolean $$4) {
         super(dvt.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dyw $$0, qw $$1) {
         super(dvt.ab, $$1, $$0, $$1x -> a(czn.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dyr a(czn $$0) {
         return new dyr().a($$0).a(cxx.a).a(dxk.a).a(dxx.d);
      }

      @Override
      protected void a(String $$0, gw $$1, cqq $$2, ash $$3, duu $$4) {
         aez $$5 = dxk.d.get($$0);
         if ($$5 != null) {
            dec.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         hy $$9 = this.b.a();
         dkm.a $$10 = this.h ? dkm.a.a : dkm.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            gw $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (gw $$13 : gw.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new gw(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
