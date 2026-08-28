import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface evq {
   evp<czi> a = new evp<czi>() {
      @Override
      public ku<czi> a() {
         return kv.al;
      }

      public Stream<cwq> a(czi $$0) {
         return $$0.b();
      }

      public czi c() {
         return czi.a;
      }

      public czi a(czi $$0, Stream<cwq> $$1) {
         return czi.a($$1.toList());
      }
   };
   evp<cyu> b = new evp<cyu>() {
      @Override
      public ku<cyu> a() {
         return kv.P;
      }

      public cyu c() {
         return cyu.a;
      }

      public Stream<cwq> a(cyu $$0) {
         return $$0.b();
      }

      public cyu a(cyu $$0, Stream<cwq> $$1) {
         cyu.a $$2 = new cyu.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   evp<cyv> c = new evp<cyv>() {
      @Override
      public ku<cyv> a() {
         return kv.O;
      }

      public cyv c() {
         return cyv.a;
      }

      public Stream<cwq> a(cyv $$0) {
         return $$0.a().stream();
      }

      public cyv a(cyv $$0, Stream<cwq> $$1) {
         return cyv.a($$1.toList());
      }
   };
   Map<ku<?>, evp<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(evp::a, $$0 -> (evp<?>)$$0));
   Codec<evp<?>> e = mb.ao.q().comapFlatMap($$0 -> {
      evp<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, evp::a);
}
