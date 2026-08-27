import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgi extends dbk {
   public static final MapCodec<dgi> a = b(dgi::new);
   public static final dpt b = dft.aE;
   public static final dpq c = dpp.w;
   public static final dpq d = dpp.o;
   public static final est e = dby.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final est f = dby.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final est g = esq.a(e, f);
   public static final est h = dby.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final est i = esq.a(g, h);
   public static final est j = esq.a(
      dby.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dby.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dby.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final est k = esq.a(
      dby.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dby.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dby.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final est l = esq.a(
      dby.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dby.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dby.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final est m = esq.a(
      dby.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dby.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dby.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   protected dgi(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected est f(doz $$0, cyd $$1, ib $$2) {
      return g;
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   public doz a(cuo $$0) {
      cyx $$1 = $$0.q();
      crj $$2 = $$0.n();
      cjt $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gw()) {
         ctt $$5 = $$2.a(jp.F, ctt.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return i;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
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
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnh($$0, $$1);
   }

   public static boolean a(@Nullable bpv $$0, cyx $$1, ib $$2, doz $$3, crj $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bpv $$0, cyx $$1, ib $$2, doz $$3, crj $$4) {
      if ($$1.c_($$2) instanceof dnh $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aum.cz, aun.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bpv $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      doz $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dts.c, $$2, dts.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cyx $$0, ib $$1, doz $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cyx $$0, ib $$1, doz $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cyx $$0, ib $$1, doz $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
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

   private void d(doz $$0, cyx $$1, ib $$2) {
      if ($$1.c_($$2) instanceof dnh $$4) {
         ih $$5 = $$0.c(b);
         crj $$6 = $$4.b().r();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cgd $$9 = new cgd($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$3 == ih.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      if ($$0.c(d)) {
         dmf $$3 = $$1.c_($$2);
         if ($$3 instanceof dnh) {
            return ((dnh)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$1.c(d)) {
         return boc.d;
      } else if ($$0.a(avk.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? boc.a($$2.B) : boc.e;
      } else {
         return $$0.d() && $$5 == bnz.a ? boc.e : boc.d;
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return boa.a($$1.B);
      } else {
         return boa.b;
      }
   }

   @Nullable
   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cyx $$0, ib $$1, cjt $$2) {
      dmf $$3 = $$0.c_($$1);
      if ($$3 instanceof dnh) {
         $$2.a((dnh)$$3);
         $$2.a(auw.au);
      }
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
