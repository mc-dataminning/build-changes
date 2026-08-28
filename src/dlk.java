import com.mojang.serialization.MapCodec;

public class dlk extends dfa implements dfd {
   public static final MapCodec<dlk> a = b(dlk::new);

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   public dlk(dsc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      $$0.b($$2.d(), dfc.sG.o());
   }

   @Override
   public iz a(iz $$0) {
      return $$0.d();
   }
}
