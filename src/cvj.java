import javax.annotation.Nullable;

public class cvj extends csq {
   public static final dge a = dfu.aQ;
   protected static final eib b = csq.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int c = 7;

   protected cvj(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1 == hc.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      dfe $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cvl || $$3.b() instanceof dew;
   }

   @Override
   public dfe a(cli $$0) {
      return !this.n().a((cpt)$$0.q(), $$0.a()) ? csr.j.n() : super.a($$0);
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      int $$4 = $$0.c(a);
      if (!a((cpt)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(a, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cow)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cpq $$0, dfe $$1, gw $$2, bil $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bjb && ($$3 instanceof cbp || $$0.X().b(cpm.c)) && $$3.df() * $$3.df() * $$3.dg() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bil $$0, dfe $$1, cpq $$2, gw $$3) {
      dfe $$4 = a($$1, csr.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(djo.c, $$3, djo.a.a($$0, $$4));
   }

   private static boolean a(cow $$0, gw $$1) {
      return $$0.a_($$1.c()).a(apo.cp);
   }

   private static boolean a(cpt $$0, gw $$1) {
      for (gw $$2 : gw.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(apt.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
