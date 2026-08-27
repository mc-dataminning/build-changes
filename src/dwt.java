import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dwt {
   public static final int a = 90;
   static final aez b = new aez("igloo/top");
   private static final aez c = new aez("igloo/middle");
   private static final aez d = new aez("igloo/bottom");
   static final Map<aez, gw> e = ImmutableMap.of(b, new gw(3, 5, 5), c, new gw(1, 3, 1), d, new gw(3, 6, 7));
   static final Map<aez, gw> f = ImmutableMap.of(b, gw.b, c, new gw(2, -3, 4), d, new gw(0, -3, -2));

   public static void a(dyw $$0, gw $$1, czn $$2, dvh $$3, ash $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dwt.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new dwt.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dwt.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dvm {
      public a(dyw $$0, aez $$1, gw $$2, czn $$3, int $$4) {
         super(dvt.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dyw $$0, qw $$1) {
         super(dvt.I, $$1, $$0, $$1x -> a(czn.valueOf($$1.l("Rot")), $$1x));
      }

      private static dyr a(czn $$0, aez $$1) {
         return new dyr().a($$0).a(cxx.a).a(dwt.e.get($$1)).a(dxx.b);
      }

      private static gw a(aez $$0, gw $$1, int $$2) {
         return $$1.a(dwt.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dvs $$0, qw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gw $$1, cqq $$2, ash $$3, duu $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cte.a.o(), 3);
            dcz $$5 = $$2.c_($$1.d());
            if ($$5 instanceof ddg) {
               ((ddg)$$5).a(eci.C, $$3.g());
            }
         }
      }

      @Override
      public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
         aez $$7 = new aez(this.a);
         dyr $$8 = a(this.c.d(), $$7);
         gw $$9 = dwt.f.get($$7);
         gw $$10 = this.d.a((hy)dyv.a($$8, new gw(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dkm.a.a, $$10.u(), $$10.w());
         gw $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dwt.b)) {
            gw $$13 = this.d.a((hy)dyv.a($$8, new gw(3, 0, 5)));
            dfd $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(cte.cO)) {
               $$0.a($$13, cte.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
