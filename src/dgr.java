import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgr extends dbt {
   public static final MapCodec<dgr> a = b(dgr::new);
   public static final dqc b = dgc.aE;
   public static final dpz c = dpy.w;
   public static final dpz d = dpy.o;
   public static final etc e = dch.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final etc f = dch.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final etc g = esz.a(e, f);
   public static final etc h = dch.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final etc i = esz.a(g, h);
   public static final etc j = esz.a(
      dch.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dch.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dch.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final etc k = esz.a(
      dch.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dch.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dch.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final etc l = esz.a(
      dch.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dch.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dch.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final etc m = esz.a(
      dch.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dch.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dch.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   protected dgr(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected etc f(dpi $$0, cym $$1, id $$2) {
      return g;
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   public dpi a(cux $$0) {
      czg $$1 = $$0.q();
      crs $$2 = $$0.n();
      cka $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gw()) {
         cuc $$5 = $$2.a(jr.F, cuc.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return i;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((ij)$$0.c(b)) {
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
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnq($$0, $$1);
   }

   public static boolean a(@Nullable bqa $$0, czg $$1, id $$2, dpi $$3, crs $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bqa $$0, czg $$1, id $$2, dpi $$3, crs $$4) {
      if ($$1.c_($$2) instanceof dnq $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, auo.cz, aup.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bqa $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      dpi $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dub.c, $$2, dub.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(czg $$0, id $$1, dpi $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(czg $$0, id $$1, dpi $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(czg $$0, id $$1, dpi $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
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

   private void d(dpi $$0, czg $$1, id $$2) {
      if ($$1.c_($$2) instanceof dnq $$4) {
         ij $$5 = $$0.c(b);
         crs $$6 = $$4.b().r();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cgk $$9 = new cgk($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$3 == ij.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      if ($$0.c(d)) {
         dmo $$3 = $$1.c_($$2);
         if ($$3 instanceof dnq) {
            return ((dnq)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$1.c(d)) {
         return boh.d;
      } else if ($$0.a(avm.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? boh.a($$2.B) : boh.e;
      } else {
         return $$0.d() && $$5 == boe.a ? boh.e : boh.d;
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bof.a($$1.B);
      } else {
         return bof.b;
      }
   }

   @Nullable
   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(czg $$0, id $$1, cka $$2) {
      dmo $$3 = $$0.c_($$1);
      if ($$3 instanceof dnq) {
         $$2.a((dnq)$$3);
         $$2.a(auz.au);
      }
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
