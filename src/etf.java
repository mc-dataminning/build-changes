import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface etf {
   ete<cyl> a = new ete<cyl>() {
      @Override
      public kq<cyl> a() {
         return kr.ag;
      }

      public Stream<cvp> a(cyl $$0) {
         return $$0.b();
      }

      public cyl c() {
         return cyl.a;
      }

      public cyl a(cyl $$0, Stream<cvp> $$1) {
         return cyl.a($$1.toList());
      }
   };
   ete<cxz> b = new ete<cxz>() {
      @Override
      public kq<cxz> a() {
         return kr.K;
      }

      public cxz c() {
         return cxz.a;
      }

      public Stream<cvp> a(cxz $$0) {
         return $$0.b();
      }

      public cxz a(cxz $$0, Stream<cvp> $$1) {
         cxz.a $$2 = new cxz.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ete<cya> c = new ete<cya>() {
      @Override
      public kq<cya> a() {
         return kr.J;
      }

      public cya c() {
         return cya.a;
      }

      public Stream<cvp> a(cya $$0) {
         return $$0.a().stream();
      }

      public cya a(cya $$0, Stream<cvp> $$1) {
         return cya.a($$1.toList());
      }
   };
   Map<kq<?>, ete<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ete::a, $$0 -> (ete<?>)$$0));
   Codec<ete<?>> e = lu.ap.q().comapFlatMap($$0 -> {
      ete<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ete::a);
}
