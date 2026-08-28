import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ewm {
   ewl<czx> a = new ewl<czx>() {
      @Override
      public ku<czx> a() {
         return kv.an;
      }

      public Stream<cxh> a(czx $$0) {
         return $$0.b();
      }

      public czx c() {
         return czx.a;
      }

      public czx a(czx $$0, Stream<cxh> $$1) {
         return czx.a($$1.toList());
      }
   };
   ewl<czj> b = new ewl<czj>() {
      @Override
      public ku<czj> a() {
         return kv.Q;
      }

      public czj c() {
         return czj.a;
      }

      public Stream<cxh> a(czj $$0) {
         return $$0.b();
      }

      public czj a(czj $$0, Stream<cxh> $$1) {
         czj.a $$2 = new czj.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ewl<czk> c = new ewl<czk>() {
      @Override
      public ku<czk> a() {
         return kv.P;
      }

      public czk c() {
         return czk.a;
      }

      public Stream<cxh> a(czk $$0) {
         return $$0.a().stream();
      }

      public czk a(czk $$0, Stream<cxh> $$1) {
         return czk.a($$1.toList());
      }
   };
   Map<ku<?>, ewl<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ewl::a, $$0 -> (ewl<?>)$$0));
   Codec<ewl<?>> e = mb.ao.q().comapFlatMap($$0 -> {
      ewl<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ewl::a);
}
