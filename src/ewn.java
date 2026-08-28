import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ewn {
   ewm<dah> a = new ewm<dah>() {
      @Override
      public kt<dah> a() {
         return ku.al;
      }

      public Stream<cxp> a(dah $$0) {
         return $$0.b();
      }

      public dah c() {
         return dah.a;
      }

      public dah a(dah $$0, Stream<cxp> $$1) {
         return dah.a($$1.toList());
      }
   };
   ewm<czt> b = new ewm<czt>() {
      @Override
      public kt<czt> a() {
         return ku.P;
      }

      public czt c() {
         return czt.a;
      }

      public Stream<cxp> a(czt $$0) {
         return $$0.b();
      }

      public czt a(czt $$0, Stream<cxp> $$1) {
         czt.a $$2 = new czt.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ewm<czu> c = new ewm<czu>() {
      @Override
      public kt<czu> a() {
         return ku.O;
      }

      public czu c() {
         return czu.a;
      }

      public Stream<cxp> a(czu $$0) {
         return $$0.a().stream();
      }

      public czu a(czu $$0, Stream<cxp> $$1) {
         return czu.a($$1.toList());
      }
   };
   Map<kt<?>, ewm<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ewm::a, $$0 -> (ewm<?>)$$0));
   Codec<ewm<?>> e = ma.ao.q().comapFlatMap($$0 -> {
      ewm<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ewm::a);
}
