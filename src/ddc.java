import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddc extends cye {
   public static final MapCodec<ddc> a = b(ddc::new);
   public static final dmd b = dcn.aE;
   public static final dma c = dlz.w;
   public static final dma d = dlz.o;
   public static final eos e = cys.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eos f = cys.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eos g = eop.a(e, f);
   public static final eos h = cys.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eos i = eop.a(g, h);
   public static final eos j = eop.a(
      cys.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cys.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cys.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eos k = eop.a(
      cys.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cys.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cys.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eos l = eop.a(
      cys.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cys.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cys.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eos m = eop.a(
      cys.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cys.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cys.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   protected ddc(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected eos f(dlj $$0, cux $$1, hz $$2) {
      return g;
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   public dlj a(crk $$0) {
      cvr $$1 = $$0.q();
      cpd $$2 = $$0.n();
      chl $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gq()) {
         sw $$5 = cmw.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return i;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      switch ((ie)$$0.c(b)) {
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
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djz($$0, $$1);
   }

   public static boolean a(@Nullable bnq $$0, cvr $$1, hz $$2, dlj $$3, cpd $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bnq $$0, cvr $$1, hz $$2, dlj $$3, cpd $$4) {
      if ($$1.c_($$2) instanceof djz $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, atl.cs, atm.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bnq $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      dlj $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dpw.c, $$2, dpw.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cvr $$0, hz $$1, dlj $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cvr $$0, hz $$1, dlj $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cvr $$0, hz $$1, dlj $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
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

   private void d(dlj $$0, cvr $$1, hz $$2) {
      if ($$1.c_($$2) instanceof djz $$4) {
         ie $$5 = $$0.c(b);
         cpd $$6 = $$4.c().q();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cdw $$9 = new cdw($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$3 == ie.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      if ($$0.c(d)) {
         dix $$3 = $$1.c_($$2);
         if ($$3 instanceof djz) {
            return ((djz)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$1.c(d)) {
         return bly.d;
      } else if ($$0.a(aui.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bly.a($$2.B) : bly.e;
      } else {
         return $$0.b() && $$5 == blv.a ? bly.e : bly.d;
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return blw.a($$1.B);
      } else {
         return blw.b;
      }
   }

   @Nullable
   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cvr $$0, hz $$1, chl $$2) {
      dix $$3 = $$0.c_($$1);
      if ($$3 instanceof djz) {
         $$2.a((djz)$$3);
         $$2.a(atv.au);
      }
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
