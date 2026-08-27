import com.mojang.serialization.MapCodec;

public class czh extends cvc {
   public static final MapCodec<czh> a = b(czh::new);
   public static final dfu b = dft.s;
   public static final dgd e = dft.aA;

   @Override
   public MapCodec<czh> a() {
      return a;
   }

   protected czh(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ha.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if (!$$3.fT().e) {
         return bhe.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bhe.a($$1.B);
      }
   }

   @Override
   protected int g(dfd $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dfd a(clt $$0) {
      dfd $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.a && !this.b($$3, $$5, $$2)) {
         return cte.a.o();
      } else {
         return !$$3.w_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(cqe $$0, gw $$1, dfd $$2) {
      return this.a((cqr)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(d)) {
         ha $$4 = $$0.c(aE);
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
         $$1.a(ip.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(aE, e, b, d);
   }
}
