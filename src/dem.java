import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dem extends czo {
   public static final MapCodec<dem> a = b(dem::new);
   public static final dnv b = ddx.aE;
   public static final dns c = dnr.w;
   public static final dns d = dnr.o;
   public static final eqm e = dac.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eqm f = dac.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eqm g = eqj.a(e, f);
   public static final eqm h = dac.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eqm i = eqj.a(g, h);
   public static final eqm j = eqj.a(
      dac.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dac.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dac.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eqm k = eqj.a(
      dac.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dac.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dac.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eqm l = eqj.a(
      dac.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dac.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dac.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eqm m = eqj.a(
      dac.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dac.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dac.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   protected dem(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected eqm f(dnb $$0, cwh $$1, ib $$2) {
      return g;
   }

   @Override
   protected boolean g_(dnb $$0) {
      return true;
   }

   @Override
   public dnb a(csu $$0) {
      cxb $$1 = $$0.q();
      cqm $$2 = $$0.n();
      ciu $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gw()) {
         ta $$5 = coh.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return i;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
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
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlk($$0, $$1);
   }

   public static boolean a(@Nullable box $$0, cxb $$1, ib $$2, dnb $$3, cqm $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable box $$0, cxb $$1, ib $$2, dnb $$3, cqm $$4) {
      if ($$1.c_($$2) instanceof dlk $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aty.cy, atz.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable box $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      dnb $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(drp.c, $$2, drp.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cxb $$0, ib $$1, dnb $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cxb $$0, ib $$1, dnb $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cxb $$0, ib $$1, dnb $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
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

   private void d(dnb $$0, cxb $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dlk $$4) {
         ih $$5 = $$0.c(b);
         cqm $$6 = $$4.b().q();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cfe $$9 = new cfe($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$3 == ih.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      if ($$0.c(d)) {
         dki $$3 = $$1.c_($$2);
         if ($$3 instanceof dlk) {
            return ((dlk)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$1.c(d)) {
         return bnf.d;
      } else if ($$0.a(auv.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bnf.a($$2.B) : bnf.e;
      } else {
         return $$0.b() && $$5 == bnc.a ? bnf.e : bnf.d;
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bnd.a($$1.B);
      } else {
         return bnd.b;
      }
   }

   @Nullable
   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cxb $$0, ib $$1, ciu $$2) {
      dki $$3 = $$0.c_($$1);
      if ($$3 instanceof dlk) {
         $$2.a((dlk)$$3);
         $$2.a(aui.au);
      }
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
