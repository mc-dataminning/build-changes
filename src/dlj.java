import com.mojang.serialization.MapCodec;

public class dlj extends dez implements dfc {
   public static final MapCodec<dlj> a = b(dlj::new);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dsb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      $$0.b($$2.d(), dfb.sG.o());
   }

   @Override
   public iz a(iz $$0) {
      return $$0.d();
   }
}
