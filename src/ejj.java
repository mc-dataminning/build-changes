import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ejj {
   public static final int a = 90;
   static final akn b = new akn("igloo/top");
   private static final akn c = new akn("igloo/middle");
   private static final akn d = new akn("igloo/bottom");
   static final Map<akn, io> e = ImmutableMap.of(b, new io(3, 5, 5), c, new io(1, 3, 1), d, new io(3, 6, 7));
   static final Map<akn, io> f = ImmutableMap.of(b, io.c, c, new io(2, -3, 4), d, new io(0, -3, -2));

   public static void a(elm $$0, io $$1, dkn $$2, ehq $$3, aym $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ejj.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ejj.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ejj.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ehv {
      public a(elm $$0, akn $$1, io $$2, dkn $$3, int $$4) {
         super(eic.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(elm $$0, ud $$1) {
         super(eic.I, $$1, $$0, $$1x -> a(dkn.valueOf($$1.l("Rot")), $$1x));
      }

      private static elh a(dkn $$0, akn $$1) {
         return new elh().a($$0).a(dix.a).a(ejj.e.get($$1)).a(ekn.b);
      }

      private static io a(akn $$0, io $$1, int $$2) {
         return $$1.a(ejj.f.get($$0)).c($$2);
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, io $$1, dbo $$2, aym $$3, ehd $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dec.a.n(), 3);
            doi $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dop) {
               ((dop)$$5).a(epf.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         akn $$7 = new akn(this.a);
         elh $$8 = a(this.c.d(), $$7);
         io $$9 = ejj.f.get($$7);
         io $$10 = this.d.a((js)ell.a($$8, new io(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dwv.a.a, $$10.u(), $$10.w());
         io $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ejj.b)) {
            io $$13 = this.d.a((js)ell.a($$8, new io(3, 0, 5)));
            drd $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dec.cO)) {
               $$0.a($$13, dec.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
