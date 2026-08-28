import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ezr {
   ezq<dcf> a = new ezq<dcf>() {
      @Override
      public kj<dcf> a() {
         return kk.ap;
      }

      public Stream<czn> a(dcf $$0) {
         return $$0.b();
      }

      public dcf c() {
         return dcf.a;
      }

      public dcf a(dcf $$0, Stream<czn> $$1) {
         return dcf.a($$1.toList());
      }
   };
   ezq<dbq> b = new ezq<dbq>() {
      @Override
      public kj<dbq> a() {
         return kk.Q;
      }

      public dbq c() {
         return dbq.a;
      }

      public Stream<czn> a(dbq $$0) {
         return $$0.b();
      }

      public dbq a(dbq $$0, Stream<czn> $$1) {
         dbq.a $$2 = new dbq.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ezq<dbr> c = new ezq<dbr>() {
      @Override
      public kj<dbr> a() {
         return kk.P;
      }

      public dbr c() {
         return dbr.a;
      }

      public Stream<czn> a(dbr $$0) {
         return $$0.a().stream();
      }

      public dbr a(dbr $$0, Stream<czn> $$1) {
         return dbr.a($$1.toList());
      }
   };
   Map<kj<?>, ezq<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ezq::a, $$0 -> (ezq<?>)$$0));
   Codec<ezq<?>> e = mg.am.q().comapFlatMap($$0 -> {
      ezq<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ezq::a);
}
