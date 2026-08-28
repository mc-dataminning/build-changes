import com.mojang.serialization.MapCodec;

public abstract class der extends dfy {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ext h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ext b = exq.a(
      exq.b(), exq.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), exe.e
   );
   protected final kj.a c;

   @Override
   protected abstract MapCodec<? extends der> a();

   public der(dtb.d $$0, kj.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dtc $$0) {
      return 0.0;
   }

   protected boolean a(dtc $$0, jd $$1, bsr $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cL().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      kj $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2) {
      return h;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   public abstract boolean d(dtc var1);

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      jd $$4 = dlq.a((dcw)$$1, $$2);
      if ($$4 != null) {
         epb $$5 = dlq.a($$1, $$4);
         if ($$5 != epd.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(epb $$0) {
      return false;
   }

   protected void a(dtc $$0, dcw $$1, jd $$2, epb $$3) {
   }
}
