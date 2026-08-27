import java.util.Map;

public class dyi {
   static final ht a = new ht(4, 0, 15);
   private static final afw[] b = new afw[]{
      new afw("shipwreck/with_mast"),
      new afw("shipwreck/sideways_full"),
      new afw("shipwreck/sideways_fronthalf"),
      new afw("shipwreck/sideways_backhalf"),
      new afw("shipwreck/rightsideup_full"),
      new afw("shipwreck/rightsideup_fronthalf"),
      new afw("shipwreck/rightsideup_backhalf"),
      new afw("shipwreck/with_mast_degraded"),
      new afw("shipwreck/rightsideup_full_degraded"),
      new afw("shipwreck/rightsideup_fronthalf_degraded"),
      new afw("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final afw[] c = new afw[]{
      new afw("shipwreck/with_mast"),
      new afw("shipwreck/upsidedown_full"),
      new afw("shipwreck/upsidedown_fronthalf"),
      new afw("shipwreck/upsidedown_backhalf"),
      new afw("shipwreck/sideways_full"),
      new afw("shipwreck/sideways_fronthalf"),
      new afw("shipwreck/sideways_backhalf"),
      new afw("shipwreck/rightsideup_full"),
      new afw("shipwreck/rightsideup_fronthalf"),
      new afw("shipwreck/rightsideup_backhalf"),
      new afw("shipwreck/with_mast_degraded"),
      new afw("shipwreck/upsidedown_full_degraded"),
      new afw("shipwreck/upsidedown_fronthalf_degraded"),
      new afw("shipwreck/upsidedown_backhalf_degraded"),
      new afw("shipwreck/sideways_full_degraded"),
      new afw("shipwreck/sideways_fronthalf_degraded"),
      new afw("shipwreck/sideways_backhalf_degraded"),
      new afw("shipwreck/rightsideup_full_degraded"),
      new afw("shipwreck/rightsideup_fronthalf_degraded"),
      new afw("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, afw> d = Map.of("map_chest", edg.H, "treasure_chest", edg.J, "supply_chest", edg.I);

   public static void a(dzu $$0, ht $$1, dal $$2, dwf $$3, ate $$4, boolean $$5) {
      afw $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new dyi.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dwk {
      private final boolean h;

      public a(dzu $$0, afw $$1, ht $$2, dal $$3, boolean $$4) {
         super(dwr.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(dzu $$0, rt $$1) {
         super(dwr.ab, $$1, $$0, $$1x -> a(dal.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dwq $$0, rt $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static dzp a(dal $$0) {
         return new dzp().a($$0).a(cyv.a).a(dyi.a).a(dyv.d);
      }

      @Override
      protected void a(String $$0, ht $$1, cro $$2, ate $$3, dvs $$4) {
         afw $$5 = dyi.d.get($$0);
         if ($$5 != null) {
            dfa.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(crt $$0, crr $$1, dhy $$2, ate $$3, dvs $$4, cqg $$5, ht $$6) {
         int $$7 = $$0.aj();
         int $$8 = 0;
         iw $$9 = this.b.a();
         dlk.a $$10 = this.h ? dlk.a.a : dlk.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            ht $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (ht $$13 : ht.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new ht(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
