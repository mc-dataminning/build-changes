import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface evp {
   evo<czh> a = new evo<czh>() {
      @Override
      public ku<czh> a() {
         return kv.al;
      }

      public Stream<cwp> a(czh $$0) {
         return $$0.b();
      }

      public czh c() {
         return czh.a;
      }

      public czh a(czh $$0, Stream<cwp> $$1) {
         return czh.a($$1.toList());
      }
   };
   evo<cyt> b = new evo<cyt>() {
      @Override
      public ku<cyt> a() {
         return kv.P;
      }

      public cyt c() {
         return cyt.a;
      }

      public Stream<cwp> a(cyt $$0) {
         return $$0.b();
      }

      public cyt a(cyt $$0, Stream<cwp> $$1) {
         cyt.a $$2 = new cyt.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   evo<cyu> c = new evo<cyu>() {
      @Override
      public ku<cyu> a() {
         return kv.O;
      }

      public cyu c() {
         return cyu.a;
      }

      public Stream<cwp> a(cyu $$0) {
         return $$0.a().stream();
      }

      public cyu a(cyu $$0, Stream<cwp> $$1) {
         return cyu.a($$1.toList());
      }
   };
   Map<ku<?>, evo<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(evo::a, $$0 -> (evo<?>)$$0));
   Codec<evo<?>> e = mb.ao.q().comapFlatMap($$0 -> {
      evo<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, evo::a);
}
