import com.mojang.serialization.MapCodec;

public class dpx extends dlo {
   public static final MapCodec<dpx> a = b(dpx::new);
   public static final dxn b = dxm.w;
   public static final dxv e = dxm.aD;

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   protected dpx(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$3.gj().e) {
         return bsj.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bsj.a;
      }
   }

   @Override
   protected int h(dww $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dww a(daf $$0) {
      dww $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == jn.a && !this.a($$1, $$5, $$6)) {
         return djn.a.m();
      } else {
         return !$$1.B_() && $$4.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.b($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dgk $$0, ji $$1, dww $$2) {
      return this.a((dgz)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$0.c(d)) {
         jn $$4 = $$0.c(aF);
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
         $$1.a(lo.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(aF, e, b, d);
   }
}
