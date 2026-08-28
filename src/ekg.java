import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ekg {
   public static final int a = 90;
   static final ale b = new ale("igloo/top");
   private static final ale c = new ale("igloo/middle");
   private static final ale d = new ale("igloo/bottom");
   static final Map<ale, iz> e = ImmutableMap.of(b, new iz(3, 5, 5), c, new iz(1, 3, 1), d, new iz(3, 6, 7));
   static final Map<ale, iz> f = ImmutableMap.of(b, iz.c, c, new iz(2, -3, 4), d, new iz(0, -3, -2));

   public static void a(emj $$0, iz $$1, dlk $$2, ein $$3, azf $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ekg.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ekg.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ekg.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eis {
      public a(emj $$0, ale $$1, iz $$2, dlk $$3, int $$4) {
         super(eiz.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(emj $$0, ur $$1) {
         super(eiz.I, $$1, $$0, $$1x -> a(dlk.valueOf($$1.l("Rot")), $$1x));
      }

      private static eme a(dlk $$0, ale $$1) {
         return new eme().a($$0).a(dju.a).a(ekg.e.get($$1)).a(elk.b);
      }

      private static iz a(ale $$0, iz $$1, int $$2) {
         return $$1.a(ekg.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eiy $$0, ur $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, iz $$1, dcl $$2, azf $$3, eia $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dez.a.o(), 3);
            dpf $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dpm) {
               ((dpm)$$5).a(eqc.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dcr $$0, dcp $$1, dtx $$2, azf $$3, eia $$4, dbd $$5, iz $$6) {
         ale $$7 = new ale(this.a);
         eme $$8 = a(this.c.d(), $$7);
         iz $$9 = ekg.f.get($$7);
         iz $$10 = this.d.a((kd)emi.a($$8, new iz(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dxs.a.a, $$10.u(), $$10.w());
         iz $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ekg.b)) {
            iz $$13 = this.d.a((kd)emi.a($$8, new iz(3, 0, 5)));
            dsa $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dez.cO)) {
               $$0.a($$13, dez.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
