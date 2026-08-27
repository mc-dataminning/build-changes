import com.mojang.serialization.MapCodec;

public class deb extends dao {
   public static final MapCodec<deb> a = b(deb::new);

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public deb(djo.d $$0) {
      super($$0);
   }

   @Override
   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(ctd $$0, blw $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(blw $$0) {
      emc $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bmo ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, blw $$3) {
      double $$4 = Math.abs($$3.do().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.do().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
