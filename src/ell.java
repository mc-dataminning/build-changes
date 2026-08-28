import java.util.Map;

public class ell {
   private static final int a = 32;
   static final ja b = new ja(4, 0, 15);
   private static final akk[] c = new akk[]{
      new akk("shipwreck/with_mast"),
      new akk("shipwreck/sideways_full"),
      new akk("shipwreck/sideways_fronthalf"),
      new akk("shipwreck/sideways_backhalf"),
      new akk("shipwreck/rightsideup_full"),
      new akk("shipwreck/rightsideup_fronthalf"),
      new akk("shipwreck/rightsideup_backhalf"),
      new akk("shipwreck/with_mast_degraded"),
      new akk("shipwreck/rightsideup_full_degraded"),
      new akk("shipwreck/rightsideup_fronthalf_degraded"),
      new akk("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final akk[] d = new akk[]{
      new akk("shipwreck/with_mast"),
      new akk("shipwreck/upsidedown_full"),
      new akk("shipwreck/upsidedown_fronthalf"),
      new akk("shipwreck/upsidedown_backhalf"),
      new akk("shipwreck/sideways_full"),
      new akk("shipwreck/sideways_fronthalf"),
      new akk("shipwreck/sideways_backhalf"),
      new akk("shipwreck/rightsideup_full"),
      new akk("shipwreck/rightsideup_fronthalf"),
      new akk("shipwreck/rightsideup_backhalf"),
      new akk("shipwreck/with_mast_degraded"),
      new akk("shipwreck/upsidedown_full_degraded"),
      new akk("shipwreck/upsidedown_fronthalf_degraded"),
      new akk("shipwreck/upsidedown_backhalf_degraded"),
      new akk("shipwreck/sideways_full_degraded"),
      new akk("shipwreck/sideways_fronthalf_degraded"),
      new akk("shipwreck/sideways_backhalf_degraded"),
      new akk("shipwreck/rightsideup_full_degraded"),
      new akk("shipwreck/rightsideup_fronthalf_degraded"),
      new akk("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akj<eqz>> e = Map.of("map_chest", eqq.H, "treasure_chest", eqq.J, "supply_chest", eqq.I);

   public static ell.a a(emx $$0, ja $$1, dlu $$2, ejb $$3, ayo $$4, boolean $$5) {
      akk $$6 = ac.a($$5 ? c : d, $$4);
      ell.a $$7 = new ell.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends ejg {
      private final boolean h;

      public a(emx $$0, akk $$1, ja $$2, dlu $$3, boolean $$4) {
         super(ejn.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(emx $$0, tx $$1) {
         super(ejn.ab, $$1, $$0, $$1x -> a(dlu.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ejm $$0, tx $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ems a(dlu $$0) {
         return new ems().a($$0).a(dke.a).a(ell.b).a(ely.d);
      }

      @Override
      protected void a(String $$0, ja $$1, dcu $$2, ayo $$3, eio $$4) {
         akj<eqz> $$5 = ell.e.get($$0);
         if ($$5 != null) {
            bqo.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(ddb $$0, dcz $$1, duh $$2, ayo $$3, eio $$4, dbm $$5, ja $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.am();
            int $$8 = 0;
            ke $$9 = this.b.a();
            dyf.a $$10 = this.h ? dyf.a.a : dyf.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               ja $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (ja $$13 : ja.c(this.d, $$12)) {
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
         ke $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, ayo $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new ja(this.d.u(), $$0, this.d.w());
      }
   }
}
