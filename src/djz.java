import com.mojang.serialization.MapCodec;

public class djz extends dgl {
   public static final MapCodec<djz> a = b(djz::new);

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dpx.d $$0) {
      super($$0);
   }

   @Override
   public void a(czu $$0, dpy $$1, im $$2, bql $$3, float $$4) {
      if ($$3.bV()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(cza $$0, bql $$1) {
      if ($$1.bV()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bql $$0) {
      etf $$1 = $$0.dq();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bre ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bql $$3) {
      double $$4 = Math.abs($$3.dq().d);
      if ($$4 < 0.1 && !$$3.bU()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dq().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
