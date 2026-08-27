import com.mojang.serialization.MapCodec;

public class deu extends daq {
   public static final MapCodec<deu> a = b(deu::new);
   public static final dlw b = dlv.s;
   public static final dmf e = dlv.aA;

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   protected deu(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ie.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if (!$$3.fU().e) {
         return blu.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return blu.a($$1.B);
      }
   }

   @Override
   protected int g(dlf $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dlf a(crg $$0) {
      dlf $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.a && !this.b($$3, $$5, $$2)) {
         return cyq.a.o();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(cvq $$0, hz $$1, dlf $$2) {
      return this.a((cwd)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$0.c(d)) {
         ie $$4 = $$0.c(aE);
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
         $$1.a(jt.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE, e, b, d);
   }
}
