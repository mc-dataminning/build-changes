import javax.annotation.Nullable;

public class cvf extends cuc {
   public cvf(cuc.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cuh $$0, bso $$1, bso $$2) {
      $$0.a(1, $$2, bsc.a);
      return true;
   }

   public static cxl a(int $$0, float $$1) {
      return cxl.a()
         .a(btv.c, new btt(e, "Weapon modifier", (double)$$0, btt.a.a), bsd.b)
         .a(btv.e, new btt(f, "Weapon modifier", (double)$$1, btt.a.a), bsd.b)
         .a();
   }

   private static float a(dca $$0) {
      return $$0.A.a(0.8F, 1.2F);
   }

   public static void a(dca $$0, @Nullable cly $$1, ir $$2, avq $$3) {
      $$0.a($$1, $$2, avo.ig, $$3, 1.0F, a($$0));
   }

   public static void a(dca $$0, brv $$1) {
      $$1.a(avo.ig, 1.0F, a($$0));
   }

   public static void a(dca $$0, brv $$1, avq $$2) {
      $$0.a(null, $$1, avo.ig, $$2, 1.0F, a($$0));
   }

   private static bqa a(cyf $$0, cuh $$1, dtc $$2) {
      dca $$3 = $$0.q();
      ir $$4 = $$0.a();
      cly $$5 = $$0.o();
      cuh $$6 = $$0.n();
      a($$3, $$5, $$4, avq.e);
      $$3.b($$4, $$2);
      if ($$3 instanceof aqt) {
         if ($$2.i()) {
            dfc.a($$3, $$4, $$1);
         } else {
            dfc.a($$3, $$4, $$0.k(), $$1);
         }
      }

      if ($$5 != null) {
         $$6.a(1, $$5, bso.d($$0.p()));
      }

      if ($$5 instanceof aqu $$7) {
         an.an.a($$7);
      }

      return bqa.a($$3.C);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      dfc $$4 = $$3.b();
      if ($$4 instanceof dle $$5) {
         return a($$0, new cuh($$5.c(), 9), dfe.a.n());
      } else if ($$4 == dfe.k && $$0.k() == iw.b) {
         return a($$0, ((cuc)cuk.AD.get(cve.a)).v(), dfe.n.n());
      } else if ($$4 == dfe.l && $$0.k() == iw.b) {
         return a($$0, cuk.AF.v(), dfe.n.n());
      } else {
         return $$4 == dfe.L ? a($$0, new cuh(cuk.vT, 9), dfe.uT.get(csy.a).n()) : super.a($$0);
      }
   }
}
