import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface epp {
   Codec<epp> b = ma.ah.q().dispatch(epp::b, Function.identity());

   void a(bac var1, BiConsumer<alo<epn>, alo<epn>> var2);

   Stream<alo<epn>> a();

   static epo a(String $$0, String $$1) {
      return a(rh.a($$0), rh.a($$1));
   }

   static epo a(alo<epn> $$0, alo<epn> $$1) {
      return new epo($$0, $$1);
   }

   static eps a(String $$0, bri<String> $$1) {
      bri.a<alo<epn>> $$2 = bri.a();
      $$1.e().forEach($$1x -> $$2.a(rh.a((String)$$1x.b()), $$1x.a().a()));
      return a(rh.a($$0), $$2.a());
   }

   static eps a(alo<epn> $$0, bri<alo<epn>> $$1) {
      return new eps($$0, $$1);
   }

   static ept a(bri<List<epp>> $$0) {
      return new ept($$0);
   }

   MapCodec<? extends epp> b();
}
