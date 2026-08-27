import com.mojang.serialization.MapCodec;

public class daz extends cwu {
   public static final MapCodec<daz> a = b(daz::new);
   public static final dhn b = dhm.s;
   public static final dhw e = dhm.aA;

   @Override
   public MapCodec<daz> a() {
      return a;
   }

   protected daz(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if (!$$3.fT().e) {
         return biq.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return biq.a($$1.B);
      }
   }

   @Override
   protected int g(dgw $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !this.b($$3, $$5, $$2)) {
         return cuv.a.o();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(crv $$0, ht $$1, dgw $$2) {
      return this.a((csi)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$0.c(d)) {
         hx $$4 = $$0.c(aE);
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
         $$1.a(jm.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(aE, e, b, d);
   }
}
