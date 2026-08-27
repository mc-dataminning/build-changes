import com.mojang.serialization.MapCodec;

public class din extends dej {
   public static final MapCodec<din> a = b(din::new);
   public static final dpz b = dpy.s;
   public static final dqi e = dpy.aA;

   @Override
   public MapCodec<din> a() {
      return a;
   }

   protected din(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ij.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if (!$$3.ga().e) {
         return bof.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bof.a($$1.B);
      }
   }

   @Override
   protected int g(dpi $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dpi a(cux $$0) {
      dpi $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.a && !this.b($$3, $$5, $$2)) {
         return dcj.a.n();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(czj $$0, id $$1, dpi $$2) {
      return this.a((czw)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(d)) {
         ij $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(kh.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(aE, e, b, d);
   }
}
