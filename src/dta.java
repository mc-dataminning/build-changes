import com.mojang.serialization.MapCodec;

public class dta extends dop {
   public static final MapCodec<dta> a = b(dta::new);
   public static final ebf b = ebe.v;
   public static final ebo d = ebe.aD;

   @Override
   public MapCodec<dta> a() {
      return a;
   }

   protected dta(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(d, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$3.gj().e) {
         return bug.e;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bug.a;
      }
   }

   @Override
   protected int h(eao $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public eao a(ddd $$0) {
      eao $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.a && !this.a($$1, $$5, $$6)) {
         return dmo.a.m();
      } else {
         return !$$1.w_() && $$4.o() != $$0.c(e).o() ? $$0.b(b, Boolean.valueOf(this.b($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(djk $$0, iv $$1, eao $$2) {
      return this.a((djz)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$0.c(c)) {
         jb $$4 = $$0.c(e);
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
         $$1.a(lt.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(e, d, b, c);
   }
}
