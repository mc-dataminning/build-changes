import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface etu {
   ett<cyn> a = new ett<cyn>() {
      @Override
      public ks<cyn> a() {
         return kt.ak;
      }

      public Stream<cvx> a(cyn $$0) {
         return $$0.b();
      }

      public cyn c() {
         return cyn.a;
      }

      public cyn a(cyn $$0, Stream<cvx> $$1) {
         return cyn.a($$1.toList());
      }
   };
   ett<cyb> b = new ett<cyb>() {
      @Override
      public ks<cyb> a() {
         return kt.O;
      }

      public cyb c() {
         return cyb.a;
      }

      public Stream<cvx> a(cyb $$0) {
         return $$0.b();
      }

      public cyb a(cyb $$0, Stream<cvx> $$1) {
         cyb.a $$2 = new cyb.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ett<cyc> c = new ett<cyc>() {
      @Override
      public ks<cyc> a() {
         return kt.N;
      }

      public cyc c() {
         return cyc.a;
      }

      public Stream<cvx> a(cyc $$0) {
         return $$0.a().stream();
      }

      public cyc a(cyc $$0, Stream<cvx> $$1) {
         return cyc.a($$1.toList());
      }
   };
   Map<ks<?>, ett<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ett::a, $$0 -> (ett<?>)$$0));
   Codec<ett<?>> e = lx.ao.q().comapFlatMap($$0 -> {
      ett<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ett::a);
}
