import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eyl {
   eyk<dbk> a = new eyk<dbk>() {
      @Override
      public ki<dbk> a() {
         return kj.ap;
      }

      public Stream<cys> a(dbk $$0) {
         return $$0.b();
      }

      public dbk c() {
         return dbk.a;
      }

      public dbk a(dbk $$0, Stream<cys> $$1) {
         return dbk.a($$1.toList());
      }
   };
   eyk<dav> b = new eyk<dav>() {
      @Override
      public ki<dav> a() {
         return kj.Q;
      }

      public dav c() {
         return dav.a;
      }

      public Stream<cys> a(dav $$0) {
         return $$0.b();
      }

      public dav a(dav $$0, Stream<cys> $$1) {
         dav.a $$2 = new dav.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eyk<daw> c = new eyk<daw>() {
      @Override
      public ki<daw> a() {
         return kj.P;
      }

      public daw c() {
         return daw.a;
      }

      public Stream<cys> a(daw $$0) {
         return $$0.a().stream();
      }

      public daw a(daw $$0, Stream<cys> $$1) {
         return daw.a($$1.toList());
      }
   };
   Map<ki<?>, eyk<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eyk::a, $$0 -> (eyk<?>)$$0));
   Codec<eyk<?>> e = mf.am.q().comapFlatMap($$0 -> {
      eyk<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eyk::a);
}
