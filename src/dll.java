import com.mojang.serialization.MapCodec;

public class dll extends dfb implements dfe {
   public static final MapCodec<dll> a = b(dll::new);

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dsd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      $$0.b($$2.d(), dfd.sG.o());
   }

   @Override
   public iz a(iz $$0) {
      return $$0.d();
   }
}
