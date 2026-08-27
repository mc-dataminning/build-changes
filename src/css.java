import com.mojang.serialization.MapCodec;

public abstract class css extends cua {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eiy h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eiy b = eiv.a(
      eiv.b(), eiv.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), eij.e
   );
   protected final iy.a c;

   @Override
   protected abstract MapCodec<? extends css> a();

   public css(dga.d $$0, iy.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dgb $$0) {
      return 0.0;
   }

   protected boolean a(dgb $$0, ht $$1, bjt $$2) {
      return $$2.ds() < (double)$$1.v() + this.b($$0) && $$2.cG().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      iy $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2) {
      return h;
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   public abstract boolean d(dgb var1);

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      ht $$4 = czq.a((cqz)$$1, $$2);
      if ($$4 != null) {
         ebd $$5 = czq.a($$1, $$4);
         if ($$5 != ebf.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ebd $$0) {
      return false;
   }

   protected void a(dgb $$0, cqz $$1, ht $$2, ebd $$3) {
   }
}
