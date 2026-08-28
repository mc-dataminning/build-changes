import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface eua {
   etz<cyt> a = new etz<cyt>() {
      @Override
      public kt<cyt> a() {
         return ku.al;
      }

      public Stream<cwb> a(cyt $$0) {
         return $$0.b();
      }

      public cyt c() {
         return cyt.a;
      }

      public cyt a(cyt $$0, Stream<cwb> $$1) {
         return cyt.a($$1.toList());
      }
   };
   etz<cyf> b = new etz<cyf>() {
      @Override
      public kt<cyf> a() {
         return ku.P;
      }

      public cyf c() {
         return cyf.a;
      }

      public Stream<cwb> a(cyf $$0) {
         return $$0.b();
      }

      public cyf a(cyf $$0, Stream<cwb> $$1) {
         cyf.a $$2 = new cyf.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   etz<cyg> c = new etz<cyg>() {
      @Override
      public kt<cyg> a() {
         return ku.O;
      }

      public cyg c() {
         return cyg.a;
      }

      public Stream<cwb> a(cyg $$0) {
         return $$0.a().stream();
      }

      public cyg a(cyg $$0, Stream<cwb> $$1) {
         return cyg.a($$1.toList());
      }
   };
   Map<kt<?>, etz<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(etz::a, $$0 -> (etz<?>)$$0));
   Codec<etz<?>> e = ly.ao.q().comapFlatMap($$0 -> {
      etz<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, etz::a);
}
