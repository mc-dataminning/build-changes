import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eqf {
   eqe<cxk> a = new eqe<cxk>() {
      @Override
      public kl<cxk> a() {
         return km.aa;
      }

      public Stream<cuo> a(cxk $$0) {
         return $$0.b();
      }

      public cxk c() {
         return cxk.a;
      }

      public cxk a(cxk $$0, Stream<cuo> $$1) {
         return cxk.a($$1.toList());
      }
   };
   eqe<cxb> b = new eqe<cxb>() {
      @Override
      public kl<cxb> a() {
         return km.F;
      }

      public cxb c() {
         return cxb.a;
      }

      public Stream<cuo> a(cxb $$0) {
         return $$0.a();
      }

      public cxb a(cxb $$0, Stream<cuo> $$1) {
         cxb.a $$2 = new cxb.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eqe<cxc> c = new eqe<cxc>() {
      @Override
      public kl<cxc> a() {
         return km.E;
      }

      public cxc c() {
         return cxc.a;
      }

      public Stream<cuo> a(cxc $$0) {
         return $$0.a().stream();
      }

      public cxc a(cxc $$0, Stream<cuo> $$1) {
         return cxc.a($$1.toList());
      }
   };
   Map<kl<?>, eqe<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eqe::a, $$0 -> (eqe<?>)$$0));
   Codec<eqe<?>> e = lp.as.q().comapFlatMap($$0 -> {
      eqe<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eqe::a);
}
