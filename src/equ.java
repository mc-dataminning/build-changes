import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface equ {
   eqt<cwy> a = new eqt<cwy>() {
      @Override
      public km<cwy> a() {
         return kn.aa;
      }

      public Stream<cud> a(cwy $$0) {
         return $$0.b();
      }

      public cwy c() {
         return cwy.a;
      }

      public cwy a(cwy $$0, Stream<cud> $$1) {
         return cwy.a($$1.toList());
      }
   };
   eqt<cwp> b = new eqt<cwp>() {
      @Override
      public km<cwp> a() {
         return kn.F;
      }

      public cwp c() {
         return cwp.a;
      }

      public Stream<cud> a(cwp $$0) {
         return $$0.a();
      }

      public cwp a(cwp $$0, Stream<cud> $$1) {
         cwp.a $$2 = new cwp.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eqt<cwq> c = new eqt<cwq>() {
      @Override
      public km<cwq> a() {
         return kn.E;
      }

      public cwq c() {
         return cwq.a;
      }

      public Stream<cud> a(cwq $$0) {
         return $$0.a().stream();
      }

      public cwq a(cwq $$0, Stream<cud> $$1) {
         return cwq.a($$1.toList());
      }
   };
   Map<km<?>, eqt<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eqt::a, $$0 -> (eqt<?>)$$0));
   Codec<eqt<?>> e = lq.aq.r().comapFlatMap($$0 -> {
      eqt<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eqt::a);
}
