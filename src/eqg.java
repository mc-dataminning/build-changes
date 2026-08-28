import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eqg {
   eqf<cxl> a = new eqf<cxl>() {
      @Override
      public kl<cxl> a() {
         return km.aa;
      }

      public Stream<cup> a(cxl $$0) {
         return $$0.b();
      }

      public cxl c() {
         return cxl.a;
      }

      public cxl a(cxl $$0, Stream<cup> $$1) {
         return cxl.a($$1.toList());
      }
   };
   eqf<cxc> b = new eqf<cxc>() {
      @Override
      public kl<cxc> a() {
         return km.F;
      }

      public cxc c() {
         return cxc.a;
      }

      public Stream<cup> a(cxc $$0) {
         return $$0.a();
      }

      public cxc a(cxc $$0, Stream<cup> $$1) {
         cxc.a $$2 = new cxc.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eqf<cxd> c = new eqf<cxd>() {
      @Override
      public kl<cxd> a() {
         return km.E;
      }

      public cxd c() {
         return cxd.a;
      }

      public Stream<cup> a(cxd $$0) {
         return $$0.a().stream();
      }

      public cxd a(cxd $$0, Stream<cup> $$1) {
         return cxd.a($$1.toList());
      }
   };
   Map<kl<?>, eqf<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eqf::a, $$0 -> (eqf<?>)$$0));
   Codec<eqf<?>> e = lp.as.q().comapFlatMap($$0 -> {
      eqf<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eqf::a);
}
