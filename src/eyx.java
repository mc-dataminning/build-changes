import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eyx {
   eyw<dbq> a = new eyw<dbq>() {
      @Override
      public ki<dbq> a() {
         return kj.ap;
      }

      public Stream<cyy> a(dbq $$0) {
         return $$0.b();
      }

      public dbq c() {
         return dbq.a;
      }

      public dbq a(dbq $$0, Stream<cyy> $$1) {
         return dbq.a($$1.toList());
      }
   };
   eyw<dbb> b = new eyw<dbb>() {
      @Override
      public ki<dbb> a() {
         return kj.Q;
      }

      public dbb c() {
         return dbb.a;
      }

      public Stream<cyy> a(dbb $$0) {
         return $$0.b();
      }

      public dbb a(dbb $$0, Stream<cyy> $$1) {
         dbb.a $$2 = new dbb.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eyw<dbc> c = new eyw<dbc>() {
      @Override
      public ki<dbc> a() {
         return kj.P;
      }

      public dbc c() {
         return dbc.a;
      }

      public Stream<cyy> a(dbc $$0) {
         return $$0.a().stream();
      }

      public dbc a(dbc $$0, Stream<cyy> $$1) {
         return dbc.a($$1.toList());
      }
   };
   Map<ki<?>, eyw<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eyw::a, $$0 -> (eyw<?>)$$0));
   Codec<eyw<?>> e = mf.am.q().comapFlatMap($$0 -> {
      eyw<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eyw::a);
}
