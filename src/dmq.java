import com.mojang.serialization.MapCodec;

public class dmq extends dhc {
   public static final MapCodec<dmq> d = b(dmq::new);

   @Override
   public MapCodec<dmq> a() {
      return d;
   }

   public dmq(dvn.d $$0) {
      super($$0, kn.e);
   }

   @Override
   protected double b(dvo $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dvo $$0) {
      return true;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aG();
      }
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return 3;
   }
}
