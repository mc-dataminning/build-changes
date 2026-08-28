import java.util.Optional;

public interface dca extends dbf<dcb> {
   @Override
   default dbq<dca> b() {
      return dbq.g;
   }

   @Override
   dbp<? extends dca> a();

   default boolean a(dcb $$0, dgj $$1) {
      return dbb.a(this.c(), $$0.c()) && dbb.a(this.f(), $$0.d()) && dbb.a(this.k(), $$0.e());
   }

   Optional<dbb> c();

   Optional<dbb> f();

   Optional<dbb> k();

   @Override
   default dbi h() {
      return dbh.l;
   }
}
