import java.util.Map;

public class eje {
   static final in a = new in(4, 0, 15);
   private static final akh[] b = new akh[]{
      new akh("shipwreck/with_mast"),
      new akh("shipwreck/sideways_full"),
      new akh("shipwreck/sideways_fronthalf"),
      new akh("shipwreck/sideways_backhalf"),
      new akh("shipwreck/rightsideup_full"),
      new akh("shipwreck/rightsideup_fronthalf"),
      new akh("shipwreck/rightsideup_backhalf"),
      new akh("shipwreck/with_mast_degraded"),
      new akh("shipwreck/rightsideup_full_degraded"),
      new akh("shipwreck/rightsideup_fronthalf_degraded"),
      new akh("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akh[] c = new akh[]{
      new akh("shipwreck/with_mast"),
      new akh("shipwreck/upsidedown_full"),
      new akh("shipwreck/upsidedown_fronthalf"),
      new akh("shipwreck/upsidedown_backhalf"),
      new akh("shipwreck/sideways_full"),
      new akh("shipwreck/sideways_fronthalf"),
      new akh("shipwreck/sideways_backhalf"),
      new akh("shipwreck/rightsideup_full"),
      new akh("shipwreck/rightsideup_fronthalf"),
      new akh("shipwreck/rightsideup_backhalf"),
      new akh("shipwreck/with_mast_degraded"),
      new akh("shipwreck/upsidedown_full_degraded"),
      new akh("shipwreck/upsidedown_fronthalf_degraded"),
      new akh("shipwreck/upsidedown_backhalf_degraded"),
      new akh("shipwreck/sideways_full_degraded"),
      new akh("shipwreck/sideways_fronthalf_degraded"),
      new akh("shipwreck/sideways_backhalf_degraded"),
      new akh("shipwreck/rightsideup_full_degraded"),
      new akh("shipwreck/rightsideup_fronthalf_degraded"),
      new akh("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akg<eoq>> d = Map.of("map_chest", eoj.H, "treasure_chest", eoj.J, "supply_chest", eoj.I);

   public static void a(ekq $$0, in $$1, djr $$2, egu $$3, ayg $$4, boolean $$5) {
      akh $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eje.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends egz {
      private final boolean h;

      public a(ekq $$0, akh $$1, in $$2, djr $$3, boolean $$4) {
         super(ehg.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ekq $$0, ua $$1) {
         super(ehg.ab, $$1, $$0, $$1x -> a(djr.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ekl a(djr $$0) {
         return new ekl().a($$0).a(dib.a).a(eje.a).a(ejr.d);
      }

      @Override
      protected void a(String $$0, in $$1, das $$2, ayg $$3, egh $$4) {
         akg<eoq> $$5 = eje.d.get($$0);
         if ($$5 != null) {
            bpu.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         jr $$9 = this.b.a();
         dvz.a $$10 = this.h ? dvz.a.a : dvz.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            in $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (in $$13 : in.c(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new in(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
