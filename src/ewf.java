import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ewf {
   ewe<dac> a = new ewe<dac>() {
      @Override
      public kt<dac> a() {
         return ku.al;
      }

      public Stream<cxk> a(dac $$0) {
         return $$0.b();
      }

      public dac c() {
         return dac.a;
      }

      public dac a(dac $$0, Stream<cxk> $$1) {
         return dac.a($$1.toList());
      }
   };
   ewe<czo> b = new ewe<czo>() {
      @Override
      public kt<czo> a() {
         return ku.P;
      }

      public czo c() {
         return czo.a;
      }

      public Stream<cxk> a(czo $$0) {
         return $$0.b();
      }

      public czo a(czo $$0, Stream<cxk> $$1) {
         czo.a $$2 = new czo.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ewe<czp> c = new ewe<czp>() {
      @Override
      public kt<czp> a() {
         return ku.O;
      }

      public czp c() {
         return czp.a;
      }

      public Stream<cxk> a(czp $$0) {
         return $$0.a().stream();
      }

      public czp a(czp $$0, Stream<cxk> $$1) {
         return czp.a($$1.toList());
      }
   };
   Map<kt<?>, ewe<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ewe::a, $$0 -> (ewe<?>)$$0));
   Codec<ewe<?>> e = ma.ao.q().comapFlatMap($$0 -> {
      ewe<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ewe::a);
}
