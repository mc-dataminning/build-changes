import java.util.Map;

public class eka {
   static final io a = new io(4, 0, 15);
   private static final akn[] b = new akn[]{
      new akn("shipwreck/with_mast"),
      new akn("shipwreck/sideways_full"),
      new akn("shipwreck/sideways_fronthalf"),
      new akn("shipwreck/sideways_backhalf"),
      new akn("shipwreck/rightsideup_full"),
      new akn("shipwreck/rightsideup_fronthalf"),
      new akn("shipwreck/rightsideup_backhalf"),
      new akn("shipwreck/with_mast_degraded"),
      new akn("shipwreck/rightsideup_full_degraded"),
      new akn("shipwreck/rightsideup_fronthalf_degraded"),
      new akn("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akn[] c = new akn[]{
      new akn("shipwreck/with_mast"),
      new akn("shipwreck/upsidedown_full"),
      new akn("shipwreck/upsidedown_fronthalf"),
      new akn("shipwreck/upsidedown_backhalf"),
      new akn("shipwreck/sideways_full"),
      new akn("shipwreck/sideways_fronthalf"),
      new akn("shipwreck/sideways_backhalf"),
      new akn("shipwreck/rightsideup_full"),
      new akn("shipwreck/rightsideup_fronthalf"),
      new akn("shipwreck/rightsideup_backhalf"),
      new akn("shipwreck/with_mast_degraded"),
      new akn("shipwreck/upsidedown_full_degraded"),
      new akn("shipwreck/upsidedown_fronthalf_degraded"),
      new akn("shipwreck/upsidedown_backhalf_degraded"),
      new akn("shipwreck/sideways_full_degraded"),
      new akn("shipwreck/sideways_fronthalf_degraded"),
      new akn("shipwreck/sideways_backhalf_degraded"),
      new akn("shipwreck/rightsideup_full_degraded"),
      new akn("shipwreck/rightsideup_fronthalf_degraded"),
      new akn("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akm<epm>> d = Map.of("map_chest", epf.H, "treasure_chest", epf.J, "supply_chest", epf.I);

   public static void a(elm $$0, io $$1, dkn $$2, ehq $$3, aym $$4, boolean $$5) {
      akn $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eka.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends ehv {
      private final boolean h;

      public a(elm $$0, akn $$1, io $$2, dkn $$3, boolean $$4) {
         super(eic.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(elm $$0, ud $$1) {
         super(eic.ab, $$1, $$0, $$1x -> a(dkn.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static elh a(dkn $$0) {
         return new elh().a($$0).a(dix.a).a(eka.a).a(ekn.d);
      }

      @Override
      protected void a(String $$0, io $$1, dbo $$2, aym $$3, ehd $$4) {
         akm<epm> $$5 = eka.d.get($$0);
         if ($$5 != null) {
            bqe.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         js $$9 = this.b.a();
         dwv.a $$10 = this.h ? dwv.a.a : dwv.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            io $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (io $$13 : io.c(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new io(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
