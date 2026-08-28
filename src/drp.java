import com.mojang.serialization.MapCodec;

public class drp extends dlv {
   public static final MapCodec<drp> c = b(drp::new);

   @Override
   public MapCodec<drp> a() {
      return c;
   }

   public drp(ebd.d $$0) {
      super($$0, kc.e);
   }

   @Override
   protected double b(ebe $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(ebe $$0) {
      return true;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aB();
         $$3.aC();
      }
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return 3;
   }
}
