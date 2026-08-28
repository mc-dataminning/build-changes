import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface faf {
   fae<dcq> a = new fae<dcq>() {
      @Override
      public kj<dcq> a() {
         return kk.ap;
      }

      public Stream<czy> a(dcq $$0) {
         return $$0.b();
      }

      public dcq c() {
         return dcq.a;
      }

      public dcq a(dcq $$0, Stream<czy> $$1) {
         return dcq.a($$1.toList());
      }
   };
   fae<dcb> b = new fae<dcb>() {
      @Override
      public kj<dcb> a() {
         return kk.Q;
      }

      public dcb c() {
         return dcb.a;
      }

      public Stream<czy> a(dcb $$0) {
         return $$0.b();
      }

      public dcb a(dcb $$0, Stream<czy> $$1) {
         dcb.a $$2 = new dcb.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   fae<dcc> c = new fae<dcc>() {
      @Override
      public kj<dcc> a() {
         return kk.P;
      }

      public dcc c() {
         return dcc.a;
      }

      public Stream<czy> a(dcc $$0) {
         return $$0.a().stream();
      }

      public dcc a(dcc $$0, Stream<czy> $$1) {
         return dcc.a($$1.toList());
      }
   };
   Map<kj<?>, fae<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(fae::a, $$0 -> (fae<?>)$$0));
   Codec<fae<?>> e = mg.am.q().comapFlatMap($$0 -> {
      fae<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, fae::a);
}
