import java.util.Optional;

public interface dby extends dbd<dbz> {
   @Override
   default dbo<dby> b() {
      return dbo.g;
   }

   @Override
   dbn<? extends dby> a();

   default boolean a(dbz $$0, dgh $$1) {
      return daz.a(this.c(), $$0.c()) && daz.a(this.f(), $$0.d()) && daz.a(this.k(), $$0.e());
   }

   Optional<daz> c();

   Optional<daz> f();

   Optional<daz> k();

   @Override
   default dbg h() {
      return dbf.l;
   }
}
