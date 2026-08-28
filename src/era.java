import java.util.Map;

public class era {
   private static final int a = 32;
   static final jh b = new jh(4, 0, 15);
   private static final alz[] c = new alz[]{
      alz.b("shipwreck/with_mast"),
      alz.b("shipwreck/sideways_full"),
      alz.b("shipwreck/sideways_fronthalf"),
      alz.b("shipwreck/sideways_backhalf"),
      alz.b("shipwreck/rightsideup_full"),
      alz.b("shipwreck/rightsideup_fronthalf"),
      alz.b("shipwreck/rightsideup_backhalf"),
      alz.b("shipwreck/with_mast_degraded"),
      alz.b("shipwreck/rightsideup_full_degraded"),
      alz.b("shipwreck/rightsideup_fronthalf_degraded"),
      alz.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alz[] d = new alz[]{
      alz.b("shipwreck/with_mast"),
      alz.b("shipwreck/upsidedown_full"),
      alz.b("shipwreck/upsidedown_fronthalf"),
      alz.b("shipwreck/upsidedown_backhalf"),
      alz.b("shipwreck/sideways_full"),
      alz.b("shipwreck/sideways_fronthalf"),
      alz.b("shipwreck/sideways_backhalf"),
      alz.b("shipwreck/rightsideup_full"),
      alz.b("shipwreck/rightsideup_fronthalf"),
      alz.b("shipwreck/rightsideup_backhalf"),
      alz.b("shipwreck/with_mast_degraded"),
      alz.b("shipwreck/upsidedown_full_degraded"),
      alz.b("shipwreck/upsidedown_fronthalf_degraded"),
      alz.b("shipwreck/upsidedown_backhalf_degraded"),
      alz.b("shipwreck/sideways_full_degraded"),
      alz.b("shipwreck/sideways_fronthalf_degraded"),
      alz.b("shipwreck/sideways_backhalf_degraded"),
      alz.b("shipwreck/rightsideup_full_degraded"),
      alz.b("shipwreck/rightsideup_fronthalf_degraded"),
      alz.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aly<ewu>> e = Map.of("map_chest", ewl.G, "treasure_chest", ewl.I, "supply_chest", ewl.H);

   public static era.a a(esn $$0, jh $$1, drc $$2, eop $$3, bam $$4, boolean $$5) {
      alz $$6 = ae.a($$5 ? c : d, $$4);
      era.a $$7 = new era.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends eou {
      private final boolean h;

      public a(esn $$0, alz $$1, jh $$2, drc $$3, boolean $$4) {
         super(epb.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(esn $$0, ux $$1) {
         super(epb.ab, $$1, $$0, $$1x -> a(drc.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(epa $$0, ux $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static esi a(drc $$0) {
         return new esi().a($$0).a(dpl.a).a(era.b).a(ern.d);
      }

      @Override
      protected void a(String $$0, jh $$1, dhz $$2, bam $$3, eoc $$4) {
         aly<ewu> $$5 = era.e.get($$0);
         if ($$5 != null) {
            btp.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dig $$0, die $$1, dzr $$2, bam $$3, eoc $$4, dgo $$5, jh $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.am() + 1;
            int $$8 = 0;
            kl $$9 = this.b.a();
            edq.a $$10 = this.h ? edq.a.a : edq.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               jh $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (jh $$13 : jh.c(this.d, $$12)) {
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
         kl $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, bam $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new jh(this.d.u(), $$0, this.d.w());
      }
   }
}
