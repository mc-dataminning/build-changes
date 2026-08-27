import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cyo extends cye {
   public static final MapCodec<cyo> a = b(cyo::new);
   public static final dmd b = dcn.aE;
   public static final dmh<dlx> c = dlz.V;
   public static final dma d = dlz.w;
   private static final eos f = cys.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eos g = cys.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eos h = cys.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eos i = cys.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eos j = eop.a(i, h);
   private static final eos k = eop.a(j, cys.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eos l = eop.a(j, cys.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eos m = eop.a(j, cys.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eos n = eop.a(j, cys.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eos o = eop.a(j, cys.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eos F = eop.a(j, cys.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eos G = eop.a(j, cys.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<cyo> a() {
      return a;
   }

   public cyo(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, dlx.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      bnq $$4 = $$3.w();
      chl $$5 = $$4 instanceof chl ? (chl)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? blw.a($$1.B) : blw.d;
   }

   public boolean a(cvr $$0, dlj $$1, env $$2, @Nullable chl $$3, boolean $$4) {
      ie $$5 = $$2.b();
      hz $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(atv.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dlj $$0, ie $$1, double $$2) {
      if ($$1.o() != ie.a.b && !($$2 > 0.8124F)) {
         ie $$3 = $$0.c(b);
         dlx $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(cvr $$0, hz $$1, @Nullable ie $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bnq $$0, cvr $$1, hz $$2, @Nullable ie $$3) {
      dix $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof div) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((div)$$4).a($$3);
         $$1.a(null, $$2, atl.bX, atm.e, 2.0F, 1.0F);
         $$1.a($$0, dpw.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eos m(dlj $$0) {
      ie $$1 = $$0.c(b);
      dlx $$2 = $$0.c(c);
      if ($$2 == dlx.a) {
         return $$1 != ie.c && $$1 != ie.d ? g : f;
      } else if ($$2 == dlx.b) {
         return G;
      } else if ($$2 == dlx.d) {
         return $$1 != ie.c && $$1 != ie.d ? l : k;
      } else if ($$1 == ie.c) {
         return o;
      } else if ($$1 == ie.d) {
         return F;
      } else {
         return $$1 == ie.f ? n : m;
      }
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.m($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.m($$0);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      ie $$1 = $$0.k();
      hz $$2 = $$0.a();
      cvr $$3 = $$0.q();
      ie.a $$4 = $$1.o();
      if ($$4 == ie.a.b) {
         dlj $$5 = this.o().a(c, $$1 == ie.a ? dlx.b : dlx.a).a(b, $$0.g());
         if ($$5.a((cvu)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ie.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ie.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ie.e)
            || $$4 == ie.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ie.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ie.c);
         dlj $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dlx.d : dlx.c);
         if ($$7.a((cvu)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ie.b);
         $$7 = $$7.a(c, $$8 ? dlx.a : dlx.b);
         if ($$7.a((cvu)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cvj $$3, BiConsumer<cpd, hz> $$4) {
      if ($$3.j() == cvj.a.d && !$$1.y_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      dlx $$6 = $$0.c(c);
      ie $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dlx.d) {
         return cyu.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dlx.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dlx.c).a(b, $$1.g());
            }

            if ($$6 == dlx.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dlx.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      ie $$3 = n($$0).g();
      return $$3 == ie.b ? cys.a($$1, $$2.c(), ie.a) : dbm.b($$1, $$2, $$3);
   }

   private static ie n(dlj $$0) {
      switch ((dlx)$$0.c(c)) {
         case a:
            return ie.b;
         case b:
            return ie.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new div($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.E, $$0.B ? div::a : div::b);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   public dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
