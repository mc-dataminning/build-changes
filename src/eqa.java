import java.util.Map;

public class eqa {
   private static final int a = 32;
   static final ji b = new ji(4, 0, 15);
   private static final aku[] c = new aku[]{
      aku.b("shipwreck/with_mast"),
      aku.b("shipwreck/sideways_full"),
      aku.b("shipwreck/sideways_fronthalf"),
      aku.b("shipwreck/sideways_backhalf"),
      aku.b("shipwreck/rightsideup_full"),
      aku.b("shipwreck/rightsideup_fronthalf"),
      aku.b("shipwreck/rightsideup_backhalf"),
      aku.b("shipwreck/with_mast_degraded"),
      aku.b("shipwreck/rightsideup_full_degraded"),
      aku.b("shipwreck/rightsideup_fronthalf_degraded"),
      aku.b("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aku[] d = new aku[]{
      aku.b("shipwreck/with_mast"),
      aku.b("shipwreck/upsidedown_full"),
      aku.b("shipwreck/upsidedown_fronthalf"),
      aku.b("shipwreck/upsidedown_backhalf"),
      aku.b("shipwreck/sideways_full"),
      aku.b("shipwreck/sideways_fronthalf"),
      aku.b("shipwreck/sideways_backhalf"),
      aku.b("shipwreck/rightsideup_full"),
      aku.b("shipwreck/rightsideup_fronthalf"),
      aku.b("shipwreck/rightsideup_backhalf"),
      aku.b("shipwreck/with_mast_degraded"),
      aku.b("shipwreck/upsidedown_full_degraded"),
      aku.b("shipwreck/upsidedown_fronthalf_degraded"),
      aku.b("shipwreck/upsidedown_backhalf_degraded"),
      aku.b("shipwreck/sideways_full_degraded"),
      aku.b("shipwreck/sideways_fronthalf_degraded"),
      aku.b("shipwreck/sideways_backhalf_degraded"),
      aku.b("shipwreck/rightsideup_full_degraded"),
      aku.b("shipwreck/rightsideup_fronthalf_degraded"),
      aku.b("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, akt<evu>> e = Map.of("map_chest", evl.G, "treasure_chest", evl.I, "supply_chest", evl.H);

   public static eqa.a a(ern $$0, ji $$1, dqc $$2, enp $$3, azg $$4, boolean $$5) {
      aku $$6 = af.a($$5 ? c : d, $$4);
      eqa.a $$7 = new eqa.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends enu {
      private final boolean h;

      public a(ern $$0, aku $$1, ji $$2, dqc $$3, boolean $$4) {
         super(eob.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(ern $$0, tq $$1) {
         super(eob.ab, $$1, $$0, $$1x -> a(dqc.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(eoa $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static eri a(dqc $$0) {
         return new eri().a($$0).a(doj.a).a(eqa.b).a(eqn.d);
      }

      @Override
      protected void a(String $$0, ji $$1, dgx $$2, azg $$3, enc $$4) {
         akt<evu> $$5 = eqa.e.get($$0);
         if ($$5 != null) {
            bso.a($$2, $$3, $$1.e(), $$5);
         }
      }

      @Override
      public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, ji $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.an() + 1;
            int $$8 = 0;
            km $$9 = this.b.a();
            ecq.a $$10 = this.h ? ecq.a.a : ecq.a.c;
            int $$11 = $$9.u() * $$9.w();
            if ($$11 == 0) {
               $$8 = $$0.a($$10, this.d.u(), this.d.w());
            } else {
               ji $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

               for (ji $$13 : ji.c(this.d, $$12)) {
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
         km $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azg $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new ji(this.d.u(), $$0, this.d.w());
      }
   }
}
