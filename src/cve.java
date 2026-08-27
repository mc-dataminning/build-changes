import javax.annotation.Nullable;

public class cve extends csl {
   public static final dfz a = dfp.aQ;
   protected static final ehw b = csl.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int c = 7;

   protected cve(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1 == ha.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      dez $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cvg || $$3.b() instanceof der;
   }

   @Override
   public dez a(clf $$0) {
      return !this.n().a((cpo)$$0.q(), $$0.a()) ? csm.j.n() : super.a($$0);
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = $$0.c(a);
      if (!a((cpo)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(a, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cor)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(a, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cpl $$0, dez $$1, gu $$2, bii $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof biy && ($$3 instanceof cbm || $$0.X().b(cph.c)) && $$3.df() * $$3.df() * $$3.dg() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bii $$0, dez $$1, cpl $$2, gu $$3) {
      dez $$4 = a($$1, csm.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(djj.c, $$3, djj.a.a($$0, $$4));
   }

   private static boolean a(cor $$0, gu $$1) {
      return $$0.a_($$1.c()).a(apl.cp);
   }

   private static boolean a(cpo $$0, gu $$1) {
      for (gu $$2 : gu.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(apq.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
