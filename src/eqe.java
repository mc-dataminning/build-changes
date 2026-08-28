import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eqe {
   eqd<cxj> a = new eqd<cxj>() {
      @Override
      public kl<cxj> a() {
         return km.Z;
      }

      public Stream<cun> a(cxj $$0) {
         return $$0.b();
      }

      public cxj c() {
         return cxj.a;
      }

      public cxj a(cxj $$0, Stream<cun> $$1) {
         return cxj.a($$1.toList());
      }
   };
   eqd<cxa> b = new eqd<cxa>() {
      @Override
      public kl<cxa> a() {
         return km.E;
      }

      public cxa c() {
         return cxa.a;
      }

      public Stream<cun> a(cxa $$0) {
         return $$0.a();
      }

      public cxa a(cxa $$0, Stream<cun> $$1) {
         cxa.a $$2 = new cxa.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eqd<cxb> c = new eqd<cxb>() {
      @Override
      public kl<cxb> a() {
         return km.D;
      }

      public cxb c() {
         return cxb.a;
      }

      public Stream<cun> a(cxb $$0) {
         return $$0.a().stream();
      }

      public cxb a(cxb $$0, Stream<cun> $$1) {
         return cxb.a($$1.toList());
      }
   };
   Map<kl<?>, eqd<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eqd::a, $$0 -> (eqd<?>)$$0));
   Codec<eqd<?>> e = lp.as.q().comapFlatMap($$0 -> {
      eqd<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eqd::a);
}
