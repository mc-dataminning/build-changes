import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djr extends den {
   public static final MapCodec<djr> a = b(djr::new);
   public static final dtw b = djc.aE;
   public static final dtt c = dts.w;
   public static final dtt d = dts.o;
   public static final exn e = dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final exn f = dfc.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final exn g = exk.a(e, f);
   public static final exn h = dfc.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final exn i = exk.a(g, h);
   public static final exn j = exk.a(
      dfc.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dfc.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dfc.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final exn k = exk.a(
      dfc.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dfc.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dfc.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final exn l = exk.a(
      dfc.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dfc.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dfc.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final exn m = exk.a(
      dfc.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dfc.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dfc.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   protected djr(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      return g;
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   public dtc a(cyd $$0) {
      dca $$1 = $$0.q();
      cuh $$2 = $$0.n();
      cly $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gK()) {
         cxf $$5 = $$2.a(ke.O, cxf.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return i;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      switch ((iw)$$0.c(b)) {
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
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drg($$0, $$1);
   }

   public static boolean a(@Nullable brv $$0, dca $$1, ir $$2, dtc $$3, cuh $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable brv $$0, dca $$1, ir $$2, dtc $$3, cuh $$4) {
      if ($$1.c_($$2) instanceof drg $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avo.cE, avq.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable brv $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      dtc $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dxv.c, $$2, dxv.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dca $$0, ir $$1, dtc $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dca $$0, ir $$1, dtc $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dca $$0, ir $$1, dtc $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
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

   private void d(dtc $$0, dca $$1, ir $$2) {
      if ($$1.c_($$2) instanceof drg $$4) {
         iw $$5 = $$0.c(b);
         cuh $$6 = $$4.b().r();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cig $$9 = new cig($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$3 == iw.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      if ($$0.c(d)) {
         dqc $$3 = $$1.c_($$2);
         if ($$3 instanceof drg) {
            return ((drg)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$1.c(d)) {
         return bqc.d;
      } else if ($$0.a(awm.aW)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqc.a($$2.C) : bqc.e;
      } else {
         return $$0.d() && $$5 == bpz.a ? bqc.e : bqc.d;
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bqa.a($$1.C);
      } else {
         return bqa.b;
      }
   }

   @Nullable
   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dca $$0, ir $$1, cly $$2) {
      dqc $$3 = $$0.c_($$1);
      if ($$3 instanceof drg) {
         $$2.a((drg)$$3);
         $$2.a(avz.av);
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
