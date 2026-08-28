import java.util.Optional;

public interface dbx extends dbc<dby> {
   @Override
   default dbn<dbx> b() {
      return dbn.g;
   }

   @Override
   dbm<? extends dbx> a();

   default boolean a(dby $$0, dgg $$1) {
      return day.a(this.c(), $$0.c()) && day.a(this.f(), $$0.d()) && day.a(this.k(), $$0.e());
   }

   Optional<day> c();

   Optional<day> f();

   Optional<day> k();

   @Override
   default dbf h() {
      return dbe.l;
   }
}
