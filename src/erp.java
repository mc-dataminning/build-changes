import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface erp {
   ero<cxo> a = new ero<cxo>() {
      @Override
      public kp<cxo> a() {
         return kq.ab;
      }

      public Stream<cuq> a(cxo $$0) {
         return $$0.b();
      }

      public cxo c() {
         return cxo.a;
      }

      public cxo a(cxo $$0, Stream<cuq> $$1) {
         return cxo.a($$1.toList());
      }
   };
   ero<cxf> b = new ero<cxf>() {
      @Override
      public kp<cxf> a() {
         return kq.F;
      }

      public cxf c() {
         return cxf.a;
      }

      public Stream<cuq> a(cxf $$0) {
         return $$0.a();
      }

      public cxf a(cxf $$0, Stream<cuq> $$1) {
         cxf.a $$2 = new cxf.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ero<cxg> c = new ero<cxg>() {
      @Override
      public kp<cxg> a() {
         return kq.E;
      }

      public cxg c() {
         return cxg.a;
      }

      public Stream<cuq> a(cxg $$0) {
         return $$0.a().stream();
      }

      public cxg a(cxg $$0, Stream<cuq> $$1) {
         return cxg.a($$1.toList());
      }
   };
   Map<kp<?>, ero<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ero::a, $$0 -> (ero<?>)$$0));
   Codec<ero<?>> e = lt.aq.r().comapFlatMap($$0 -> {
      ero<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ero::a);
}
