import java.util.Map;

public class eft {
   static final ib a = new ib(4, 0, 15);
   private static final ajh[] b = new ajh[]{
      new ajh("shipwreck/with_mast"),
      new ajh("shipwreck/sideways_full"),
      new ajh("shipwreck/sideways_fronthalf"),
      new ajh("shipwreck/sideways_backhalf"),
      new ajh("shipwreck/rightsideup_full"),
      new ajh("shipwreck/rightsideup_fronthalf"),
      new ajh("shipwreck/rightsideup_backhalf"),
      new ajh("shipwreck/with_mast_degraded"),
      new ajh("shipwreck/rightsideup_full_degraded"),
      new ajh("shipwreck/rightsideup_fronthalf_degraded"),
      new ajh("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ajh[] c = new ajh[]{
      new ajh("shipwreck/with_mast"),
      new ajh("shipwreck/upsidedown_full"),
      new ajh("shipwreck/upsidedown_fronthalf"),
      new ajh("shipwreck/upsidedown_backhalf"),
      new ajh("shipwreck/sideways_full"),
      new ajh("shipwreck/sideways_fronthalf"),
      new ajh("shipwreck/sideways_backhalf"),
      new ajh("shipwreck/rightsideup_full"),
      new ajh("shipwreck/rightsideup_fronthalf"),
      new ajh("shipwreck/rightsideup_backhalf"),
      new ajh("shipwreck/with_mast_degraded"),
      new ajh("shipwreck/upsidedown_full_degraded"),
      new ajh("shipwreck/upsidedown_fronthalf_degraded"),
      new ajh("shipwreck/upsidedown_backhalf_degraded"),
      new ajh("shipwreck/sideways_full_degraded"),
      new ajh("shipwreck/sideways_fronthalf_degraded"),
      new ajh("shipwreck/sideways_backhalf_degraded"),
      new ajh("shipwreck/rightsideup_full_degraded"),
      new ajh("shipwreck/rightsideup_fronthalf_degraded"),
      new ajh("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ajh> d = Map.of("map_chest", eku.H, "treasure_chest", eku.J, "supply_chest", eku.I);

   public static void a(ehf $$0, ib $$1, dgo $$2, edj $$3, axd $$4, boolean $$5) {
      ajh $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eft.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends edo {
      private final boolean h;

      public a(ehf $$0, ajh $$1, ib $$2, dgo $$3, boolean $$4) {
         super(edv.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ehf $$0, ta $$1) {
         super(edv.ab, $$1, $$0, $$1x -> a(dgo.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(edu $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static eha a(dgo $$0) {
         return new eha().a($$0).a(dey.a).a(eft.a).a(egg.d);
      }

      @Override
      protected void a(String $$0, ib $$1, cxq $$2, axd $$3, ecw $$4) {
         ajh $$5 = eft.d.get($$0);
         if ($$5 != null) {
            bnl.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, ib $$6) {
         int $$7 = $$0.ak();
         int $$8 = 0;
         jg $$9 = this.b.a();
         dso.a $$10 = this.h ? dso.a.a : dso.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            ib $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (ib $$13 : ib.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new ib(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
