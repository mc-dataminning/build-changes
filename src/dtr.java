import com.mojang.serialization.MapCodec;

public class dtr extends dkv {
   public static final MapCodec<dtr> a = b(dtr::new);
   protected static final fcr b = dkl.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dtr> a() {
      return a;
   }

   protected dtr(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ash && $$3 instanceof crt) {
         $$1.a(new jh($$2), true, $$3);
      }
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      etw $$3 = $$1.b_($$2);
      etw $$4 = $$1.b_($$2.d());
      return ($$3.a() == etx.c || $$0.b() instanceof dol) && $$4.a() == etx.a;
   }
}
