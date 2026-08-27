import com.mojang.serialization.MapCodec;

public class dgr extends dgh implements dcb {
   public static final MapCodec<dgr> a = b(dgr::new);

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public dgr(doy.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      $$0.a($$2.d(), dgs.c(), 2);
   }

   @Override
   public ib a(ib $$0) {
      return $$0.d();
   }
}
