import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eqi {
   eqh<cxn> a = new eqh<cxn>() {
      @Override
      public kl<cxn> a() {
         return km.aa;
      }

      public Stream<cur> a(cxn $$0) {
         return $$0.b();
      }

      public cxn c() {
         return cxn.a;
      }

      public cxn a(cxn $$0, Stream<cur> $$1) {
         return cxn.a($$1.toList());
      }
   };
   eqh<cxe> b = new eqh<cxe>() {
      @Override
      public kl<cxe> a() {
         return km.F;
      }

      public cxe c() {
         return cxe.a;
      }

      public Stream<cur> a(cxe $$0) {
         return $$0.a();
      }

      public cxe a(cxe $$0, Stream<cur> $$1) {
         cxe.a $$2 = new cxe.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eqh<cxf> c = new eqh<cxf>() {
      @Override
      public kl<cxf> a() {
         return km.E;
      }

      public cxf c() {
         return cxf.a;
      }

      public Stream<cur> a(cxf $$0) {
         return $$0.a().stream();
      }

      public cxf a(cxf $$0, Stream<cur> $$1) {
         return cxf.a($$1.toList());
      }
   };
   Map<kl<?>, eqh<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eqh::a, $$0 -> (eqh<?>)$$0));
   Codec<eqh<?>> e = lp.as.q().comapFlatMap($$0 -> {
      eqh<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eqh::a);
}
