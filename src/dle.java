import com.mojang.serialization.MapCodec;

public class dle extends deu implements dex {
   public static final MapCodec<dle> a = b(dle::new);

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(drw.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      $$0.b($$2.d(), dew.sG.n());
   }

   @Override
   public iz a(iz $$0) {
      return $$0.d();
   }
}
