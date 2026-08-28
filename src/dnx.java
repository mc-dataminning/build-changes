import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnx extends diw {
   public static final MapCodec<dnx> a = b(dnx::new);
   public static final dxs<jn> b = dni.aF;
   public static final dxm c = dxl.B;
   public static final dxm d = dxl.s;
   public static final fbs e = djk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fbs f = djk.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fbs g = fbp.a(e, f);
   public static final fbs h = djk.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fbs i = fbp.a(g, h);
   public static final fbs j = fbp.a(
      djk.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), djk.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), djk.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fbs k = fbp.a(
      djk.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), djk.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), djk.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fbs l = fbp.a(
      djk.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), djk.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), djk.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fbs m = fbp.a(
      djk.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), djk.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), djk.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   protected dnx(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fbs d_(dwv $$0) {
      return g;
   }

   @Override
   protected boolean g_(dwv $$0) {
      return true;
   }

   @Override
   public dwv a(dae $$0) {
      dgg $$1 = $$0.q();
      cwn $$2 = $$0.n();
      cov $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         cyw $$5 = $$2.a(kv.Y, cyw.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return i;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      switch ((jn)$$0.c(b)) {
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
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvc($$0, $$1);
   }

   public static boolean a(@Nullable bvf $$0, dgg $$1, ji $$2, dwv $$3, cwn $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bvf $$0, dgg $$1, ji $$2, dwv $$3, cwn $$4) {
      if ($$1.c_($$2) instanceof dvc $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avz.cz, awa.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable buj $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      dwv $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ebr.c, $$2, ebr.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dgg $$0, ji $$1, dwv $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dgg $$0, ji $$1, dwv $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dgg $$0, ji $$1, dwv $$2) {
      euf $$3 = eub.a($$0, $$2.c(b).g(), jn.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
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

   private void e(dwv $$0, dgg $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvc $$4) {
         jn $$5 = $$0.c(b);
         cwn $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cla $$9 = new cla($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$3 == jn.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      if ($$0.c(d)) {
         dtx $$3 = $$1.c_($$2);
         if ($$3 instanceof dvc) {
            return ((dvc)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$1.c(d)) {
         return bsi.f;
      } else if ($$0.a(awx.aY)) {
         return (bsi)(a($$4, $$2, $$3, $$1, $$0) ? bsi.a : bsi.e);
      } else {
         return (bsi)($$0.f() && $$5 == bsh.a ? bsi.e : bsi.f);
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bsi.a;
      } else {
         return bsi.c;
      }
   }

   @Nullable
   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dgg $$0, ji $$1, cov $$2) {
      dtx $$3 = $$0.c_($$1);
      if ($$3 instanceof dvc) {
         $$2.a((dvc)$$3);
         $$2.a(awj.au);
      }
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
