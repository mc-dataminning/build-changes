import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddp extends cyr {
   public static final MapCodec<ddp> a = b(ddp::new);
   public static final dmy b = dda.aE;
   public static final dmv c = dmu.w;
   public static final dmv d = dmu.o;
   public static final epo e = czf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final epo f = czf.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final epo g = epl.a(e, f);
   public static final epo h = czf.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final epo i = epl.a(g, h);
   public static final epo j = epl.a(
      czf.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), czf.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), czf.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final epo k = epl.a(
      czf.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), czf.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), czf.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final epo l = epl.a(
      czf.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), czf.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), czf.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final epo m = epl.a(
      czf.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), czf.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), czf.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   protected ddp(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected epo f(dme $$0, cvk $$1, ib $$2) {
      return g;
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   public dme a(crx $$0) {
      cwe $$1 = $$0.q();
      cpq $$2 = $$0.n();
      cia $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gs()) {
         sy $$5 = cnl.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return i;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      switch ((ih)$$0.c(b)) {
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
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkn($$0, $$1);
   }

   public static boolean a(@Nullable bof $$0, cwe $$1, ib $$2, dme $$3, cpq $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bof $$0, cwe $$1, ib $$2, dme $$3, cpq $$4) {
      if ($$1.c_($$2) instanceof dkn $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, atp.cs, atq.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bof $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      dme $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dqr.c, $$2, dqr.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cwe $$0, ib $$1, dme $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cwe $$0, ib $$1, dme $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cwe $$0, ib $$1, dme $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
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

   private void d(dme $$0, cwe $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dkn $$4) {
         ih $$5 = $$0.c(b);
         cpq $$6 = $$4.b().q();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cel $$9 = new cel($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$3 == ih.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      if ($$0.c(d)) {
         djl $$3 = $$1.c_($$2);
         if ($$3 instanceof dkn) {
            return ((dkn)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$1.c(d)) {
         return bmn.d;
      } else if ($$0.a(aum.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bmn.a($$2.B) : bmn.e;
      } else {
         return $$0.b() && $$5 == bmk.a ? bmn.e : bmn.d;
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bml.a($$1.B);
      } else {
         return bml.b;
      }
   }

   @Nullable
   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cwe $$0, ib $$1, cia $$2) {
      djl $$3 = $$0.c_($$1);
      if ($$3 instanceof dkn) {
         $$2.a((dkn)$$3);
         $$2.a(atz.au);
      }
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
