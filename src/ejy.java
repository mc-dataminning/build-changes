import java.util.Map;

public class ejy {
   static final io a = new io(4, 0, 15);
   private static final akm[] b = new akm[]{
      new akm("shipwreck/with_mast"),
      new akm("shipwreck/sideways_full"),
      new akm("shipwreck/sideways_fronthalf"),
      new akm("shipwreck/sideways_backhalf"),
      new akm("shipwreck/rightsideup_full"),
      new akm("shipwreck/rightsideup_fronthalf"),
      new akm("shipwreck/rightsideup_backhalf"),
      new akm("shipwreck/with_mast_degraded"),
      new akm("shipwreck/rightsideup_full_degraded"),
      new akm("shipwreck/rightsideup_fronthalf_degraded"),
      new akm("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akm[] c = new akm[]{
      new akm("shipwreck/with_mast"),
      new akm("shipwreck/upsidedown_full"),
      new akm("shipwreck/upsidedown_fronthalf"),
      new akm("shipwreck/upsidedown_backhalf"),
      new akm("shipwreck/sideways_full"),
      new akm("shipwreck/sideways_fronthalf"),
      new akm("shipwreck/sideways_backhalf"),
      new akm("shipwreck/rightsideup_full"),
      new akm("shipwreck/rightsideup_fronthalf"),
      new akm("shipwreck/rightsideup_backhalf"),
      new akm("shipwreck/with_mast_degraded"),
      new akm("shipwreck/upsidedown_full_degraded"),
      new akm("shipwreck/upsidedown_fronthalf_degraded"),
      new akm("shipwreck/upsidedown_backhalf_degraded"),
      new akm("shipwreck/sideways_full_degraded"),
      new akm("shipwreck/sideways_fronthalf_degraded"),
      new akm("shipwreck/sideways_backhalf_degraded"),
      new akm("shipwreck/rightsideup_full_degraded"),
      new akm("shipwreck/rightsideup_fronthalf_degraded"),
      new akm("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akl<epk>> d = Map.of("map_chest", epd.H, "treasure_chest", epd.J, "supply_chest", epd.I);

   public static void a(elk $$0, io $$1, dkl $$2, eho $$3, ayk $$4, boolean $$5) {
      akm $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new ejy.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends eht {
      private final boolean h;

      public a(elk $$0, akm $$1, io $$2, dkl $$3, boolean $$4) {
         super(eia.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(elk $$0, ud $$1) {
         super(eia.ab, $$1, $$0, $$1x -> a(dkl.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ehz $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static elf a(dkl $$0) {
         return new elf().a($$0).a(div.a).a(ejy.a).a(ekl.d);
      }

      @Override
      protected void a(String $$0, io $$1, dbm $$2, ayk $$3, ehb $$4) {
         akl<epk> $$5 = ejy.d.get($$0);
         if ($$5 != null) {
            bqc.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, io $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         js $$9 = this.b.a();
         dwt.a $$10 = this.h ? dwt.a.a : dwt.a.c;
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
