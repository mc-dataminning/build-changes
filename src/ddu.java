import com.mojang.serialization.MapCodec;

public abstract class ddu extends dfc {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final exn h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final exn b = exk.a(
      exk.b(), exk.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ewy.e
   );
   protected final jx.a c;

   @Override
   protected abstract MapCodec<? extends ddu> a();

   public ddu(dtb.d $$0, jx.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dtc $$0) {
      return 0.0;
   }

   protected boolean a(dtc $$0, ir $$1, brv $$2) {
      return $$2.dB() < (double)$$1.v() + this.b($$0) && $$2.cP().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      jx $$7 = this.c.b().get($$0.f());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2) {
      return h;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   public abstract boolean d(dtc var1);

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      ir $$4 = dla.a(dfe.tE, $$1, $$2);
      if ($$4 != null) {
         epd $$5 = ((dla)$$1.a_($$4).b()).c($$1, $$4);
         if ($$5 != epf.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(epd $$0) {
      return false;
   }

   protected void a(dtc $$0, dca $$1, ir $$2, epd $$3) {
   }
}
