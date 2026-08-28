import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface esr {
   esq<cyh> a = new esq<cyh>() {
      @Override
      public kq<cyh> a() {
         return kr.ad;
      }

      public Stream<cvl> a(cyh $$0) {
         return $$0.b();
      }

      public cyh c() {
         return cyh.a;
      }

      public cyh a(cyh $$0, Stream<cvl> $$1) {
         return cyh.a($$1.toList());
      }
   };
   esq<cxy> b = new esq<cxy>() {
      @Override
      public kq<cxy> a() {
         return kr.H;
      }

      public cxy c() {
         return cxy.a;
      }

      public Stream<cvl> a(cxy $$0) {
         return $$0.b();
      }

      public cxy a(cxy $$0, Stream<cvl> $$1) {
         cxy.a $$2 = new cxy.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   esq<cxz> c = new esq<cxz>() {
      @Override
      public kq<cxz> a() {
         return kr.G;
      }

      public cxz c() {
         return cxz.a;
      }

      public Stream<cvl> a(cxz $$0) {
         return $$0.a().stream();
      }

      public cxz a(cxz $$0, Stream<cvl> $$1) {
         return cxz.a($$1.toList());
      }
   };
   Map<kq<?>, esq<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(esq::a, $$0 -> (esq<?>)$$0));
   Codec<esq<?>> e = lu.ap.q().comapFlatMap($$0 -> {
      esq<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, esq::a);
}
