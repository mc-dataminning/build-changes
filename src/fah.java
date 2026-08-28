import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface fah {
   fag<dcs> a = new fag<dcs>() {
      @Override
      public kk<dcs> a() {
         return kl.ap;
      }

      public Stream<daa> a(dcs $$0) {
         return $$0.b();
      }

      public dcs c() {
         return dcs.a;
      }

      public dcs a(dcs $$0, Stream<daa> $$1) {
         return dcs.a($$1.toList());
      }
   };
   fag<dcd> b = new fag<dcd>() {
      @Override
      public kk<dcd> a() {
         return kl.Q;
      }

      public dcd c() {
         return dcd.a;
      }

      public Stream<daa> a(dcd $$0) {
         return $$0.b();
      }

      public dcd a(dcd $$0, Stream<daa> $$1) {
         dcd.a $$2 = new dcd.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   fag<dce> c = new fag<dce>() {
      @Override
      public kk<dce> a() {
         return kl.P;
      }

      public dce c() {
         return dce.a;
      }

      public Stream<daa> a(dce $$0) {
         return $$0.a().stream();
      }

      public dce a(dce $$0, Stream<daa> $$1) {
         return dce.a($$1.toList());
      }
   };
   Map<kk<?>, fag<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(fag::a, $$0 -> (fag<?>)$$0));
   Codec<fag<?>> e = mh.am.q().comapFlatMap($$0 -> {
      fag<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, fag::a);
}
