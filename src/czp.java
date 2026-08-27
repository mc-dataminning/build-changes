import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czp extends cur {
   public static final MapCodec<czp> a = b(czp::new);
   public static final dih b = cza.aE;
   public static final die c = did.w;
   public static final die d = did.o;
   public static final eks e = cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eks f = cvf.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eks g = ekp.a(e, f);
   public static final eks h = cvf.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eks i = ekp.a(g, h);
   public static final eks j = ekp.a(
      cvf.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cvf.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cvf.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eks k = ekp.a(
      cvf.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cvf.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cvf.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eks l = ekp.a(
      cvf.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cvf.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cvf.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eks m = ekp.a(
      cvf.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cvf.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cvf.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<czp> a() {
      return a;
   }

   protected czp(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public eks f(dhn $$0, crl $$1, hx $$2) {
      return g;
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public dhn a(cnw $$0) {
      csf $$1 = $$0.q();
      clo $$2 = $$0.n();
      cdz $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gq()) {
         sd $$5 = cjh.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return i;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((ib)$$0.c(b)) {
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
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgk($$0, $$1);
   }

   public static boolean a(@Nullable bkv $$0, csf $$1, hx $$2, dhn $$3, clo $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bkv $$0, csf $$1, hx $$2, dhn $$3, clo $$4) {
      if ($$1.c_($$2) instanceof dgk $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aqv.cf, aqw.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bkv $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      dhn $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dlx.c, $$2, dlx.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(csf $$0, hx $$1, dhn $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(csf $$0, hx $$1, dhn $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(csf $$0, hx $$1, dhn $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
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

   private void d(dhn $$0, csf $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dgk $$4) {
         ib $$5 = $$0.c(b);
         clo $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cas $$9 = new cas($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$3 == ib.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      if ($$0.c(d)) {
         dfi $$3 = $$1.c_($$2);
         if ($$3 instanceof dgk) {
            return ((dgk)$$3).k();
         }
      }

      return 0;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bjb.a($$1.B);
      } else {
         clo $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(ars.au) ? bjb.b : bjb.d;
      }
   }

   @Nullable
   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(csf $$0, hx $$1, cdz $$2) {
      dfi $$3 = $$0.c_($$1);
      if ($$3 instanceof dgk) {
         $$2.a((dgk)$$3);
         $$2.a(arf.au);
      }
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
