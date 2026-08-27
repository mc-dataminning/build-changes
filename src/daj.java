import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daj extends cvl {
   public static final MapCodec<daj> a = b(daj::new);
   public static final djj b = czu.aE;
   public static final djg c = djf.w;
   public static final djg d = djf.o;
   public static final elu e = cvz.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final elu f = cvz.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final elu g = elr.a(e, f);
   public static final elu h = cvz.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final elu i = elr.a(g, h);
   public static final elu j = elr.a(
      cvz.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cvz.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cvz.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final elu k = elr.a(
      cvz.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cvz.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cvz.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final elu l = elr.a(
      cvz.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cvz.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cvz.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final elu m = elr.a(
      cvz.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cvz.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cvz.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   protected daj(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public elu f(dip $$0, cse $$1, hv $$2) {
      return g;
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public dip a(coq $$0) {
      csy $$1 = $$0.q();
      cmh $$2 = $$0.n();
      cer $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gp()) {
         sj $$5 = cka.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return i;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((ia)$$0.c(b)) {
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
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhf($$0, $$1);
   }

   public static boolean a(@Nullable blf $$0, csy $$1, hv $$2, dip $$3, cmh $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable blf $$0, csy $$1, hv $$2, dip $$3, cmh $$4) {
      if ($$1.c_($$2) instanceof dhf $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, arc.cf, ard.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable blf $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      dip $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dmz.c, $$2, dmz.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(csy $$0, hv $$1, dip $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(csy $$0, hv $$1, dip $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(csy $$0, hv $$1, dip $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
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

   private void d(dip $$0, csy $$1, hv $$2) {
      if ($$1.c_($$2) instanceof dhf $$4) {
         ia $$5 = $$0.c(b);
         cmh $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cbe $$9 = new cbe($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$3 == ia.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      if ($$0.c(d)) {
         dgd $$3 = $$1.c_($$2);
         if ($$3 instanceof dhf) {
            return ((dhf)$$3).k();
         }
      }

      return 0;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bjl.a($$1.B);
      } else {
         cmh $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(arz.au) ? bjl.b : bjl.d;
      }
   }

   @Nullable
   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(csy $$0, hv $$1, cer $$2) {
      dgd $$3 = $$0.c_($$1);
      if ($$3 instanceof dhf) {
         $$2.a((dhf)$$3);
         $$2.a(arm.au);
      }
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
