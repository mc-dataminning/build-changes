import java.util.Map;

public class eif {
   static final id a = new id(4, 0, 15);
   private static final ajv[] b = new ajv[]{
      new ajv("shipwreck/with_mast"),
      new ajv("shipwreck/sideways_full"),
      new ajv("shipwreck/sideways_fronthalf"),
      new ajv("shipwreck/sideways_backhalf"),
      new ajv("shipwreck/rightsideup_full"),
      new ajv("shipwreck/rightsideup_fronthalf"),
      new ajv("shipwreck/rightsideup_backhalf"),
      new ajv("shipwreck/with_mast_degraded"),
      new ajv("shipwreck/rightsideup_full_degraded"),
      new ajv("shipwreck/rightsideup_fronthalf_degraded"),
      new ajv("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ajv[] c = new ajv[]{
      new ajv("shipwreck/with_mast"),
      new ajv("shipwreck/upsidedown_full"),
      new ajv("shipwreck/upsidedown_fronthalf"),
      new ajv("shipwreck/upsidedown_backhalf"),
      new ajv("shipwreck/sideways_full"),
      new ajv("shipwreck/sideways_fronthalf"),
      new ajv("shipwreck/sideways_backhalf"),
      new ajv("shipwreck/rightsideup_full"),
      new ajv("shipwreck/rightsideup_fronthalf"),
      new ajv("shipwreck/rightsideup_backhalf"),
      new ajv("shipwreck/with_mast_degraded"),
      new ajv("shipwreck/upsidedown_full_degraded"),
      new ajv("shipwreck/upsidedown_fronthalf_degraded"),
      new ajv("shipwreck/upsidedown_backhalf_degraded"),
      new ajv("shipwreck/sideways_full_degraded"),
      new ajv("shipwreck/sideways_fronthalf_degraded"),
      new ajv("shipwreck/sideways_backhalf_degraded"),
      new ajv("shipwreck/rightsideup_full_degraded"),
      new ajv("shipwreck/rightsideup_fronthalf_degraded"),
      new ajv("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ajv> d = Map.of("map_chest", eni.H, "treasure_chest", eni.J, "supply_chest", eni.I);

   public static void a(ejr $$0, id $$1, dit $$2, efv $$3, axt $$4, boolean $$5) {
      ajv $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eif.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends ega {
      private final boolean h;

      public a(ejr $$0, ajv $$1, id $$2, dit $$3, boolean $$4) {
         super(egh.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ejr $$0, to $$1) {
         super(egh.ab, $$1, $$0, $$1x -> a(dit.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ejm a(dit $$0) {
         return new ejm().a($$0).a(dhd.a).a(eif.a).a(eis.d);
      }

      @Override
      protected void a(String $$0, id $$1, czv $$2, axt $$3, efi $$4) {
         ajv $$5 = eif.d.get($$0);
         if ($$5 != null) {
            bon.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         ji $$9 = this.b.a();
         dva.a $$10 = this.h ? dva.a.a : dva.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            id $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (id $$13 : id.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new id(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
