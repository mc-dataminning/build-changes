import java.util.Optional;

public class crv extends cry {
   private final bkv a;

   public crv(bkv $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(crx $$0, crl $$1, hx $$2, dhn $$3, ecx $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(crx $$0, crl $$1, hx $$2, dhn $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
