import java.util.Map;

public class etr {
   private static final int a = 32;
   static final iu b = new iu(4, 0, 15);
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
   static final Map<String, alf<ezm>> e = Map.of("map_chest", ezd.G, "treasure_chest", ezd.I, "supply_chest", ezd.H);

   public static etr.a a(eve $$0, iu $$1, dsz $$2, erg $$3, azv $$4, boolean $$5) {
      alg $$6 = af.a($$5 ? c : d, $$4);
      etr.a $$7 = new etr.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends erl {
      private final boolean h;

      public a(eve $$0, alg $$1, iu $$2, dsz $$3, boolean $$4) {
         super(ers.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eve $$0, tz $$1) {
         super(ers.ab, $$1, $$0, $$1x -> a(dsz.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(err $$0, tz $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static euz a(dsz $$0) {
         return new euz().a($$0).a(dri.a).a(etr.b).a(eue.d);
      }

      @Override
      protected void a(String $$0, iu $$1, djr $$2, azv $$3, eqt $$4) {
         alf<ezm> $$5 = etr.e.get($$0);
         if ($$5 != null) {
            buj.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(djz $$0, djw $$1, ecf $$2, azv $$3, eqt $$4, dih $$5, iu $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.ao() + 1;
            int $$8 = 0;
            jz $$9 = this.b.a();
            egg.a $$10 = this.h ? egg.a.a : egg.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               iu $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (iu $$13 : iu.c(this.d, $$12)) {
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
         jz $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azv $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iu(this.d.u(), $$0, this.d.w());
      }
   }
}
