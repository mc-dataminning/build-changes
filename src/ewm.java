import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ewm {
   ewl<dag> a = new ewl<dag>() {
      @Override
      public kt<dag> a() {
         return ku.al;
      }

      public Stream<cxo> a(dag $$0) {
         return $$0.b();
      }

      public dag c() {
         return dag.a;
      }

      public dag a(dag $$0, Stream<cxo> $$1) {
         return dag.a($$1.toList());
      }
   };
   ewl<czs> b = new ewl<czs>() {
      @Override
      public kt<czs> a() {
         return ku.P;
      }

      public czs c() {
         return czs.a;
      }

      public Stream<cxo> a(czs $$0) {
         return $$0.b();
      }

      public czs a(czs $$0, Stream<cxo> $$1) {
         czs.a $$2 = new czs.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ewl<czt> c = new ewl<czt>() {
      @Override
      public kt<czt> a() {
         return ku.O;
      }

      public czt c() {
         return czt.a;
      }

      public Stream<cxo> a(czt $$0) {
         return $$0.a().stream();
      }

      public czt a(czt $$0, Stream<cxo> $$1) {
         return czt.a($$1.toList());
      }
   };
   Map<kt<?>, ewl<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ewl::a, $$0 -> (ewl<?>)$$0));
   Codec<ewl<?>> e = ma.ao.q().comapFlatMap($$0 -> {
      ewl<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ewl::a);
}
