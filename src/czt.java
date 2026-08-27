import javax.annotation.Nullable;

public class czt extends csk {
   public static final int a = 8;
   public static final dfy b = dfo.aF;
   protected static final ehy[] c = new ehy[]{
      ehv.a(),
      csk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int d = 5;

   protected czt(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      switch ($$3) {
         case a:
            return $$0.c(b) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return c[$$0.c(b) - 1];
   }

   @Override
   public ehy b_(dey $$0, coq $$1, gv $$2) {
      return c[$$0.c(b)];
   }

   @Override
   public ehy b(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return c[$$0.c(b)];
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public float b(dey $$0, coq $$1, gv $$2) {
      return $$0.c(b) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      dey $$3 = $$1.a_($$2.d());
      if ($$3.a(apj.cg)) {
         return false;
      } else {
         return $$3.a(apj.ch) ? true : csk.a($$3.k($$1, $$2.d()), hb.b) || $$3.a(this) && $$3.c(b) == 8;
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.a(cpt.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      int $$2 = $$0.c(b);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == hb.b : true;
      }
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(b);
         return $$1.a(b, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
   }
}
