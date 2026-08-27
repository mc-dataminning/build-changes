import java.util.Map;

public class edt {
   static final hz a = new hz(4, 0, 15);
   private static final aiy[] b = new aiy[]{
      new aiy("shipwreck/with_mast"),
      new aiy("shipwreck/sideways_full"),
      new aiy("shipwreck/sideways_fronthalf"),
      new aiy("shipwreck/sideways_backhalf"),
      new aiy("shipwreck/rightsideup_full"),
      new aiy("shipwreck/rightsideup_fronthalf"),
      new aiy("shipwreck/rightsideup_backhalf"),
      new aiy("shipwreck/with_mast_degraded"),
      new aiy("shipwreck/rightsideup_full_degraded"),
      new aiy("shipwreck/rightsideup_fronthalf_degraded"),
      new aiy("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final aiy[] c = new aiy[]{
      new aiy("shipwreck/with_mast"),
      new aiy("shipwreck/upsidedown_full"),
      new aiy("shipwreck/upsidedown_fronthalf"),
      new aiy("shipwreck/upsidedown_backhalf"),
      new aiy("shipwreck/sideways_full"),
      new aiy("shipwreck/sideways_fronthalf"),
      new aiy("shipwreck/sideways_backhalf"),
      new aiy("shipwreck/rightsideup_full"),
      new aiy("shipwreck/rightsideup_fronthalf"),
      new aiy("shipwreck/rightsideup_backhalf"),
      new aiy("shipwreck/with_mast_degraded"),
      new aiy("shipwreck/upsidedown_full_degraded"),
      new aiy("shipwreck/upsidedown_fronthalf_degraded"),
      new aiy("shipwreck/upsidedown_backhalf_degraded"),
      new aiy("shipwreck/sideways_full_degraded"),
      new aiy("shipwreck/sideways_fronthalf_degraded"),
      new aiy("shipwreck/sideways_backhalf_degraded"),
      new aiy("shipwreck/rightsideup_full_degraded"),
      new aiy("shipwreck/rightsideup_fronthalf_degraded"),
      new aiy("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, aiy> d = Map.of("map_chest", eit.H, "treasure_chest", eit.J, "supply_chest", eit.I);

   public static void a(eff $$0, hz $$1, dfa $$2, ebj $$3, awo $$4, boolean $$5) {
      aiy $$6 = ac.a($$5 ? b : c, $$4);
      $$3.a(new edt.a($$0, $$6, $$1, $$2, $$5));
   }

   public static class a extends ebo {
      private final boolean h;

      public a(eff $$0, aiy $$1, hz $$2, dfa $$3, boolean $$4) {
         super(ebv.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(eff $$0, sw $$1) {
         super(ebv.ab, $$1, $$0, $$1x -> a(dfa.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ebu $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static efa a(dfa $$0) {
         return new efa().a($$0).a(ddk.a).a(edt.a).a(eeg.d);
      }

      @Override
      protected void a(String $$0, hz $$1, cwc $$2, awo $$3, eaw $$4) {
         aiy $$5 = edt.d.get($$0);
         if ($$5 != null) {
            bmc.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, hz $$6) {
         int $$7 = $$0.al();
         int $$8 = 0;
         jd $$9 = this.b.a();
         dqo.a $$10 = this.h ? dqo.a.a : dqo.a.c;
         int $$11 = $$9.u() * $$9.w();
         if ($$11 == 0) {
            $$8 = $$0.a($$10, this.d.u(), this.d.w());
         } else {
            hz $$12 = this.d.b($$9.u() - 1, 0, $$9.w() - 1);

            for (hz $$13 : hz.a(this.d, $$12)) {
               int $$14 = $$0.a($$10, $$13.u(), $$13.w());
               $$8 += $$14;
               $$7 = Math.min($$7, $$14);
            }

            $$8 /= $$11;
         }

         int $$15 = this.h ? $$7 - $$9.v() / 2 - $$3.a(3) : $$8;
         this.d = new hz(this.d.u(), $$15, this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
