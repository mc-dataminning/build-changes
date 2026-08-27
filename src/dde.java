import com.mojang.serialization.MapCodec;

public class dde extends cza {
   public static final MapCodec<dde> a = b(dde::new);
   public static final dkg b = dkf.s;
   public static final dkp e = dkf.aA;

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   protected dde(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if (!$$3.fT().e) {
         return bkc.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bkc.a($$1.B);
      }
   }

   @Override
   protected int g(djp $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public djp a(cpp $$0) {
      djp $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !this.b($$3, $$5, $$2)) {
         return cxa.a.o();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(cua $$0, hx $$1, djp $$2) {
      return this.a((cun)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(d)) {
         ic $$4 = $$0.c(aE);
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
         $$1.a(jr.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(aE, e, b, d);
   }
}
