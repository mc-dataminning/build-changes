import com.mojang.serialization.MapCodec;

public abstract class dlk extends dmr {
   protected static final int a = 4;
   private static final ffw c = dmr.b(12.0, 4.0, 16.0);
   private static final ffw d = ag.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fft.a(fft.b(), fft.a(dmr.a(16.0, 8.0, 0.0, 3.0), dmr.a(8.0, 16.0, 0.0, 3.0), dmr.b(12.0, 0.0, 3.0), c), ffg.e);
   });
   protected final kc.a b;

   @Override
   protected abstract MapCodec<? extends dlk> a();

   public dlk(eas.d $$0, kc.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(eat $$0) {
      return 0.0;
   }

   protected boolean a(eat $$0, iv $$1, bwi $$2) {
      return $$2.dB() < (double)$$1.v() + this.b($$0) && $$2.cQ().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      kc $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2) {
      return c;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   public abstract boolean d(eat var1);

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      iv $$4 = dsp.a((djm)$$1, $$2);
      if ($$4 != null) {
         ewz $$5 = dsp.a($$1, $$4);
         if ($$5 != exb.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ewz $$0) {
      return false;
   }

   protected void a(eat $$0, djm $$1, iv $$2, ewz $$3) {
   }
}
