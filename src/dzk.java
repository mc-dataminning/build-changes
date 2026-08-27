import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dzk {
   public static final int a = 90;
   static final agm b = new agm("igloo/top");
   private static final agm c = new agm("igloo/middle");
   private static final agm d = new agm("igloo/bottom");
   static final Map<agm, hx> e = ImmutableMap.of(b, new hx(3, 5, 5), c, new hx(1, 3, 1), d, new hx(3, 6, 7));
   static final Map<agm, hx> f = ImmutableMap.of(b, hx.b, c, new hx(2, -3, 4), d, new hx(0, -3, -2));

   public static void a(ebn $$0, hx $$1, dbr $$2, dxr $$3, atw $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dzk.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dzk.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dzk.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dxw {
      public a(ebn $$0, agm $$1, hx $$2, dbr $$3, int $$4) {
         super(dyd.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(ebn $$0, sd $$1) {
         super(dyd.I, $$1, $$0, $$1x -> a(dbr.valueOf($$1.l("Rot")), $$1x));
      }

      private static ebi a(dbr $$0, agm $$1) {
         return new ebi().a($$0).a(dab.a).a(dzk.e.get($$1)).a(eao.b);
      }

      private static hx a(agm $$0, hx $$1, int $$2) {
         return $$1.a(dzk.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, hx $$1, csu $$2, atw $$3, dxe $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cvh.a.o(), 3);
            dfi $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dfp) {
               ((dfp)$$5).a(efa.C, $$3.g());
            }
         }
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         agm $$7 = new agm(this.a);
         ebi $$8 = a(this.c.d(), $$7);
         hx $$9 = dzk.f.get($$7);
         hx $$10 = this.d.a((ja)ebm.a($$8, new hx(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dmw.a.a, $$10.u(), $$10.w());
         hx $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dzk.b)) {
            hx $$13 = this.d.a((ja)ebm.a($$8, new hx(3, 0, 5)));
            dhn $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cvh.cO)) {
               $$0.a($$13, cvh.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
