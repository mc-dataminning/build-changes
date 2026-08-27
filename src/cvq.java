import javax.annotation.Nullable;

public class cvq extends csx {
   public static final dgl a = dgb.aQ;
   protected static final eii b = csx.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int c = 7;

   protected cvq(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == hc.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cvs || $$3.b() instanceof dfd;
   }

   @Override
   public dfl a(clp $$0) {
      return !this.n().a((cqa)$$0.q(), $$0.a()) ? csy.j.n() : super.a($$0);
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      int $$4 = $$0.c(a);
      if (!a((cqa)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(a, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cpd)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cpx $$0, dfl $$1, gw $$2, bis $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bji && ($$3 instanceof cbw || $$0.X().b(cpt.c)) && $$3.df() * $$3.df() * $$3.dg() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bis $$0, dfl $$1, cpx $$2, gw $$3) {
      dfl $$4 = a($$1, csy.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(djv.c, $$3, djv.a.a($$0, $$4));
   }

   private static boolean a(cpd $$0, gw $$1) {
      return $$0.a_($$1.c()).a(apu.cp);
   }

   private static boolean a(cqa $$0, gw $$1) {
      for (gw $$2 : gw.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(apz.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
