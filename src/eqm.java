import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eqm {
   eql<cwv> a = new eql<cwv>() {
      @Override
      public km<cwv> a() {
         return kn.aa;
      }

      public Stream<cua> a(cwv $$0) {
         return $$0.b();
      }

      public cwv c() {
         return cwv.a;
      }

      public cwv a(cwv $$0, Stream<cua> $$1) {
         return cwv.a($$1.toList());
      }
   };
   eql<cwm> b = new eql<cwm>() {
      @Override
      public km<cwm> a() {
         return kn.F;
      }

      public cwm c() {
         return cwm.a;
      }

      public Stream<cua> a(cwm $$0) {
         return $$0.a();
      }

      public cwm a(cwm $$0, Stream<cua> $$1) {
         cwm.a $$2 = new cwm.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eql<cwn> c = new eql<cwn>() {
      @Override
      public km<cwn> a() {
         return kn.E;
      }

      public cwn c() {
         return cwn.a;
      }

      public Stream<cua> a(cwn $$0) {
         return $$0.a().stream();
      }

      public cwn a(cwn $$0, Stream<cua> $$1) {
         return cwn.a($$1.toList());
      }
   };
   Map<km<?>, eql<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eql::a, $$0 -> (eql<?>)$$0));
   Codec<eql<?>> e = lq.aq.r().comapFlatMap($$0 -> {
      eql<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eql::a);
}
