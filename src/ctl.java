import com.mojang.serialization.MapCodec;

public abstract class ctl extends cut {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ekb h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ekb b = ejy.a(
      ejy.b(), ejy.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ejm.e
   );
   protected final iy.a c;

   @Override
   protected abstract MapCodec<? extends ctl> a();

   public ctl(dgv.d $$0, iy.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dgw $$0) {
      return 0.0;
   }

   protected boolean a(dgw $$0, ht $$1, bki $$2) {
      return $$2.ds() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      iy $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2) {
      return h;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   public abstract boolean d(dgw var1);

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      ht $$4 = dak.a((crs)$$1, $$2);
      if ($$4 != null) {
         ecf $$5 = dak.a($$1, $$4);
         if ($$5 != ech.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ecf $$0) {
      return false;
   }

   protected void a(dgw $$0, crs $$1, ht $$2, ecf $$3) {
   }
}
