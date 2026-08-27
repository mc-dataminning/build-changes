import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eak {
   Codec<eak> b = kd.aj.q().dispatch(eak::b, Function.identity());

   void a(aup var1, BiConsumer<ahc<eai>, ahc<eai>> var2);

   Stream<ahc<eai>> a();

   static eaj a(String $$0, String $$1) {
      return a(pj.a($$0), pj.a($$1));
   }

   static eaj a(ahc<eai> $$0, ahc<eai> $$1) {
      return new eaj($$0, $$1);
   }

   static ean a(String $$0, bif<String> $$1) {
      bif.a<ahc<eai>> $$2 = bif.a();
      $$1.e().forEach($$1x -> $$2.a(pj.a((String)$$1x.b()), $$1x.a().a()));
      return a(pj.a($$0), $$2.a());
   }

   static ean a(ahc<eai> $$0, bif<ahc<eai>> $$1) {
      return new ean($$0, $$1);
   }

   static eao a(bif<List<eak>> $$0) {
      return new eao($$0);
   }

   Codec<? extends eak> b();
}
