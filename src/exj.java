import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface exj {
   exi<dan> a = new exi<dan>() {
      @Override
      public kw<dan> a() {
         return kx.an;
      }

      public Stream<cxy> a(dan $$0) {
         return $$0.b();
      }

      public dan c() {
         return dan.a;
      }

      public dan a(dan $$0, Stream<cxy> $$1) {
         return dan.a($$1.toList());
      }
   };
   exi<czz> b = new exi<czz>() {
      @Override
      public kw<czz> a() {
         return kx.Q;
      }

      public czz c() {
         return czz.a;
      }

      public Stream<cxy> a(czz $$0) {
         return $$0.b();
      }

      public czz a(czz $$0, Stream<cxy> $$1) {
         czz.a $$2 = new czz.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   exi<daa> c = new exi<daa>() {
      @Override
      public kw<daa> a() {
         return kx.P;
      }

      public daa c() {
         return daa.a;
      }

      public Stream<cxy> a(daa $$0) {
         return $$0.a().stream();
      }

      public daa a(daa $$0, Stream<cxy> $$1) {
         return daa.a($$1.toList());
      }
   };
   Map<kw<?>, exi<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(exi::a, $$0 -> (exi<?>)$$0));
   Codec<exi<?>> e = md.ao.q().comapFlatMap($$0 -> {
      exi<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, exi::a);
}
