import com.mojang.serialization.MapCodec;

public class cze extends cys {
   public static final MapCodec<cze> a = b(cze::new);
   public static final int b = 6;
   public static final dmj c = dlz.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eos[] g = new eos[]{
      cys.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cys.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cys.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cys.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cys.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cys.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      cys.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<cze> a() {
      return a;
   }

   protected cze(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      coy $$7 = $$0.d();
      if ($$0.a(aui.ai) && $$1.c(c) == 0 && cys.a($$7) instanceof czh $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, atl.dj, atm.e, 1.0F, 1.0F);
         $$2.b($$3, czi.a($$8));
         $$2.a($$4, dpw.c, $$3);
         $$4.b(atv.c.b($$7));
         return bly.a;
      } else {
         return bly.d;
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return blw.a;
         }

         if ($$3.b(blv.a).b()) {
            return blw.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static blw a(cvs $$0, hz $$1, dlj $$2, chl $$3) {
      if (!$$3.s(false)) {
         return blw.d;
      } else {
         $$3.a(atv.U);
         $$3.gd().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dpw.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dpw.f, $$1);
         }

         return blw.a;
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
