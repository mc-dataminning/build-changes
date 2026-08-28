import com.mojang.serialization.MapCodec;

public abstract class dif extends djm {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fbu h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fbu b = fbr.a(
      fbr.b(), fbr.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fbe.e
   );
   protected final ko.a c;

   @Override
   protected abstract MapCodec<? extends dif> a();

   public dif(dww.d $$0, ko.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dwx $$0) {
      return 0.0;
   }

   protected boolean a(dwx $$0, ji $$1, buk $$2) {
      return $$2.dD() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      ko $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2) {
      return h;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   public abstract boolean d(dwx var1);

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      ji $$4 = dpi.a((dgi)$$1, $$2);
      if ($$4 != null) {
         esy $$5 = dpi.a($$1, $$4);
         if ($$5 != eta.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(esy $$0) {
      return false;
   }

   protected void a(dwx $$0, dgi $$1, ji $$2, esy $$3) {
   }
}
