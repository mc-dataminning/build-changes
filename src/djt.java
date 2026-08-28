import com.mojang.serialization.MapCodec;

public class djt extends djj implements dfc {
   public static final MapCodec<djt> a = b(djt::new);

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(dsb.d $$0) {
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
      $$0.a($$2.d(), dju.c(), 2);
   }

   @Override
   public iz a(iz $$0) {
      return $$0.d();
   }
}
