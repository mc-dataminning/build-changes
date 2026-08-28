import com.mojang.serialization.MapCodec;

public abstract class dky extends dmf {
   protected static final int a = 4;
   private static final ffk c = dmf.b(12.0, 4.0, 16.0);
   private static final ffk d = af.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return ffh.a(ffh.b(), ffh.a(dmf.a(16.0, 8.0, 0.0, 3.0), dmf.a(8.0, 16.0, 0.0, 3.0), dmf.b(12.0, 0.0, 3.0), c), feu.e);
   });
   protected final kb.a b;

   @Override
   protected abstract MapCodec<? extends dky> a();

   public dky(eag.d $$0, kb.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(eah $$0) {
      return 0.0;
   }

   protected boolean a(eah $$0, iu $$1, bwf $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      kb $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2) {
      return c;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   public abstract boolean d(eah var1);

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      iu $$4 = dsd.a((dja)$$1, $$2);
      if ($$4 != null) {
         ewn $$5 = dsd.a($$1, $$4);
         if ($$5 != ewp.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ewn $$0) {
      return false;
   }

   protected void a(eah $$0, dja $$1, iu $$2, ewn $$3) {
   }
}
