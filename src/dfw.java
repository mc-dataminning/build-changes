import java.util.Optional;

public interface dfw extends dfb<dfx> {
   @Override
   default dfm<dfw> b() {
      return dfm.g;
   }

   @Override
   dfl<? extends dfw> a();

   default boolean a(dfx $$0, dkj $$1) {
      return dex.a(this.c(), $$0.c()) && this.f().a($$0.d()) && dex.a(this.k(), $$0.e());
   }

   Optional<dex> c();

   dex f();

   Optional<dex> k();

   @Override
   default dfe h() {
      return dfd.l;
   }
}
