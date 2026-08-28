import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface etj {
   eti<cyo> a = new eti<cyo>() {
      @Override
      public kr<cyo> a() {
         return ks.ag;
      }

      public Stream<cvs> a(cyo $$0) {
         return $$0.b();
      }

      public cyo c() {
         return cyo.a;
      }

      public cyo a(cyo $$0, Stream<cvs> $$1) {
         return cyo.a($$1.toList());
      }
   };
   eti<cyc> b = new eti<cyc>() {
      @Override
      public kr<cyc> a() {
         return ks.K;
      }

      public cyc c() {
         return cyc.a;
      }

      public Stream<cvs> a(cyc $$0) {
         return $$0.b();
      }

      public cyc a(cyc $$0, Stream<cvs> $$1) {
         cyc.a $$2 = new cyc.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   eti<cyd> c = new eti<cyd>() {
      @Override
      public kr<cyd> a() {
         return ks.J;
      }

      public cyd c() {
         return cyd.a;
      }

      public Stream<cvs> a(cyd $$0) {
         return $$0.a().stream();
      }

      public cyd a(cyd $$0, Stream<cvs> $$1) {
         return cyd.a($$1.toList());
      }
   };
   Map<kr<?>, eti<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(eti::a, $$0 -> (eti<?>)$$0));
   Codec<eti<?>> e = lv.ap.q().comapFlatMap($$0 -> {
      eti<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, eti::a);
}
