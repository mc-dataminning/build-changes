import com.mojang.serialization.MapCodec;

public abstract class dhj extends diq {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fas h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fas b = fap.a(
      fap.b(), fap.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fac.e
   );
   protected final kn.a c;

   @Override
   protected abstract MapCodec<? extends dhj> a();

   public dhj(dvu.d $$0, kn.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dvv $$0) {
      return 0.0;
   }

   protected boolean a(dvv $$0, jh $$1, bul $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      kn $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2) {
      return h;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   public abstract boolean d(dvv var1);

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      jh $$4 = doh.a((dfm)$$1, $$2);
      if ($$4 != null) {
         eru $$5 = doh.a($$1, $$4);
         if ($$5 != erw.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eru $$0) {
      return false;
   }

   protected void a(dvv $$0, dfm $$1, jh $$2, eru $$3) {
   }
}
