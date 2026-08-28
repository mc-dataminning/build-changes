import java.util.Optional;

public interface dbz extends dbe<dca> {
   @Override
   default dbp<dbz> b() {
      return dbp.g;
   }

   @Override
   dbo<? extends dbz> a();

   default boolean a(dca $$0, dgi $$1) {
      return dba.a(this.c(), $$0.c()) && dba.a(this.f(), $$0.d()) && dba.a(this.k(), $$0.e());
   }

   Optional<dba> c();

   Optional<dba> f();

   Optional<dba> k();

   @Override
   default dbh h() {
      return dbg.l;
   }
}
