import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ewg {
   ewf<czy> a = new ewf<czy>() {
      @Override
      public kt<czy> a() {
         return ku.al;
      }

      public Stream<cxg> a(czy $$0) {
         return $$0.b();
      }

      public czy c() {
         return czy.a;
      }

      public czy a(czy $$0, Stream<cxg> $$1) {
         return czy.a($$1.toList());
      }
   };
   ewf<czk> b = new ewf<czk>() {
      @Override
      public kt<czk> a() {
         return ku.P;
      }

      public czk c() {
         return czk.a;
      }

      public Stream<cxg> a(czk $$0) {
         return $$0.b();
      }

      public czk a(czk $$0, Stream<cxg> $$1) {
         czk.a $$2 = new czk.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   ewf<czl> c = new ewf<czl>() {
      @Override
      public kt<czl> a() {
         return ku.O;
      }

      public czl c() {
         return czl.a;
      }

      public Stream<cxg> a(czl $$0) {
         return $$0.a().stream();
      }

      public czl a(czl $$0, Stream<cxg> $$1) {
         return czl.a($$1.toList());
      }
   };
   Map<kt<?>, ewf<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(ewf::a, $$0 -> (ewf<?>)$$0));
   Codec<ewf<?>> e = ma.ao.q().comapFlatMap($$0 -> {
      ewf<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, ewf::a);
}
