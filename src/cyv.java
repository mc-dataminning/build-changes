import com.mojang.serialization.MapCodec;

public abstract class cyv extends dac {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eqm h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eqm b = eqj.a(
      eqj.b(), eqj.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), epx.e
   );
   protected final ji.a c;

   @Override
   protected abstract MapCodec<? extends cyv> a();

   public cyv(dna.d $$0, ji.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dnb $$0) {
      return 0.0;
   }

   protected boolean a(dnb $$0, ib $$1, box $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      ji $$7 = this.c.b().get($$0.d());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2) {
      return h;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   public abstract boolean d(dnb var1);

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      ib $$4 = dft.a((cxb)$$1, $$2);
      if ($$4 != null) {
         eio $$5 = dft.a($$1, $$4);
         if ($$5 != eiq.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eio $$0) {
      return false;
   }

   protected void a(dnb $$0, cxb $$1, ib $$2, eio $$3) {
   }
}
