import com.mojang.serialization.MapCodec;

public abstract class dmh extends dno {
   protected static final int a = 4;
   private static final fgw c = dno.b(12.0, 4.0, 16.0);
   private static final fgw d = ag.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fgt.a(fgt.b(), fgt.a(dno.a(16.0, 8.0, 0.0, 3.0), dno.a(8.0, 16.0, 0.0, 3.0), dno.b(12.0, 0.0, 3.0), c), fgg.e);
   });
   protected final kd.a b;

   @Override
   protected abstract MapCodec<? extends dmh> a();

   public dmh(ebp.d $$0, kd.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(ebq $$0) {
      return 0.0;
   }

   protected boolean a(ebq $$0, iw $$1, bxe $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      kd $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2) {
      return c;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   public abstract boolean d(ebq var1);

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      iw $$4 = dtm.a((dkj)$$1, $$2);
      if ($$4 != null) {
         exz $$5 = dtm.a($$1, $$4);
         if ($$5 != eyb.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(exz $$0) {
      return false;
   }

   protected void a(ebq $$0, dkj $$1, iw $$2, exz $$3) {
   }
}
