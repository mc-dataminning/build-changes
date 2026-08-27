import javax.annotation.Nullable;

public class cws extends crx {
   public static final dfs a = cwd.aC;
   public static final dfp b = dfo.w;
   public static final dfp c = dfo.o;
   public static final ehy d = csk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ehy e = csk.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ehy f = ehv.a(d, e);
   public static final ehy g = csk.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ehy h = ehv.a(f, g);
   public static final ehy i = ehv.a(
      csk.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), csk.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), csk.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), f
   );
   public static final ehy j = ehv.a(
      csk.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), csk.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), csk.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), f
   );
   public static final ehy k = ehv.a(
      csk.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), csk.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), csk.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), f
   );
   public static final ehy l = ehv.a(
      csk.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), csk.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), csk.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), f
   );
   private static final int m = 2;

   protected cws(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public ehy f(dey $$0, coq $$1, gv $$2) {
      return f;
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public dey a(cle $$0) {
      cpk $$1 = $$0.q();
      ciw $$2 = $$0.n();
      cbl $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gn()) {
         qs $$5 = cgp.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(a, $$0.g().g()).a(c, Boolean.valueOf($$4));
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return h;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((hb)$$0.c(a)) {
         case c:
            return j;
         case d:
            return l;
         case f:
            return k;
         case e:
            return i;
         default:
            return f;
      }
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddl($$0, $$1);
   }

   public static boolean a(@Nullable big $$0, cpk $$1, gv $$2, dey $$3, ciw $$4) {
      if (!$$3.c(c)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable big $$0, cpk $$1, gv $$2, dey $$3, ciw $$4) {
      if ($$1.c_($$2) instanceof ddl $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aou.cf, aov.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable big $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      dey $$5 = $$3.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dji.c, $$2, dji.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cpk $$0, gv $$1, dey $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cpk $$0, gv $$1, dey $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cpk $$0, gv $$1, dey $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(b)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dey $$0, cpk $$1, gv $$2) {
      if ($$1.c_($$2) instanceof ddl $$4) {
         hb $$5 = $$0.c(a);
         ciw $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         bye $$9 = new bye($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.o();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$3 == hb.b && $$0.c(b) ? 15 : 0;
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      if ($$0.c(c)) {
         dck $$3 = $$1.c_($$2);
         if ($$3 instanceof ddl) {
            return ((ddl)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$0.c(c)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bgo.a($$1.B);
      } else {
         ciw $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(apr.au) ? bgo.b : bgo.d;
      }
   }

   @Nullable
   @Override
   public bgr b(dey $$0, cpk $$1, gv $$2) {
      return !$$0.c(c) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cpk $$0, gv $$1, cbl $$2) {
      dck $$3 = $$0.c_($$1);
      if ($$3 instanceof ddl) {
         $$2.a((ddl)$$3);
         $$2.a(ape.au);
      }
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
