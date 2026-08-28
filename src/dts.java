import com.mojang.serialization.MapCodec;

public class dts extends dph {
   public static final MapCodec<dts> a = b(dts::new);
   public static final ebx b = ebw.v;
   public static final ecg d = ebw.aD;

   @Override
   public MapCodec<dts> a() {
      return a;
   }

   protected dts(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jc.c).b(d, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$3.gk().e) {
         return but.e;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return but.a;
      }
   }

   @Override
   protected int h(ebg $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.a && !this.a($$1, $$5, $$6)) {
         return dng.a.m();
      } else {
         return !$$1.A_() && $$4.o() != $$0.c(e).o() ? $$0.b(b, Boolean.valueOf(this.b($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dkc $$0, iw $$1, ebg $$2) {
      return this.a((dkr)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(c)) {
         jc $$4 = $$0.c(e);
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
         $$1.a(lu.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e, d, b, c);
   }
}
