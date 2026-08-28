import com.mojang.serialization.MapCodec;

public abstract class dlv extends dnc {
   protected static final int a = 4;
   private static final fgk c = dnc.b(12.0, 4.0, 16.0);
   private static final fgk d = ag.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fgh.a(fgh.b(), fgh.a(dnc.a(16.0, 8.0, 0.0, 3.0), dnc.a(8.0, 16.0, 0.0, 3.0), dnc.b(12.0, 0.0, 3.0), c), ffu.e);
   });
   protected final kc.a b;

   @Override
   protected abstract MapCodec<? extends dlv> a();

   public dlv(ebd.d $$0, kc.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(ebe $$0) {
      return 0.0;
   }

   protected boolean a(ebe $$0, iv $$1, bwt $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      kc $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2) {
      return c;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   public abstract boolean d(ebe var1);

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      iv $$4 = dta.a((djx)$$1, $$2);
      if ($$4 != null) {
         exn $$5 = dta.a($$1, $$4);
         if ($$5 != exp.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(exn $$0) {
      return false;
   }

   protected void a(ebe $$0, djx $$1, iv $$2, exn $$3) {
   }
}
