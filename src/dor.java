import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends djq {
   public static final MapCodec<dor> a = b(dor::new);
   public static final dyk<jm> b = doc.aF;
   public static final dye c = dyd.x;
   public static final dye d = dyd.o;
   public static final fcm e = dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fcm f = dke.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fcm g = fcj.a(e, f);
   public static final fcm h = dke.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fcm i = fcj.a(g, h);
   public static final fcm j = fcj.a(
      dke.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dke.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dke.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fcm k = fcj.a(
      dke.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dke.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dke.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fcm l = fcj.a(
      dke.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dke.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dke.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fcm m = fcj.a(
      dke.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dke.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dke.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   protected dor(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected fcm d_(dxn $$0) {
      return g;
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   public dxn a(dbb $$0) {
      dha $$1 = $$0.q();
      cxk $$2 = $$0.n();
      cps $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gE()) {
         czt $$5 = $$2.a(ku.Y, czt.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return i;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
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
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvu($$0, $$1);
   }

   public static boolean a(@Nullable bwb $$0, dha $$1, jh $$2, dxn $$3, cxk $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bwb $$0, dha $$1, jh $$2, dxn $$3, cxk $$4) {
      if ($$1.c_($$2) instanceof dvu $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, axf.cz, axg.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bvf $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      dxn $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ecj.c, $$2, ecj.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dha $$0, jh $$1, dxn $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dha $$0, jh $$1, dxn $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dha $$0, jh $$1, dxn $$2) {
      eux $$3 = eut.a($$0, $$2.c(b).g(), jm.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
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

   private void e(dxn $$0, dha $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dvu $$4) {
         jm $$5 = $$0.c(b);
         cxk $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         clw $$9 = new clw($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$3 == jm.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      if ($$0.c(d)) {
         dup $$3 = $$1.c_($$2);
         if ($$3 instanceof dvu) {
            return ((dvu)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$1.c(d)) {
         return bte.f;
      } else if ($$0.a(ayd.ba)) {
         return (bte)(a($$4, $$2, $$3, $$1, $$0) ? bte.a : bte.e);
      } else {
         return (bte)($$0.f() && $$5 == btd.a ? bte.e : bte.f);
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bte.a;
      } else {
         return bte.c;
      }
   }

   @Nullable
   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dha $$0, jh $$1, cps $$2) {
      dup $$3 = $$0.c_($$1);
      if ($$3 instanceof dvu) {
         $$2.a((dvu)$$3);
         $$2.a(axp.au);
      }
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
