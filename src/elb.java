import java.util.Map;

public class elb {
   private static final int a = 32;
   static final iz b = new iz(4, 0, 15);
   private static final alf[] c = new alf[]{
      new alf("shipwreck/with_mast"),
      new alf("shipwreck/sideways_full"),
      new alf("shipwreck/sideways_fronthalf"),
      new alf("shipwreck/sideways_backhalf"),
      new alf("shipwreck/rightsideup_full"),
      new alf("shipwreck/rightsideup_fronthalf"),
      new alf("shipwreck/rightsideup_backhalf"),
      new alf("shipwreck/with_mast_degraded"),
      new alf("shipwreck/rightsideup_full_degraded"),
      new alf("shipwreck/rightsideup_fronthalf_degraded"),
      new alf("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final alf[] d = new alf[]{
      new alf("shipwreck/with_mast"),
      new alf("shipwreck/upsidedown_full"),
      new alf("shipwreck/upsidedown_fronthalf"),
      new alf("shipwreck/upsidedown_backhalf"),
      new alf("shipwreck/sideways_full"),
      new alf("shipwreck/sideways_fronthalf"),
      new alf("shipwreck/sideways_backhalf"),
      new alf("shipwreck/rightsideup_full"),
      new alf("shipwreck/rightsideup_fronthalf"),
      new alf("shipwreck/rightsideup_backhalf"),
      new alf("shipwreck/with_mast_degraded"),
      new alf("shipwreck/upsidedown_full_degraded"),
      new alf("shipwreck/upsidedown_fronthalf_degraded"),
      new alf("shipwreck/upsidedown_backhalf_degraded"),
      new alf("shipwreck/sideways_full_degraded"),
      new alf("shipwreck/sideways_fronthalf_degraded"),
      new alf("shipwreck/sideways_backhalf_degraded"),
      new alf("shipwreck/rightsideup_full_degraded"),
      new alf("shipwreck/rightsideup_fronthalf_degraded"),
      new alf("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, ale<eqp>> e = Map.of("map_chest", eqg.H, "treasure_chest", eqg.J, "supply_chest", eqg.I);

   public static elb.a a(emn $$0, iz $$1, dlo $$2, eir $$3, azh $$4, boolean $$5) {
      alf $$6 = ac.a($$5 ? c : d, $$4);
      elb.a $$7 = new elb.a($$0, $$6, $$1, $$2, $$5);
      $$3.a($$7);
      return $$7;
   }

   public static class a extends eiw {
      private final boolean h;

      public a(emn $$0, alf $$1, iz $$2, dlo $$3, boolean $$4) {
         super(ejd.ab, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.h = $$4;
      }

      public a(emn $$0, us $$1) {
         super(ejd.ab, $$1, $$0, $$1x -> a(dlo.valueOf($$1.l("Rot"))));
         this.h = $$1.q("isBeached");
      }

      @Override
      protected void a(ejc $$0, us $$1) {
         super.a($$0, $$1);
         $$1.a("isBeached", this.h);
         $$1.a("Rot", this.c.d().name());
      }

      private static emi a(dlo $$0) {
         return new emi().a($$0).a(djy.a).a(elb.b).a(elo.d);
      }

      @Override
      protected void a(String $$0, iz $$1, dcp $$2, azh $$3, eie $$4) {
         ale<eqp> $$5 = elb.e.get($$0);
         if ($$5 != null) {
            bre.a($$2, $$3, $$1.d(), $$5);
         }
      }

      @Override
      public void a(dcv $$0, dct $$1, dub $$2, azh $$3, eie $$4, dbh $$5, iz $$6) {
         if (this.l()) {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         } else {
            int $$7 = $$0.am();
            int $$8 = 0;
            kd $$9 = this.b.a();
            dxw.a $$10 = this.h ? dxw.a.a : dxw.a.c;
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

            this.c(this.h ? this.a($$7, $$3) : $$8);
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         }
      }

      public boolean l() {
         kd $$0 = this.b.a();
         return $$0.u() > 32 || $$0.v() > 32;
      }

      public int a(int $$0, azh $$1) {
         return $$0 - this.b.a().v() / 2 - $$1.a(3);
      }

      public void c(int $$0) {
         this.d = new iz(this.d.u(), $$0, this.d.w());
      }
   }
}
