import com.mojang.serialization.MapCodec;

public class dqq extends dmh {
   public static final MapCodec<dqq> a = b(dqq::new);
   public static final dyh b = dyg.v;
   public static final dyq d = dyg.aD;

   @Override
   public MapCodec<dqq> a() {
      return a;
   }

   protected dqq(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jn.c).b(d, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$3.gm().e) {
         return bsy.e;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bsy.a;
      }
   }

   @Override
   protected int h(dxq $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public dxq a(dax $$0) {
      dxq $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.a && !this.a($$1, $$5, $$6)) {
         return dkg.a.m();
      } else {
         return !$$1.w_() && $$4.o() != $$0.c(e).o() ? $$0.b(b, Boolean.valueOf(this.b($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dhc $$0, ji $$1, dxq $$2) {
      return this.a((dhr)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(c)) {
         jn $$4 = $$0.c(e);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(d) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(lo.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e, d, b, c);
   }
}
