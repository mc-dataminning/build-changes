import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ell {
   public static final int a = 90;
   static final akq b = akq.b("igloo/top");
   private static final akq c = akq.b("igloo/middle");
   private static final akq d = akq.b("igloo/bottom");
   static final Map<akq, jd> e = ImmutableMap.of(b, new jd(3, 5, 5), c, new jd(1, 3, 1), d, new jd(3, 6, 7));
   static final Map<akq, jd> f = ImmutableMap.of(b, jd.c, c, new jd(2, -3, 4), d, new jd(0, -3, -2));

   public static void a(eno $$0, jd $$1, dmk $$2, ejr $$3, ayv $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ell.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ell.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ell.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends ejw {
      public a(eno $$0, akq $$1, jd $$2, dmk $$3, int $$4) {
         super(ekd.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(eno $$0, ua $$1) {
         super(ekd.I, $$1, $$0, $$1x -> a(dmk.valueOf($$1.l("Rot")), $$1x));
      }

      private static enj a(dmk $$0, akq $$1) {
         return new enj().a($$0).a(dkt.a).a(ell.e.get($$1)).a(emp.b);
      }

      private static jd a(akq $$0, jd $$1, int $$2) {
         return $$1.a(ell.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ekc $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, jd $$1, ddj $$2, ayv $$3, eje $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dfy.a.o(), 3);
            dqf $$5 = $$2.c_($$1.d());
            if ($$5 instanceof dqm) {
               ((dqm)$$5).a(erh.C, $$3.g());
            }
         }
      }

      @Override
      public void a(ddq $$0, ddo $$1, dux $$2, ayv $$3, eje $$4, dcb $$5, jd $$6) {
         akq $$7 = akq.a(this.a);
         enj $$8 = a(this.c.d(), $$7);
         jd $$9 = ell.f.get($$7);
         jd $$10 = this.d.a((kh)enn.a($$8, new jd(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dyv.a.a, $$10.u(), $$10.w());
         jd $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ell.b)) {
            jd $$13 = this.d.a((kh)enn.a($$8, new jd(3, 0, 5)));
            dta $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dfy.cO)) {
               $$0.a($$13, dfy.dP.o(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
