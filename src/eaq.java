import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eaq {
   Codec<eaq> b = kd.aj.q().dispatch(eaq::b, Function.identity());

   void a(auu var1, BiConsumer<ahf<eao>, ahf<eao>> var2);

   Stream<ahf<eao>> a();

   static eap a(String $$0, String $$1) {
      return a(pl.a($$0), pl.a($$1));
   }

   static eap a(ahf<eao> $$0, ahf<eao> $$1) {
      return new eap($$0, $$1);
   }

   static eat a(String $$0, bik<String> $$1) {
      bik.a<ahf<eao>> $$2 = bik.a();
      $$1.e().forEach($$1x -> $$2.a(pl.a((String)$$1x.b()), $$1x.a().a()));
      return a(pl.a($$0), $$2.a());
   }

   static eat a(ahf<eao> $$0, bik<ahf<eao>> $$1) {
      return new eat($$0, $$1);
   }

   static eau a(bik<List<eaq>> $$0) {
      return new eau($$0);
   }

   Codec<? extends eaq> b();
}
