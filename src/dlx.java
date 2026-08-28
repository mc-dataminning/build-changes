import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlx extends dgy {
   public static final MapCodec<dlx> a = b(dlx::new);
   public static final dvm b = dli.aF;
   public static final dvj c = dvi.w;
   public static final dvj d = dvi.o;
   public static final ezq e = dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ezq f = dhm.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ezq g = ezn.a(e, f);
   public static final ezq h = dhm.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ezq i = ezn.a(g, h);
   public static final ezq j = ezn.a(
      dhm.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dhm.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dhm.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ezq k = ezn.a(
      dhm.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dhm.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dhm.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ezq l = ezn.a(
      dhm.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dhm.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dhm.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ezq m = ezn.a(
      dhm.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dhm.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dhm.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   protected dlx(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected ezq d_(dus $$0) {
      return g;
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   public dus a(czn $$0) {
      dej $$1 = $$0.q();
      cvs $$2 = $$0.n();
      cnx $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gA()) {
         cyh $$5 = $$2.a(ks.T, cyh.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return i;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((jk)$$0.c(b)) {
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
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsz($$0, $$1);
   }

   public static boolean a(@Nullable bun $$0, dej $$1, jf $$2, dus $$3, cvs $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bun $$0, dej $$1, jf $$2, dus $$3, cvs $$4) {
      if ($$1.c_($$2) instanceof dsz $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awg.cz, awh.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable btr $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      dus $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dzp.c, $$2, dzp.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dej $$0, jf $$1, dus $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dej $$0, jf $$1, dus $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dej $$0, jf $$1, dus $$2) {
      esb $$3 = erx.a($$0, $$2.c(b).g(), jk.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
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

   private void d(dus $$0, dej $$1, jf $$2) {
      if ($$1.c_($$2) instanceof dsz $$4) {
         jk $$5 = $$0.c(b);
         cvs $$6 = $$4.b().u();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         ckh $$9 = new ckh($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.q();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$3 == jk.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      if ($$0.c(d)) {
         drv $$3 = $$1.c_($$2);
         if ($$3 instanceof dsz) {
            return ((dsz)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$1.c(d)) {
         return brs.f;
      } else if ($$0.a(axe.aU)) {
         return (brs)(a($$4, $$2, $$3, $$1, $$0) ? brs.a : brs.e);
      } else {
         return (brs)($$0.f() && $$5 == brr.a ? brs.e : brs.f);
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return brs.a;
      } else {
         return brs.c;
      }
   }

   @Nullable
   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dej $$0, jf $$1, cnx $$2) {
      drv $$3 = $$0.c_($$1);
      if ($$3 instanceof dsz) {
         $$2.a((dsz)$$3);
         $$2.a(awq.au);
      }
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
