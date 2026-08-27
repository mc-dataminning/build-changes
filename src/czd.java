import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czd extends cuf {
   public static final MapCodec<czd> a = b(czd::new);
   public static final dhq b = cyo.aE;
   public static final dhn c = dhm.w;
   public static final dhn d = dhm.o;
   public static final ekb e = cut.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ekb f = cut.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ekb g = ejy.a(e, f);
   public static final ekb h = cut.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ekb i = ejy.a(g, h);
   public static final ekb j = ejy.a(
      cut.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cut.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cut.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ekb k = ejy.a(
      cut.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cut.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cut.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ekb l = ejy.a(
      cut.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cut.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cut.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ekb m = ejy.a(
      cut.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cut.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cut.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<czd> a() {
      return a;
   }

   protected czd(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public ekb f(dgw $$0, cqy $$1, ht $$2) {
      return g;
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public dgw a(cnj $$0) {
      crs $$1 = $$0.q();
      clb $$2 = $$0.n();
      cdm $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gp()) {
         rz $$5 = ciu.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return i;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
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
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dft($$0, $$1);
   }

   public static boolean a(@Nullable bki $$0, crs $$1, ht $$2, dgw $$3, clb $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bki $$0, crs $$1, ht $$2, dgw $$3, clb $$4) {
      if ($$1.c_($$2) instanceof dft $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aqn.cf, aqo.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bki $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      dgw $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dlg.c, $$2, dlg.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(crs $$0, ht $$1, dgw $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(crs $$0, ht $$1, dgw $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(crs $$0, ht $$1, dgw $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
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

   private void d(dgw $$0, crs $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dft $$4) {
         hx $$5 = $$0.c(b);
         clb $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         caf $$9 = new caf($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.t();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$3 == hx.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      if ($$0.c(d)) {
         der $$3 = $$1.c_($$2);
         if ($$3 instanceof dft) {
            return ((dft)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return biq.a($$1.B);
      } else {
         clb $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(ark.au) ? biq.b : biq.d;
      }
   }

   @Nullable
   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(crs $$0, ht $$1, cdm $$2) {
      der $$3 = $$0.c_($$1);
      if ($$3 instanceof dft) {
         $$2.a((dft)$$3);
         $$2.a(aqx.au);
      }
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
