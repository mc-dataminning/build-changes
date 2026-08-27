import java.util.Map;

public class ebo {
   static final hx a = new hx(4, 0, 15);
   private static final ahd[] b = new ahd[]{
      new ahd("shipwreck/with_mast"),
      new ahd("shipwreck/sideways_full"),
      new ahd("shipwreck/sideways_fronthalf"),
      new ahd("shipwreck/sideways_backhalf"),
      new ahd("shipwreck/rightsideup_full"),
      new ahd("shipwreck/rightsideup_fronthalf"),
      new ahd("shipwreck/rightsideup_backhalf"),
      new ahd("shipwreck/with_mast_degraded"),
      new ahd("shipwreck/rightsideup_full_degraded"),
      new ahd("shipwreck/rightsideup_fronthalf_degraded"),
      new ahd("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ahd[] c = new ahd[]{
      new ahd("shipwreck/with_mast"),
      new ahd("shipwreck/upsidedown_full"),
      new ahd("shipwreck/upsidedown_fronthalf"),
      new ahd("shipwreck/upsidedown_backhalf"),
      new ahd("shipwreck/sideways_full"),
      new ahd("shipwreck/sideways_fronthalf"),
      new ahd("shipwreck/sideways_backhalf"),
      new ahd("shipwreck/rightsideup_full"),
      new ahd("shipwreck/rightsideup_fronthalf"),
      new ahd("shipwreck/rightsideup_backhalf"),
      new ahd("shipwreck/with_mast_degraded"),
      new ahd("shipwreck/upsidedown_full_degraded"),
      new ahd("shipwreck/upsidedown_fronthalf_degraded"),
      new ahd("shipwreck/upsidedown_backhalf_degraded"),
      new ahd("shipwreck/sideways_full_degraded"),
      new ahd("shipwreck/sideways_fronthalf_degraded"),
      new ahd("shipwreck/sideways_backhalf_degraded"),
      new ahd("shipwreck/rightsideup_full_degraded"),
      new ahd("shipwreck/rightsideup_fronthalf_degraded"),
      new ahd("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ahd> d = Map.of("map_chest", egn.H, "treasure_chest", egn.J, "supply_chest", egn.I);

   public static void a(eda $$0, hx $$1, dcv $$2, dze $$3, aup $$4, boolean $$5) {
      ahd $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new ebo.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends dzj {
      private final boolean h;

      public a(eda $$0, ahd $$1, hx $$2, dcv $$3, boolean $$4) {
         super(dzq.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eda $$0, sl $$1) {
         super(dzq.ab, $$1, $$0, $$1x -> a(dcv.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(dzp $$0, sl $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static ecv a(dcv $$0) {
         return new ecv().a($$0).a(dbf.a).a(ebo.a).a(ecb.d);
      }

      @Override
      protected void a(String $$0, hx $$1, ctx $$2, aup $$3, dyr $$4) {
         ahd $$5 = ebo.d.get($$0);
         if ($$5 != null) {
            bkc.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         jb $$9 = this.b.a();
         doj.a $$10 = this.h ? doj.a.a : doj.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            hx $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (hx $$13 : hx.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new hx(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
