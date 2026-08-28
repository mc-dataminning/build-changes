import com.mojang.serialization.MapCodec;

public abstract class die extends djl {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final fbt h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final fbt b = fbq.a(
      fbq.b(), fbq.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), fbd.e
   );
   protected final ko.a c;

   @Override
   protected abstract MapCodec<? extends die> a();

   public die(dwv.d $$0, ko.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dww $$0) {
      return 0.0;
   }

   protected boolean a(dww $$0, ji $$1, buk $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      ko $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2) {
      return h;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   public abstract boolean d(dww var1);

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      ji $$4 = dph.a((dgh)$$1, $$2);
      if ($$4 != null) {
         esx $$5 = dph.a($$1, $$4);
         if ($$5 != esz.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(esx $$0) {
      return false;
   }

   protected void a(dww $$0, dgh $$1, ji $$2, esx $$3) {
   }
}
