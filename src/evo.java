import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface evo {
   evn<czg> a = new evn<czg>() {
      @Override
      public ku<czg> a() {
         return kv.al;
      }

      public Stream<cwo> a(czg $$0) {
         return $$0.b();
      }

      public czg c() {
         return czg.a;
      }

      public czg a(czg $$0, Stream<cwo> $$1) {
         return czg.a($$1.toList());
      }
   };
   evn<cys> b = new evn<cys>() {
      @Override
      public ku<cys> a() {
         return kv.P;
      }

      public cys c() {
         return cys.a;
      }

      public Stream<cwo> a(cys $$0) {
         return $$0.b();
      }

      public cys a(cys $$0, Stream<cwo> $$1) {
         cys.a $$2 = new cys.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   evn<cyt> c = new evn<cyt>() {
      @Override
      public ku<cyt> a() {
         return kv.O;
      }

      public cyt c() {
         return cyt.a;
      }

      public Stream<cwo> a(cyt $$0) {
         return $$0.a().stream();
      }

      public cyt a(cyt $$0, Stream<cwo> $$1) {
         return cyt.a($$1.toList());
      }
   };
   Map<ku<?>, evn<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(evn::a, $$0 -> (evn<?>)$$0));
   Codec<evn<?>> e = mb.ao.q().comapFlatMap($$0 -> {
      evn<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, evn::a);
}
