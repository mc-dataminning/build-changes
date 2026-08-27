import javax.annotation.Nullable;

public class cwu extends crz {
   public static final dfu a = cwf.aC;
   public static final dfr b = dfq.w;
   public static final dfr c = dfq.o;
   public static final ehx d = csm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ehx e = csm.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ehx f = ehu.a(d, e);
   public static final ehx g = csm.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ehx h = ehu.a(f, g);
   public static final ehx i = ehu.a(
      csm.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), csm.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), csm.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), f
   );
   public static final ehx j = ehu.a(
      csm.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), csm.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), csm.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), f
   );
   public static final ehx k = ehu.a(
      csm.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), csm.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), csm.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), f
   );
   public static final ehx l = ehu.a(
      csm.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), csm.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), csm.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), f
   );
   private static final int m = 2;

   protected cwu(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public ehx f(dfa $$0, cos $$1, gu $$2) {
      return f;
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public dfa a(clg $$0) {
      cpm $$1 = $$0.q();
      ciy $$2 = $$0.n();
      cbn $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gn()) {
         qr $$5 = cgr.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(a, $$0.g().g()).a(c, Boolean.valueOf($$4));
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return h;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
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
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddn($$0, $$1);
   }

   public static boolean a(@Nullable bii $$0, cpm $$1, gu $$2, dfa $$3, ciy $$4) {
      if (!$$3.c(c)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bii $$0, cpm $$1, gu $$2, dfa $$3, ciy $$4) {
      if ($$1.c_($$2) instanceof ddn $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aow.cf, aox.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bii $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      dfa $$5 = $$3.a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(djk.c, $$2, djk.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cpm $$0, gu $$1, dfa $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cpm $$0, gu $$1, dfa $$2, boolean $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cpm $$0, gu $$1, dfa $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
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

   private void d(dfa $$0, cpm $$1, gu $$2) {
      if ($$1.c_($$2) instanceof ddn $$4) {
         ha $$5 = $$0.c(a);
         ciy $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         byg $$9 = new byg($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.o();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$3 == ha.b && $$0.c(b) ? 15 : 0;
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      if ($$0.c(c)) {
         dcm $$3 = $$1.c_($$2);
         if ($$3 instanceof ddn) {
            return ((ddn)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$0.c(c)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bgq.a($$1.B);
      } else {
         ciy $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(apt.au) ? bgq.b : bgq.d;
      }
   }

   @Nullable
   @Override
   public bgt b(dfa $$0, cpm $$1, gu $$2) {
      return !$$0.c(c) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cpm $$0, gu $$1, cbn $$2) {
      dcm $$3 = $$0.c_($$1);
      if ($$3 instanceof ddn) {
         $$2.a((ddn)$$3);
         $$2.a(apg.au);
      }
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
