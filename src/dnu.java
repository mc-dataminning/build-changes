import com.mojang.serialization.MapCodec;

public class dnu extends djo {
   public static final MapCodec<dnu> a = b(dnu::new);
   public static final dvj b = dvi.s;
   public static final dvs e = dvi.aA;

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   protected dnu(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jk.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$3.ge().e) {
         return brs.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return brs.a;
      }
   }

   @Override
   protected int h(dus $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dus a(czn $$0) {
      dus $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.a && !this.b($$3, $$5, $$2)) {
         return dho.a.n();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(dem $$0, jf $$1, dus $$2) {
      return this.a((dfa)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(d)) {
         jk $$4 = $$0.c(aF);
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
         $$1.a(lj.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF, e, b, d);
   }
}
