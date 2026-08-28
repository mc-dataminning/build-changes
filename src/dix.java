import com.mojang.serialization.MapCodec;

public abstract class dix extends dke {
   protected static final int a = 4;
   private static final fcr c = dke.b(12.0, 4.0, 16.0);
   private static final fcr d = af.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fco.a(fco.b(), fco.a(dke.a(16.0, 8.0, 0.0, 3.0), dke.a(8.0, 16.0, 0.0, 3.0), dke.b(12.0, 0.0, 3.0), c), fcb.e);
   });
   protected final ko.a b;

   @Override
   protected abstract MapCodec<? extends dix> a();

   public dix(dxp.d $$0, ko.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(dxq $$0) {
      return 0.0;
   }

   protected boolean a(dxq $$0, ji $$1, bva $$2) {
      return $$2.dB() < (double)$$1.v() + this.b($$0) && $$2.cQ().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      ko $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2) {
      return c;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   public abstract boolean d(dxq var1);

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      ji $$4 = dqa.a((dgz)$$1, $$2);
      if ($$4 != null) {
         etv $$5 = dqa.a($$1, $$4);
         if ($$5 != etx.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(etv $$0) {
      return false;
   }

   protected void a(dxq $$0, dgz $$1, ji $$2, etv $$3) {
   }
}
