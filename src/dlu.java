import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlu extends dgv {
   public static final MapCodec<dlu> a = b(dlu::new);
   public static final dvi b = dlf.aF;
   public static final dvf c = dve.w;
   public static final dvf d = dve.o;
   public static final ezm e = dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ezm f = dhj.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ezm g = ezj.a(e, f);
   public static final ezm h = dhj.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ezm i = ezj.a(g, h);
   public static final ezm j = ezj.a(
      dhj.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dhj.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dhj.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ezm k = ezj.a(
      dhj.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dhj.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dhj.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ezm l = ezj.a(
      dhj.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dhj.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dhj.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ezm m = ezj.a(
      dhj.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dhj.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dhj.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   protected dlu(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected ezm d_(duo $$0) {
      return g;
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   public duo a(czk $$0) {
      deg $$1 = $$0.q();
      cvp $$2 = $$0.n();
      cnu $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cye $$5 = $$2.a(kr.T, cye.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return i;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ((jj)$$0.c(b)) {
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
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsw($$0, $$1);
   }

   public static boolean a(@Nullable buk $$0, deg $$1, je $$2, duo $$3, cvp $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable buk $$0, deg $$1, je $$2, duo $$3, cvp $$4) {
      if ($$1.c_($$2) instanceof dsw $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awe.cz, awf.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bto $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      duo $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dzl.c, $$2, dzl.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(deg $$0, je $$1, duo $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(deg $$0, je $$1, duo $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(deg $$0, je $$1, duo $$2) {
      erx $$3 = ert.a($$0, $$2.c(b).g(), jj.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void d(duo $$0, deg $$1, je $$2) {
      if ($$1.c_($$2) instanceof dsw $$4) {
         jj $$5 = $$0.c(b);
         cvp $$6 = $$4.b().u();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cke $$9 = new cke($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.q();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$3 == jj.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      if ($$0.c(d)) {
         drs $$3 = $$1.c_($$2);
         if ($$3 instanceof dsw) {
            return ((dsw)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$1.c(d)) {
         return brp.f;
      } else if ($$0.a(axc.aU)) {
         return (brp)(a($$4, $$2, $$3, $$1, $$0) ? brp.a : brp.e);
      } else {
         return (brp)($$0.f() && $$5 == bro.a ? brp.e : brp.f);
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return brp.a;
      } else {
         return brp.c;
      }
   }

   @Nullable
   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(deg $$0, je $$1, cnu $$2) {
      drs $$3 = $$0.c_($$1);
      if ($$3 instanceof dsw) {
         $$2.a((dsw)$$3);
         $$2.a(awo.au);
      }
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
