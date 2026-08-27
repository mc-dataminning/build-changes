import javax.annotation.Nullable;

public class cvd extends csk {
   public static final dfy a = dfo.aQ;
   protected static final ehy b = csk.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int c = 7;

   protected cvd(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == hb.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      dey $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cvf || $$3.b() instanceof deq;
   }

   @Override
   public dey a(cle $$0) {
      return !this.n().a((cpn)$$0.q(), $$0.a()) ? csl.j.n() : super.a($$0);
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      int $$4 = $$0.c(a);
      if (!a((cpn)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(a, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((coq)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, gv $$2, big $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof biw && ($$3 instanceof cbl || $$0.X().b(cpg.c)) && $$3.df() * $$3.df() * $$3.dg() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable big $$0, dey $$1, cpk $$2, gv $$3) {
      dey $$4 = a($$1, csl.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dji.c, $$3, dji.a.a($$0, $$4));
   }

   private static boolean a(coq $$0, gv $$1) {
      return $$0.a_($$1.c()).a(apj.cp);
   }

   private static boolean a(cpn $$0, gv $$1) {
      for (gv $$2 : gv.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(apo.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
