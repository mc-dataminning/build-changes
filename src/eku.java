import java.util.Map;

public class eku {
   static final iz a = new iz(4, 0, 15);
   private static final alb[] b = new alb[]{
      new alb("shipwreck/with_mast"),
      new alb("shipwreck/sideways_full"),
      new alb("shipwreck/sideways_fronthalf"),
      new alb("shipwreck/sideways_backhalf"),
      new alb("shipwreck/rightsideup_full"),
      new alb("shipwreck/rightsideup_fronthalf"),
      new alb("shipwreck/rightsideup_backhalf"),
      new alb("shipwreck/with_mast_degraded"),
      new alb("shipwreck/rightsideup_full_degraded"),
      new alb("shipwreck/rightsideup_fronthalf_degraded"),
      new alb("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alb[] c = new alb[]{
      new alb("shipwreck/with_mast"),
      new alb("shipwreck/upsidedown_full"),
      new alb("shipwreck/upsidedown_fronthalf"),
      new alb("shipwreck/upsidedown_backhalf"),
      new alb("shipwreck/sideways_full"),
      new alb("shipwreck/sideways_fronthalf"),
      new alb("shipwreck/sideways_backhalf"),
      new alb("shipwreck/rightsideup_full"),
      new alb("shipwreck/rightsideup_fronthalf"),
      new alb("shipwreck/rightsideup_backhalf"),
      new alb("shipwreck/with_mast_degraded"),
      new alb("shipwreck/upsidedown_full_degraded"),
      new alb("shipwreck/upsidedown_fronthalf_degraded"),
      new alb("shipwreck/upsidedown_backhalf_degraded"),
      new alb("shipwreck/sideways_full_degraded"),
      new alb("shipwreck/sideways_fronthalf_degraded"),
      new alb("shipwreck/sideways_backhalf_degraded"),
      new alb("shipwreck/rightsideup_full_degraded"),
      new alb("shipwreck/rightsideup_fronthalf_degraded"),
      new alb("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ala<eqi>> d = Map.of("map_chest", epz.H, "treasure_chest", epz.J, "supply_chest", epz.I);

   public static void a(emg $$0, iz $$1, dlh $$2, eik $$3, azc $$4, boolean $$5) {
      alb $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new eku.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends eip {
      private final boolean h;

      public a(emg $$0, alb $$1, iz $$2, dlh $$3, boolean $$4) {
         super(eiw.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(emg $$0, ur $$1) {
         super(eiw.ab, $$1, $$0, $$1x -> a(dlh.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eiv $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static emb a(dlh $$0) {
         return new emb().a($$0).a(djr.a).a(eku.a).a(elh.d);
      }

      @Override
      protected void a(String $$0, iz $$1, dci $$2, azc $$3, ehx $$4) {
         ala<eqi> $$5 = eku.d.get($$0);
         if ($$5 != null) {
            bqx.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, iz $$6) {
         int $$7 = $$0.am();
         int $$8 = 0;
         kd $$9 = this.b.a();
         dxp.a $$10 = this.h ? dxp.a.a : dxp.a.c;
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

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new iz(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
