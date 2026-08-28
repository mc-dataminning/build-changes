import java.util.Optional;

public interface dfm extends der<dfn> {
   @Override
   default dfc<dfm> b() {
      return dfc.g;
   }

   @Override
   dfb<? extends dfm> a();

   default boolean a(dfn $$0, djz $$1) {
      return den.a(this.c(), $$0.c()) && this.f().a($$0.d()) && den.a(this.k(), $$0.e());
   }

   Optional<den> c();

   den f();

   Optional<den> k();

   @Override
   default deu h() {
      return det.l;
   }
}
