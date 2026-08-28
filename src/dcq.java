import java.util.Optional;

public interface dcq extends dbv<dcr> {
   @Override
   default dcg<dcq> b() {
      return dcg.g;
   }

   @Override
   dcf<? extends dcq> a();

   default boolean a(dcr $$0, dgz $$1) {
      return dbr.a(this.c(), $$0.c()) && dbr.a(this.f(), $$0.d()) && dbr.a(this.k(), $$0.e());
   }

   Optional<dbr> c();

   Optional<dbr> f();

   Optional<dbr> k();

   @Override
   default dby h() {
      return dbx.l;
   }
}
