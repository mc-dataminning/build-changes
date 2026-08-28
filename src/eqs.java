import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eqs {
   eqr<cwx> a = new eqr<cwx>() {
      @Override
      public km<cwx> a() {
         return kn.aa;
      }

      public Stream<cuc> a(cwx $$0) {
         return $$0.b();
      }

      public cwx c() {
         return cwx.a;
      }

      public cwx a(cwx $$0, Stream<cuc> $$1) {
         return cwx.a($$1.toList());
      }
   };
   eqr<cwo> b = new eqr<cwo>() {
      @Override
      public km<cwo> a() {
         return kn.F;
      }

      public cwo c() {
         return cwo.a;
      }

      public Stream<cuc> a(cwo $$0) {
         return $$0.a();
      }

      public cwo a(cwo $$0, Stream<cuc> $$1) {
         cwo.a $$2 = new cwo.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eqr<cwp> c = new eqr<cwp>() {
      @Override
      public km<cwp> a() {
         return kn.E;
      }

      public cwp c() {
         return cwp.a;
      }

      public Stream<cuc> a(cwp $$0) {
         return $$0.a().stream();
      }

      public cwp a(cwp $$0, Stream<cuc> $$1) {
         return cwp.a($$1.toList());
      }
   };
   Map<km<?>, eqr<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eqr::a, $$0 -> (eqr<?>)$$0));
   Codec<eqr<?>> e = lq.aq.r().comapFlatMap($$0 -> {
      eqr<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eqr::a);
}
