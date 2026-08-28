import com.mojang.serialization.MapCodec;

public class doq extends dkl {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dwf b = dwe.s;
   public static final dwn e = dwe.aA;

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   protected doq(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$3.gm().e) {
         return bsh.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bsh.a;
      }
   }

   @Override
   protected int h(dvo $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dvo a(czw $$0) {
      dvo $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == jm.a && !this.b($$1, $$5, $$6)) {
         return dil.a.m();
      } else {
         return !$$1.y_() && $$4.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.c($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean c(dfi $$0, jh $$1, dvo $$2) {
      return this.a((dfx)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$0.c(d)) {
         jm $$4 = $$0.c(aF);
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
         $$1.a(ln.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(aF, e, b, d);
   }
}
