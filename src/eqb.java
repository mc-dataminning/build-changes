import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eqb {
   eqa<cxg> a = new eqa<cxg>() {
      @Override
      public kl<cxg> a() {
         return km.Z;
      }

      public Stream<cuk> a(cxg $$0) {
         return $$0.b();
      }

      public cxg c() {
         return cxg.a;
      }

      public cxg a(cxg $$0, Stream<cuk> $$1) {
         return cxg.a($$1.toList());
      }
   };
   eqa<cwx> b = new eqa<cwx>() {
      @Override
      public kl<cwx> a() {
         return km.E;
      }

      public cwx c() {
         return cwx.a;
      }

      public Stream<cuk> a(cwx $$0) {
         return $$0.a();
      }

      public cwx a(cwx $$0, Stream<cuk> $$1) {
         cwx.a $$2 = new cwx.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eqa<cwy> c = new eqa<cwy>() {
      @Override
      public kl<cwy> a() {
         return km.D;
      }

      public cwy c() {
         return cwy.a;
      }

      public Stream<cuk> a(cwy $$0) {
         return $$0.a().stream();
      }

      public cwy a(cwy $$0, Stream<cuk> $$1) {
         return cwy.a($$1.toList());
      }
   };
   Map<kl<?>, eqa<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eqa::a, $$0 -> (eqa<?>)$$0));
   Codec<eqa<?>> e = lp.as.q().comapFlatMap($$0 -> {
      eqa<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eqa::a);
}
