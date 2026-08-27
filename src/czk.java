import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czk extends cum {
   public static final MapCodec<czk> a = b(czk::new);
   public static final dic b = cyv.aE;
   public static final dhz c = dhy.w;
   public static final dhz d = dhy.o;
   public static final ekn e = cva.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ekn f = cva.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ekn g = ekk.a(e, f);
   public static final ekn h = cva.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ekn i = ekk.a(g, h);
   public static final ekn j = ekk.a(
      cva.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cva.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cva.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ekn k = ekk.a(
      cva.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cva.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cva.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ekn l = ekk.a(
      cva.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cva.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cva.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ekn m = ekk.a(
      cva.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cva.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cva.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<czk> a() {
      return a;
   }

   protected czk(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public ekn f(dhi $$0, crg $$1, ht $$2) {
      return g;
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public dhi a(cnr $$0) {
      csa $$1 = $$0.q();
      clj $$2 = $$0.n();
      cdu $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gq()) {
         rz $$5 = cjc.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return i;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      switch ((hx)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgf($$0, $$1);
   }

   public static boolean a(@Nullable bkq $$0, csa $$1, ht $$2, dhi $$3, clj $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bkq $$0, csa $$1, ht $$2, dhi $$3, clj $$4) {
      if ($$1.c_($$2) instanceof dgf $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aqr.cf, aqs.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bkq $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      dhi $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dls.c, $$2, dls.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(csa $$0, ht $$1, dhi $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(csa $$0, ht $$1, dhi $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(csa $$0, ht $$1, dhi $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dhi $$0, csa $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dgf $$4) {
         hx $$5 = $$0.c(b);
         clj $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         can $$9 = new can($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$3 == hx.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      if ($$0.c(d)) {
         dfd $$3 = $$1.c_($$2);
         if ($$3 instanceof dgf) {
            return ((dgf)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bix.a($$1.B);
      } else {
         clj $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(aro.au) ? bix.b : bix.d;
      }
   }

   @Nullable
   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(csa $$0, ht $$1, cdu $$2) {
      dfd $$3 = $$0.c_($$1);
      if ($$3 instanceof dgf) {
         $$2.a((dgf)$$3);
         $$2.a(arb.au);
      }
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
