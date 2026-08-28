import java.util.Map;

public class ene {
   private static final int a = 32;
   static final je b = new je(4, 0, 15);
   private static final alb[] c = new alb[]{
      alb.b("shipwreck/with_mast"),
      alb.b("shipwreck/sideways_full"),
      alb.b("shipwreck/sideways_fronthalf"),
      alb.b("shipwreck/sideways_backhalf"),
      alb.b("shipwreck/rightsideup_full"),
      alb.b("shipwreck/rightsideup_fronthalf"),
      alb.b("shipwreck/rightsideup_backhalf"),
      alb.b("shipwreck/with_mast_degraded"),
      alb.b("shipwreck/rightsideup_full_degraded"),
      alb.b("shipwreck/rightsideup_fronthalf_degraded"),
      alb.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alb[] d = new alb[]{
      alb.b("shipwreck/with_mast"),
      alb.b("shipwreck/upsidedown_full"),
      alb.b("shipwreck/upsidedown_fronthalf"),
      alb.b("shipwreck/upsidedown_backhalf"),
      alb.b("shipwreck/sideways_full"),
      alb.b("shipwreck/sideways_fronthalf"),
      alb.b("shipwreck/sideways_backhalf"),
      alb.b("shipwreck/rightsideup_full"),
      alb.b("shipwreck/rightsideup_fronthalf"),
      alb.b("shipwreck/rightsideup_backhalf"),
      alb.b("shipwreck/with_mast_degraded"),
      alb.b("shipwreck/upsidedown_full_degraded"),
      alb.b("shipwreck/upsidedown_fronthalf_degraded"),
      alb.b("shipwreck/upsidedown_backhalf_degraded"),
      alb.b("shipwreck/sideways_full_degraded"),
      alb.b("shipwreck/sideways_fronthalf_degraded"),
      alb.b("shipwreck/sideways_backhalf_degraded"),
      alb.b("shipwreck/rightsideup_full_degraded"),
      alb.b("shipwreck/rightsideup_fronthalf_degraded"),
      alb.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ala<esy>> e = Map.of("map_chest", esp.H, "treasure_chest", esp.J, "supply_chest", esp.I);

   public static ene.a a(eor $$0, je $$1, dnj $$2, ekt $$3, azk $$4, boolean $$5) {
      alb $$6 = ad.a($$5 ? c : d, $$4);
      ene.a $$7 = new ene.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends eky {
      private final boolean h;

      public a(eor $$0, alb $$1, je $$2, dnj $$3, boolean $$4) {
         super(elf.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eor $$0, uf $$1) {
         super(elf.ab, $$1, $$0, $$1x -> a(dnj.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static eom a(dnj $$0) {
         return new eom().a($$0).a(dls.a).a(ene.b).a(enr.d);
      }

      @Override
      protected void a(String $$0, je $$1, dei $$2, azk $$3, ekg $$4) {
         ala<esy> $$5 = ene.e.get($$0);
         if ($$5 != null) {
            brq.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.an();
            int $$8 = 0;
            ki $$9 = this.b.a();
            dzw.a $$10 = this.h ? dzw.a.a : dzw.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               je $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (je $$13 : je.c(this.d, $$12)) {
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
         ki $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azk $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new je(this.d.u(), $$0, this.d.w());
      }
   }
}
