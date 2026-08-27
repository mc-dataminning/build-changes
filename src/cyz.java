public class cyz extends csk implements czl {
   private static final int e = 1;
   private static final ehy f;
   private static final ehy g;
   private static final ehy h = csk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final ehy i = ehv.b().a(0.0, -1.0, 0.0);
   public static final int a = 7;
   public static final dfy b = dfo.aW;
   public static final dfp c = dfo.C;
   public static final dfp d = dfo.b;

   protected cyz(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(d) ? g : f;
      } else {
         return ehv.b();
      }
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2) {
      return ehv.b();
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dey a(cle $$0) {
      gv $$1 = $$0.a();
      cpk $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(c, Boolean.valueOf($$2.b_($$1).a() == eac.c)).a(b, Integer.valueOf($$3)).a(d, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      if (!$$3.r_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      int $$4 = a($$1, $$2);
      dey $$5 = $$0.a(b, Integer.valueOf($$4)).a(d, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(b) == 7) {
         if ($$0.c(b) == 7) {
            byd.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if ($$3.a(ehv.b(), $$2, true) && !$$3.b()) {
         return f;
      } else {
         return $$0.c(b) != 0 && $$0.c(d) && $$3.a(i, $$2, true) ? h : ehv.a();
      }
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(c) ? eac.c.a(false) : super.c_($$0);
   }

   private boolean a(coq $$0, gv $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(coq $$0, gv $$1) {
      gv.a $$2 = $$1.j().c(hb.a);
      dey $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(csl.nS)) {
         $$4 = $$3.c(b);
      } else if ($$3.d($$0, $$2, hb.b)) {
         return 0;
      }

      for (hb $$5 : hb.c.a) {
         dey $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(csl.nS)) {
            $$4 = Math.min($$4, $$6.c(b) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      ehy $$0 = csk.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      ehy $$1 = csk.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      ehy $$2 = csk.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      ehy $$3 = csk.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      ehy $$4 = csk.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      f = ehv.a($$0, $$1, $$2, $$3, $$4);
      ehy $$5 = csk.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      ehy $$6 = csk.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      ehy $$7 = csk.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      ehy $$8 = csk.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      g = ehv.a(cyz.h, f, $$6, $$5, $$8, $$7);
   }
}
