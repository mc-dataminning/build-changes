import javax.annotation.Nullable;

public class cwt extends cry {
   public static final dft a = cwe.aC;
   public static final dfq b = dfp.w;
   public static final dfq c = dfp.o;
   public static final ehw d = csl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ehw e = csl.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ehw f = eht.a(d, e);
   public static final ehw g = csl.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ehw h = eht.a(f, g);
   public static final ehw i = eht.a(
      csl.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), csl.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), csl.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), f
   );
   public static final ehw j = eht.a(
      csl.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), csl.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), csl.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), f
   );
   public static final ehw k = eht.a(
      csl.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), csl.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), csl.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), f
   );
   public static final ehw l = eht.a(
      csl.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), csl.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), csl.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), f
   );
   private static final int m = 2;

   protected cwt(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public ehw f(dez $$0, cor $$1, gu $$2) {
      return f;
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public dez a(clf $$0) {
      cpl $$1 = $$0.q();
      cix $$2 = $$0.n();
      cbm $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gn()) {
         qr $$5 = cgq.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(a, $$0.g().g()).a(c, Boolean.valueOf($$4));
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return h;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      switch ((ha)$$0.c(a)) {
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
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddm($$0, $$1);
   }

   public static boolean a(@Nullable bii $$0, cpl $$1, gu $$2, dez $$3, cix $$4) {
      if (!$$3.c(c)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bii $$0, cpl $$1, gu $$2, dez $$3, cix $$4) {
      if ($$1.c_($$2) instanceof ddm $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aow.cf, aox.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bii $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      dez $$5 = $$3.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(djj.c, $$2, djj.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cpl $$0, gu $$1, dez $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cpl $$0, gu $$1, dez $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cpl $$0, gu $$1, dez $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
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

   private void d(dez $$0, cpl $$1, gu $$2) {
      if ($$1.c_($$2) instanceof ddm $$4) {
         ha $$5 = $$0.c(a);
         cix $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         byf $$9 = new byf($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.o();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$3 == ha.b && $$0.c(b) ? 15 : 0;
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      if ($$0.c(c)) {
         dcl $$3 = $$1.c_($$2);
         if ($$3 instanceof ddm) {
            return ((ddm)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$0.c(c)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bgq.a($$1.B);
      } else {
         cix $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(apt.au) ? bgq.b : bgq.d;
      }
   }

   @Nullable
   @Override
   public bgt b(dez $$0, cpl $$1, gu $$2) {
      return !$$0.c(c) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cpl $$0, gu $$1, cbm $$2) {
      dcl $$3 = $$0.c_($$1);
      if ($$3 instanceof ddm) {
         $$2.a((ddm)$$3);
         $$2.a(apg.au);
      }
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
