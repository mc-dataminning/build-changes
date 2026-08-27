import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ebm {
   public static final int a = 90;
   static final ahh b = new ahh("igloo/top");
   private static final ahh c = new ahh("igloo/middle");
   private static final ahh d = new ahh("igloo/bottom");
   static final Map<ahh, hx> e = ImmutableMap.of(b, new hx(3, 5, 5), c, new hx(1, 3, 1), d, new hx(3, 6, 7));
   static final Map<ahh, hx> f = ImmutableMap.of(b, hx.b, c, new hx(2, -3, 4), d, new hx(0, -3, -2));

   public static void a(edp $$0, hx $$1, ddk $$2, dzt $$3, auw $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ebm.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ebm.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ebm.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dzy {
      public a(edp $$0, ahh $$1, hx $$2, ddk $$3, int $$4) {
         super(eaf.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(edp $$0, so $$1) {
         super(eaf.I, $$1, $$0, $$1x -> a(ddk.valueOf($$1.l("Rot")), $$1x));
      }

      private static edk a(ddk $$0, ahh $$1) {
         return new edk().a($$0).a(dbu.a).a(ebm.e.get($$1)).a(ecq.b);
      }

      private static hx a(ahh $$0, hx $$1, int $$2) {
         return $$1.a(ebm.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eae $$0, so $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, cum $$2, auw $$3, dzg $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cxa.a.o(), 3);
            dhd $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dhk) {
               ((dhk)$$5).a(ehd.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
         ahh $$7 = new ahh(this.a);
         edk $$8 = a(this.c.d(), $$7);
         hx $$9 = ebm.f.get($$7);
         hx $$10 = this.d.a((jb)edo.a($$8, new hx(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(doy.a.a, $$10.u(), $$10.w());
         hx $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ebm.b)) {
            hx $$13 = this.d.a((jb)edo.a($$8, new hx(3, 0, 5)));
            djp $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cxa.cO)) {
               $$0.a($$13, cxa.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
