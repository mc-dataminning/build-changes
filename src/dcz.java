import java.util.Optional;

public interface dcz extends dce<dda> {
   @Override
   default dcp<dcz> b() {
      return dcp.g;
   }

   @Override
   dco<? extends dcz> a();

   default boolean a(dda $$0, dhi $$1) {
      return dca.a(this.c(), $$0.c()) && dca.a(this.f(), $$0.d()) && dca.a(this.k(), $$0.e());
   }

   Optional<dca> c();

   Optional<dca> f();

   Optional<dca> k();

   @Override
   default dch h() {
      return dcg.l;
   }
}
