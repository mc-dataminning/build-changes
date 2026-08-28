import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ezm {
   ezl<dcc> a = new ezl<dcc>() {
      @Override
      public kj<dcc> a() {
         return kk.ap;
      }

      public Stream<czk> a(dcc $$0) {
         return $$0.b();
      }

      public dcc c() {
         return dcc.a;
      }

      public dcc a(dcc $$0, Stream<czk> $$1) {
         return dcc.a($$1.toList());
      }
   };
   ezl<dbn> b = new ezl<dbn>() {
      @Override
      public kj<dbn> a() {
         return kk.Q;
      }

      public dbn c() {
         return dbn.a;
      }

      public Stream<czk> a(dbn $$0) {
         return $$0.b();
      }

      public dbn a(dbn $$0, Stream<czk> $$1) {
         dbn.a $$2 = new dbn.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ezl<dbo> c = new ezl<dbo>() {
      @Override
      public kj<dbo> a() {
         return kk.P;
      }

      public dbo c() {
         return dbo.a;
      }

      public Stream<czk> a(dbo $$0) {
         return $$0.a().stream();
      }

      public dbo a(dbo $$0, Stream<czk> $$1) {
         return dbo.a($$1.toList());
      }
   };
   Map<kj<?>, ezl<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ezl::a, $$0 -> (ezl<?>)$$0));
   Codec<ezl<?>> e = mg.am.q().comapFlatMap($$0 -> {
      ezl<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ezl::a);
}
