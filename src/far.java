import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface far {
   faq<ddc> a = new faq<ddc>() {
      @Override
      public kk<ddc> a() {
         return kl.ap;
      }

      public Stream<dak> a(ddc $$0) {
         return $$0.b();
      }

      public ddc c() {
         return ddc.a;
      }

      public ddc a(ddc $$0, Stream<dak> $$1) {
         return ddc.a($$1.toList());
      }
   };
   faq<dcn> b = new faq<dcn>() {
      @Override
      public kk<dcn> a() {
         return kl.Q;
      }

      public dcn c() {
         return dcn.a;
      }

      public Stream<dak> a(dcn $$0) {
         return $$0.b();
      }

      public dcn a(dcn $$0, Stream<dak> $$1) {
         dcn.a $$2 = new dcn.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   faq<dco> c = new faq<dco>() {
      @Override
      public kk<dco> a() {
         return kl.P;
      }

      public dco c() {
         return dco.a;
      }

      public Stream<dak> a(dco $$0) {
         return $$0.a().stream();
      }

      public dco a(dco $$0, Stream<dak> $$1) {
         return dco.a($$1.toList());
      }
   };
   Map<kk<?>, faq<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(faq::a, $$0 -> (faq<?>)$$0));
   Codec<faq<?>> e = mh.am.q().comapFlatMap($$0 -> {
      faq<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, faq::a);
}
