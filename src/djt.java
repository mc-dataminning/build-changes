import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djt extends deu {
   public static final MapCodec<djt> a = b(djt::new);
   public static final dtf b = dje.aE;
   public static final dtc c = dtb.w;
   public static final dtc d = dtb.o;
   public static final exa e = dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final exa f = dfi.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final exa g = ewx.a(e, f);
   public static final exa h = dfi.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final exa i = ewx.a(g, h);
   public static final exa j = ewx.a(
      dfi.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dfi.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dfi.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final exa k = ewx.a(
      dfi.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dfi.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dfi.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final exa l = ewx.a(
      dfi.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dfi.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dfi.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final exa m = ewx.a(
      dfi.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dfi.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dfi.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   protected djt(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected exa f(dsl $$0, dbm $$1, ja $$2) {
      return g;
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   public dsl a(cxn $$0) {
      dcg $$1 = $$0.q();
      cud $$2 = $$0.n();
      cml $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gx()) {
         cwr $$5 = $$2.a(kn.O, cwr.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return i;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      switch ((jf)$$0.c(b)) {
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
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqt($$0, $$1);
   }

   public static boolean a(@Nullable btc $$0, dcg $$1, ja $$2, dsl $$3, cud $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable btc $$0, dcg $$1, ja $$2, dsl $$3, cud $$4) {
      if ($$1.c_($$2) instanceof dqt $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avh.cz, avi.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bsh $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      dsl $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dxh.c, $$2, dxh.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dcg $$0, ja $$1, dsl $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dcg $$0, ja $$1, dsl $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dcg $$0, ja $$1, dsl $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
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

   private void d(dsl $$0, dcg $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqt $$4) {
         jf $$5 = $$0.c(b);
         cud $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         civ $$9 = new civ($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$3 == jf.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      if ($$0.c(d)) {
         dpq $$3 = $$1.c_($$2);
         if ($$3 instanceof dqt) {
            return ((dqt)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$1.c(d)) {
         return bqj.d;
      } else if ($$0.a(awf.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqj.a($$2.B) : bqj.e;
      } else {
         return $$0.e() && $$5 == bqg.a ? bqj.e : bqj.d;
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqh.a($$1.B);
      } else {
         return bqh.c;
      }
   }

   @Nullable
   @Override
   protected bql b(dsl $$0, dcg $$1, ja $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dcg $$0, ja $$1, cml $$2) {
      dpq $$3 = $$0.c_($$1);
      if ($$3 instanceof dqt) {
         $$2.a((dqt)$$3);
         $$2.a(avr.au);
      }
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
