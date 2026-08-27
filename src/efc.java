import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class efc {
   public static final int a = 90;
   static final ajh b = new ajh("igloo/top");
   private static final ajh c = new ajh("igloo/middle");
   private static final ajh d = new ajh("igloo/bottom");
   static final Map<ajh, ib> e = ImmutableMap.of(b, new ib(3, 5, 5), c, new ib(1, 3, 1), d, new ib(3, 6, 7));
   static final Map<ajh, ib> f = ImmutableMap.of(b, ib.c, c, new ib(2, -3, 4), d, new ib(0, -3, -2));

   public static void a(ehf $$0, ib $$1, dgo $$2, edj $$3, axd $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new efc.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new efc.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new efc.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends edo {
      public a(ehf $$0, ajh $$1, ib $$2, dgo $$3, int $$4) {
         super(edv.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ehf $$0, ta $$1) {
         super(edv.I, $$1, $$0, $$1x -> a(dgo.valueOf($$1.l("Rot")), $$1x));
      }

      private static eha a(dgo $$0, ajh $$1) {
         return new eha().a($$0).a(dey.a).a(efc.e.get($$1)).a(egg.b);
      }

      private static ib a(ajh $$0, ib $$1, int $$2) {
         return $$1.a(efc.f.get($$0)).c($$2);
      }

      @Override
      protected void a(edu $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ib $$1, cxq $$2, axd $$3, ecw $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dae.a.o(), 3);
            dki $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dkp) {
               ((dkp)$$5).a(eku.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cxw $$0, cxu $$1, doy $$2, axd $$3, ecw $$4, cwi $$5, ib $$6) {
         ajh $$7 = new ajh(this.a);
         eha $$8 = a(this.c.d(), $$7);
         ib $$9 = efc.f.get($$7);
         ib $$10 = this.d.a((jg)ehe.a($$8, new ib(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dso.a.a, $$10.u(), $$10.w());
         ib $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(efc.b)) {
            ib $$13 = this.d.a((jg)ehe.a($$8, new ib(3, 0, 5)));
            dnb $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dae.cO)) {
               $$0.a($$13, dae.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
