import com.mojang.serialization.MapCodec;

public abstract class cxy extends czf {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final epo h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final epo b = epl.a(
      epl.b(), epl.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), eoz.e
   );
   protected final jh.a c;

   @Override
   protected abstract MapCodec<? extends cxy> a();

   public cxy(dmd.d $$0, jh.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dme $$0) {
      return 0.0;
   }

   protected boolean a(dme $$0, ib $$1, bof $$2) {
      return $$2.dq() < (double)$$1.v() + this.b($$0) && $$2.cE().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      jh $$7 = this.c.b().get($$0.d());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2) {
      return h;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   public abstract boolean d(dme var1);

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      ib $$4 = dew.a((cwe)$$1, $$2);
      if ($$4 != null) {
         ehq $$5 = dew.a($$1, $$4);
         if ($$5 != ehs.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ehq $$0) {
      return false;
   }

   protected void a(dme $$0, cwe $$1, ib $$2, ehq $$3) {
   }
}
