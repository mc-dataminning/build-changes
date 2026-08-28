import java.util.Optional;

public interface dcy extends dcd<dcz> {
   @Override
   default dco<dcy> b() {
      return dco.g;
   }

   @Override
   dcn<? extends dcy> a();

   default boolean a(dcz $$0, dhh $$1) {
      return dbz.a(this.c(), $$0.c()) && dbz.a(this.f(), $$0.d()) && dbz.a(this.k(), $$0.e());
   }

   Optional<dbz> c();

   Optional<dbz> f();

   Optional<dbz> k();

   @Override
   default dcg h() {
      return dcf.l;
   }
}
