import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dij extends ddk {
   public static final MapCodec<dij> a = b(dij::new);
   public static final drv b = dhu.aE;
   public static final drs c = drr.w;
   public static final drs d = drr.o;
   public static final evd e = ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final evd f = ddy.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final evd g = eva.a(e, f);
   public static final evd h = ddy.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final evd i = eva.a(g, h);
   public static final evd j = eva.a(
      ddy.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), ddy.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), ddy.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final evd k = eva.a(
      ddy.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), ddy.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), ddy.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final evd l = eva.a(
      ddy.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), ddy.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), ddy.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final evd m = eva.a(
      ddy.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), ddy.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), ddy.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   protected dij(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected evd f(drb $$0, dad $$1, io $$2) {
      return g;
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   public drb a(cwz $$0) {
      dax $$1 = $$0.q();
      cto $$2 = $$0.n();
      clw $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cwd $$5 = $$2.a(kb.N, cwd.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected evd b(drb $$0, dad $$1, io $$2, eup $$3) {
      return i;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((it)$$0.c(b)) {
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
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpi($$0, $$1);
   }

   public static boolean a(@Nullable bru $$0, dax $$1, io $$2, drb $$3, cto $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bru $$0, dax $$1, io $$2, drb $$3, cto $$4) {
      if ($$1.c_($$2) instanceof dpi $$6) {
         $$6.b($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avh.cz, avi.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bru $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      drb $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dvu.c, $$2, dvu.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dax $$0, io $$1, drb $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dax $$0, io $$1, drb $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dax $$0, io $$1, drb $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
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

   private void d(drb $$0, dax $$1, io $$2) {
      if ($$1.c_($$2) instanceof dpi $$4) {
         it $$5 = $$0.c(b);
         cto $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cig $$9 = new cig($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      return $$3 == it.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      if ($$0.c(d)) {
         dog $$3 = $$1.c_($$2);
         if ($$3 instanceof dpi) {
            return ((dpi)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$1.c(d)) {
         return bpw.d;
      } else if ($$0.a(awe.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bpw.a($$2.B) : bpw.e;
      } else {
         return $$0.e() && $$5 == bpt.a ? bpw.e : bpw.d;
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bpu.a($$1.B);
      } else {
         return bpu.b;
      }
   }

   @Nullable
   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dax $$0, io $$1, clw $$2) {
      dog $$3 = $$0.c_($$1);
      if ($$3 instanceof dpi) {
         $$2.a((dpi)$$3);
         $$2.a(avr.au);
      }
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
