import com.mojang.serialization.MapCodec;

public class dnr extends djl {
   public static final MapCodec<dnr> a = b(dnr::new);
   public static final dvf b = dve.s;
   public static final dvo e = dve.aA;

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   protected dnr(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jj.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$3.gd().e) {
         return brp.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return brp.a;
      }
   }

   @Override
   protected int h(duo $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public duo a(czk $$0) {
      duo $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.a && !this.b($$3, $$5, $$2)) {
         return dhl.a.o();
      } else {
         return !$$3.w_() && $$1.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dej $$0, je $$1, duo $$2) {
      return this.a((dex)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(d)) {
         jj $$4 = $$0.c(aF);
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
         $$1.a(li.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF, e, b, d);
   }
}
