import java.util.Optional;

public interface dct extends dbz<dcu> {
   @Override
   default dcj<dct> b() {
      return dcj.g;
   }

   @Override
   dci<? extends dct> a();

   default boolean a(dcu $$0, dha $$1) {
      return dbv.a(this.c(), $$0.c()) && dbv.a(this.f(), $$0.d()) && dbv.a(this.k(), $$0.e());
   }

   Optional<dbv> c();

   Optional<dbv> f();

   Optional<dbv> k();

   @Override
   default dbi h() {
      return dbi.l;
   }
}
