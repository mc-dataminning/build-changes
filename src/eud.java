import java.util.Map;

public class eud {
   private static final int a = 32;
   static final iv b = new iv(4, 0, 15);
   private static final alg[] c = new alg[]{
      alg.b("shipwreck/with_mast"),
      alg.b("shipwreck/sideways_full"),
      alg.b("shipwreck/sideways_fronthalf"),
      alg.b("shipwreck/sideways_backhalf"),
      alg.b("shipwreck/rightsideup_full"),
      alg.b("shipwreck/rightsideup_fronthalf"),
      alg.b("shipwreck/rightsideup_backhalf"),
      alg.b("shipwreck/with_mast_degraded"),
      alg.b("shipwreck/rightsideup_full_degraded"),
      alg.b("shipwreck/rightsideup_fronthalf_degraded"),
      alg.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alg[] d = new alg[]{
      alg.b("shipwreck/with_mast"),
      alg.b("shipwreck/upsidedown_full"),
      alg.b("shipwreck/upsidedown_fronthalf"),
      alg.b("shipwreck/upsidedown_backhalf"),
      alg.b("shipwreck/sideways_full"),
      alg.b("shipwreck/sideways_fronthalf"),
      alg.b("shipwreck/sideways_backhalf"),
      alg.b("shipwreck/rightsideup_full"),
      alg.b("shipwreck/rightsideup_fronthalf"),
      alg.b("shipwreck/rightsideup_backhalf"),
      alg.b("shipwreck/with_mast_degraded"),
      alg.b("shipwreck/upsidedown_full_degraded"),
      alg.b("shipwreck/upsidedown_fronthalf_degraded"),
      alg.b("shipwreck/upsidedown_backhalf_degraded"),
      alg.b("shipwreck/sideways_full_degraded"),
      alg.b("shipwreck/sideways_fronthalf_degraded"),
      alg.b("shipwreck/sideways_backhalf_degraded"),
      alg.b("shipwreck/rightsideup_full_degraded"),
      alg.b("shipwreck/rightsideup_fronthalf_degraded"),
      alg.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, alf<ezy>> e = Map.of("map_chest", ezp.G, "treasure_chest", ezp.I, "supply_chest", ezp.H);

   public static eud.a a(evq $$0, iv $$1, dtl $$2, ers $$3, azv $$4, boolean $$5) {
      alg $$6 = ag.a($$5 ? c : d, $$4);
      eud.a $$7 = new eud.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends erx {
      private final boolean h;

      public a(evq $$0, alg $$1, iv $$2, dtl $$3, boolean $$4) {
         super(ese.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(evq $$0, tz $$1) {
         super(ese.ab, $$1, $$0, $$1x -> a($$1.<dtl>a("Rot", dtl.h).orElseThrow()));
         this.h = $$1.o("isBeached");
      }

      @Override
      protected void a(esd $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", dtl.h, this.c.d());
      }

      private static evl a(dtl $$0) {
         return new evl().a($$0).a(dru.a).a(eud.b).a(euq.d);
      }

      @Override
      protected void a(String $$0, iv $$1, dkd $$2, azv $$3, erf $$4) {
         alf<ezy> $$5 = eud.e.get($$0);
         if ($$5 != null) {
            bum.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.ao() + 1;
            int $$8 = 0;
            ka $$9 = this.b.a();
            egs.a $$10 = this.h ? egs.a.a : egs.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               iv $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (iv $$13 : iv.c(this.d, $$12)) {
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
         ka $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azv $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iv(this.d.u(), $$0, this.d.w());
      }
   }
}
