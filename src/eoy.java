import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eoy {
   Codec<eoy> b = mb.ah.q().dispatch(eoy::b, Function.identity());

   void a(azh var1, BiConsumer<aku<eow>, aku<eow>> var2);

   Stream<aku<eow>> a();

   static eox a(String $$0, String $$1) {
      return a(ql.a($$0), ql.a($$1));
   }

   static eox a(aku<eow> $$0, aku<eow> $$1) {
      return new eox($$0, $$1);
   }

   static epb a(String $$0, bqs<String> $$1) {
      bqs.a<aku<eow>> $$2 = bqs.a();
      $$1.e().forEach($$1x -> $$2.a(ql.a((String)$$1x.b()), $$1x.a().a()));
      return a(ql.a($$0), $$2.a());
   }

   static epb a(aku<eow> $$0, bqs<aku<eow>> $$1) {
      return new epb($$0, $$1);
   }

   static epc a(bqs<List<eoy>> $$0) {
      return new epc($$0);
   }

   MapCodec<? extends eoy> b();
}
