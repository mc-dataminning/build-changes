import java.util.Map;

public class eev {
   static final ib a = new ib(4, 0, 15);
   private static final ajc[] b = new ajc[]{
      new ajc("shipwreck/with_mast"),
      new ajc("shipwreck/sideways_full"),
      new ajc("shipwreck/sideways_fronthalf"),
      new ajc("shipwreck/sideways_backhalf"),
      new ajc("shipwreck/rightsideup_full"),
      new ajc("shipwreck/rightsideup_fronthalf"),
      new ajc("shipwreck/rightsideup_backhalf"),
      new ajc("shipwreck/with_mast_degraded"),
      new ajc("shipwreck/rightsideup_full_degraded"),
      new ajc("shipwreck/rightsideup_fronthalf_degraded"),
      new ajc("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ajc[] c = new ajc[]{
      new ajc("shipwreck/with_mast"),
      new ajc("shipwreck/upsidedown_full"),
      new ajc("shipwreck/upsidedown_fronthalf"),
      new ajc("shipwreck/upsidedown_backhalf"),
      new ajc("shipwreck/sideways_full"),
      new ajc("shipwreck/sideways_fronthalf"),
      new ajc("shipwreck/sideways_backhalf"),
      new ajc("shipwreck/rightsideup_full"),
      new ajc("shipwreck/rightsideup_fronthalf"),
      new ajc("shipwreck/rightsideup_backhalf"),
      new ajc("shipwreck/with_mast_degraded"),
      new ajc("shipwreck/upsidedown_full_degraded"),
      new ajc("shipwreck/upsidedown_fronthalf_degraded"),
      new ajc("shipwreck/upsidedown_backhalf_degraded"),
      new ajc("shipwreck/sideways_full_degraded"),
      new ajc("shipwreck/sideways_fronthalf_degraded"),
      new ajc("shipwreck/sideways_backhalf_degraded"),
      new ajc("shipwreck/rightsideup_full_degraded"),
      new ajc("shipwreck/rightsideup_fronthalf_degraded"),
      new ajc("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ajc> d = Map.of("map_chest", ejw.H, "treasure_chest", ejw.J, "supply_chest", ejw.I);

   public static void a(egh $$0, ib $$1, dfr $$2, ecl $$3, awt $$4, boolean $$5) {
      ajc $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eev.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends ecq {
      private final boolean h;

      public a(egh $$0, ajc $$1, ib $$2, dfr $$3, boolean $$4) {
         super(ecx.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(egh $$0, sy $$1) {
         super(ecx.ab, $$1, $$0, $$1x -> a(dfr.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static egc a(dfr $$0) {
         return new egc().a($$0).a(deb.a).a(eev.a).a(efi.d);
      }

      @Override
      protected void a(String $$0, ib $$1, cwt $$2, awt $$3, eby $$4) {
         ajc $$5 = eev.d.get($$0);
         if ($$5 != null) {
            bmt.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         int $$7 = $$0.ak();
         int $$8 = 0;
         jf $$9 = this.b.a();
         drq.a $$10 = this.h ? drq.a.a : drq.a.c;
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
