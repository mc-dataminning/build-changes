import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doy extends djx {
   public static final MapCodec<doy> a = b(doy::new);
   public static final dyr<jm> b = doj.aF;
   public static final dyl c = dyk.x;
   public static final dyl d = dyk.o;
   public static final fcr e = dkl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fcr f = dkl.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fcr g = fco.a(e, f);
   public static final fcr h = dkl.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fcr i = fco.a(g, h);
   public static final fcr j = fco.a(
      dkl.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dkl.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dkl.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fcr k = fco.a(
      dkl.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dkl.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dkl.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fcr l = fco.a(
      dkl.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dkl.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dkl.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fcr m = fco.a(
      dkl.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dkl.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dkl.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected fcr d_(dxu $$0) {
      return g;
   }

   @Override
   protected boolean g_(dxu $$0) {
      return true;
   }

   @Override
   public dxu a(dbf $$0) {
      dhh $$1 = $$0.q();
      cxo $$2 = $$0.n();
      cpw $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         czx $$5 = $$2.a(ku.Y, czx.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return i;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      switch ((jm)$$0.c(b)) {
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
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwb($$0, $$1);
   }

   public static boolean a(@Nullable bwf $$0, dhh $$1, jh $$2, dxu $$3, cxo $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bwf $$0, dhh $$1, jh $$2, dxu $$3, cxo $$4) {
      if ($$1.c_($$2) instanceof dwb $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, axf.cz, axg.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bvj $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      dxu $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ecq.c, $$2, ecq.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dhh $$0, jh $$1, dxu $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dhh $$0, jh $$1, dxu $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dhh $$0, jh $$1, dxu $$2) {
      eve $$3 = eva.a($$0, $$2.c(b).g(), jm.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void e(dxu $$0, dhh $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwb $$4) {
         jm $$5 = $$0.c(b);
         cxo $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cma $$9 = new cma($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$3 == jm.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      if ($$0.c(d)) {
         duw $$3 = $$1.c_($$2);
         if ($$3 instanceof dwb) {
            return ((dwb)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$1.c(d)) {
         return bti.f;
      } else if ($$0.a(ayd.ba)) {
         return (bti)(a($$4, $$2, $$3, $$1, $$0) ? bti.a : bti.e);
      } else {
         return (bti)($$0.f() && $$5 == bth.a ? bti.e : bti.f);
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bti.a;
      } else {
         return bti.c;
      }
   }

   @Nullable
   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dhh $$0, jh $$1, cpw $$2) {
      duw $$3 = $$0.c_($$1);
      if ($$3 instanceof dwb) {
         $$2.a((dwb)$$3);
         $$2.a(axp.au);
      }
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
