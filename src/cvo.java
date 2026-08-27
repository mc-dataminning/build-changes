import javax.annotation.Nullable;

public class cvo extends csv {
   public static final dgj a = dfz.aQ;
   protected static final eig b = csv.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int c = 7;

   protected cvo(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1 == hc.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      dfj $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cvq || $$3.b() instanceof dfb;
   }

   @Override
   public dfj a(cln $$0) {
      return !this.n().a((cpy)$$0.q(), $$0.a()) ? csw.j.n() : super.a($$0);
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   public void a(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      int $$4 = $$0.c(a);
      if (!a((cpy)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(a, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cpb)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cpv $$0, dfj $$1, gw $$2, biq $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bjg && ($$3 instanceof cbu || $$0.X().b(cpr.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable biq $$0, dfj $$1, cpv $$2, gw $$3) {
      dfj $$4 = a($$1, csw.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(djt.c, $$3, djt.a.a($$0, $$4));
   }

   private static boolean a(cpb $$0, gw $$1) {
      return $$0.a_($$1.c()).a(apt.cp);
   }

   private static boolean a(cpy $$0, gw $$1) {
      for (gw $$2 : gw.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(apy.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
