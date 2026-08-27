import com.mojang.serialization.MapCodec;

public class dcp extends cyl {
   public static final MapCodec<dcp> a = b(dcp::new);
   public static final djr b = djq.s;
   public static final dka e = djq.aA;

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   protected dcp(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if (!$$3.fT().e) {
         return bjv.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bjv.a($$1.B);
      }
   }

   @Override
   protected int g(dja $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dja a(cpa $$0) {
      dja $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !this.b($$3, $$5, $$2)) {
         return cwl.a.o();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(ctl $$0, hx $$1, dja $$2) {
      return this.a((cty)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
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
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(aE, e, b, d);
   }
}
