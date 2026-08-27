import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dwu {
   public static final int a = 90;
   static final aeu b = new aeu("igloo/top");
   private static final aeu c = new aeu("igloo/middle");
   private static final aeu d = new aeu("igloo/bottom");
   static final Map<aeu, gw> e = ImmutableMap.of(b, new gw(3, 5, 5), c, new gw(1, 3, 1), d, new gw(3, 6, 7));
   static final Map<aeu, gw> f = ImmutableMap.of(b, gw.b, c, new gw(2, -3, 4), d, new gw(0, -3, -2));

   public static void a(dyx $$0, gw $$1, czc $$2, dvi $$3, arx $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dwu.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dwu.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dwu.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dvn {
      public a(dyx $$0, aeu $$1, gw $$2, czc $$3, int $$4) {
         super(dvu.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dyx $$0, qu $$1) {
         super(dvu.I, $$1, $$0, $$1x -> a(czc.valueOf($$1.l("Rot")), $$1x));
      }

      private static dys a(czc $$0, aeu $$1) {
         return new dys().a($$0).a(cxl.a).a(dwu.e.get($$1)).a(dxy.b);
      }

      private static gw a(aeu $$0, gw $$1, int $$2) {
         return $$1.a(dwu.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dvt $$0, qu $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqf $$2, arx $$3, duv $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, csr.a.n(), 3);
            dcq $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dcx) {
               ((dcx)$$5).a(ecj.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cqk $$0, cqi $$1, dhb $$2, arx $$3, duv $$4, cox $$5, gw $$6) {
         aeu $$7 = new aeu(this.a);
         dys $$8 = a(this.c.d(), $$7);
         gw $$9 = dwu.f.get($$7);
         gw $$10 = this.d.a((ib)dyw.a($$8, new gw(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dkn.a.a, $$10.u(), $$10.w());
         gw $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dwu.b)) {
            gw $$13 = this.d.a((ib)dyw.a($$8, new gw(3, 0, 5)));
            dfe $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(csr.cO)) {
               $$0.a($$13, csr.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
