import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface epv {
   Codec<epv> b = ma.ah.q().dispatch(epv::b, Function.identity());

   void a(bam var1, BiConsumer<aly<ept>, aly<ept>> var2);

   Stream<aly<ept>> a();

   static epu a(String $$0, String $$1) {
      return a(rr.a($$0), rr.a($$1));
   }

   static epu a(aly<ept> $$0, aly<ept> $$1) {
      return new epu($$0, $$1);
   }

   static epy a(String $$0, brq<String> $$1) {
      brq.a<aly<ept>> $$2 = brq.a();
      $$1.e().forEach($$1x -> $$2.a(rr.a((String)$$1x.b()), $$1x.a().a()));
      return a(rr.a($$0), $$2.a());
   }

   static epy a(aly<ept> $$0, brq<aly<ept>> $$1) {
      return new epy($$0, $$1);
   }

   static epz a(brq<List<epv>> $$0) {
      return new epz($$0);
   }

   MapCodec<? extends epv> b();
}
