import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface evn {
   evm<czf> a = new evm<czf>() {
      @Override
      public ku<czf> a() {
         return kv.al;
      }

      public Stream<cwn> a(czf $$0) {
         return $$0.b();
      }

      public czf c() {
         return czf.a;
      }

      public czf a(czf $$0, Stream<cwn> $$1) {
         return czf.a($$1.toList());
      }
   };
   evm<cyr> b = new evm<cyr>() {
      @Override
      public ku<cyr> a() {
         return kv.P;
      }

      public cyr c() {
         return cyr.a;
      }

      public Stream<cwn> a(cyr $$0) {
         return $$0.b();
      }

      public cyr a(cyr $$0, Stream<cwn> $$1) {
         cyr.a $$2 = new cyr.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   evm<cys> c = new evm<cys>() {
      @Override
      public ku<cys> a() {
         return kv.O;
      }

      public cys c() {
         return cys.a;
      }

      public Stream<cwn> a(cys $$0) {
         return $$0.a().stream();
      }

      public cys a(cys $$0, Stream<cwn> $$1) {
         return cys.a($$1.toList());
      }
   };
   Map<ku<?>, evm<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(evm::a, $$0 -> (evm<?>)$$0));
   Codec<evm<?>> e = mb.ao.q().comapFlatMap($$0 -> {
      evm<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, evm::a);
}
