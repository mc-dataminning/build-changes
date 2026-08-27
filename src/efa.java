import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class efa {
   public static final int a = 90;
   static final ajh b = new ajh("igloo/top");
   private static final ajh c = new ajh("igloo/middle");
   private static final ajh d = new ajh("igloo/bottom");
   static final Map<ajh, ib> e = ImmutableMap.of(b, new ib(3, 5, 5), c, new ib(1, 3, 1), d, new ib(3, 6, 7));
   static final Map<ajh, ib> f = ImmutableMap.of(b, ib.c, c, new ib(2, -3, 4), d, new ib(0, -3, -2));

   public static void a(ehd $$0, ib $$1, dgm $$2, edh $$3, axd $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new efa.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new efa.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new efa.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends edm {
      public a(ehd $$0, ajh $$1, ib $$2, dgm $$3, int $$4) {
         super(edt.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ehd $$0, ta $$1) {
         super(edt.I, $$1, $$0, $$1x -> a(dgm.valueOf($$1.l("Rot")), $$1x));
      }

      private static egy a(dgm $$0, ajh $$1) {
         return new egy().a($$0).a(dew.a).a(efa.e.get($$1)).a(ege.b);
      }

      private static ib a(ajh $$0, ib $$1, int $$2) {
         return $$1.a(efa.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, ib $$1, cxo $$2, axd $$3, ecu $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dac.a.o(), 3);
            dkg $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dkn) {
               ((dkn)$$5).a(eks.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         ajh $$7 = new ajh(this.a);
         egy $$8 = a(this.c.d(), $$7);
         ib $$9 = efa.f.get($$7);
         ib $$10 = this.d.a((jg)ehc.a($$8, new ib(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dsm.a.a, $$10.u(), $$10.w());
         ib $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(efa.b)) {
            ib $$13 = this.d.a((jg)ehc.a($$8, new ib(3, 0, 5)));
            dmz $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dac.cO)) {
               $$0.a($$13, dac.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
