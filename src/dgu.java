import com.mojang.serialization.MapCodec;

public class dgu extends czb implements cyv {
   public static final MapCodec<dgu> a = b(dgu::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dmj c = dlz.as;
   private static final eos e = cys.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eos f = cys.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dgu> a() {
      return a;
   }

   public dgu(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(cpg.wl);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dlj $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dlj $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dpw.c, $$2, dpw.a.a($$5));
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if ($$3 instanceof boi && $$3.ai() != bnw.P && $$3.ai() != bnw.i) {
         $$3.a($$0, new enz(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ab != $$3.dr() || $$3.ad != $$3.dx())) {
            double $$4 = Math.abs($$3.dr() - $$3.ab);
            double $$5 = Math.abs($$3.dx() - $$3.ad);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ah().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cpg.rx) ? bly.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cpd(cpg.wl, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, atl.yL, atm.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dlj $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dpw.c, $$2, dpw.a.a($$3, $$8));
         return blw.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
