import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eoz {
   Codec<eoz> b = mb.ah.q().dispatch(eoz::b, Function.identity());

   void a(azh var1, BiConsumer<aku<eox>, aku<eox>> var2);

   Stream<aku<eox>> a();

   static eoy a(String $$0, String $$1) {
      return a(ql.a($$0), ql.a($$1));
   }

   static eoy a(aku<eox> $$0, aku<eox> $$1) {
      return new eoy($$0, $$1);
   }

   static epc a(String $$0, bqt<String> $$1) {
      bqt.a<aku<eox>> $$2 = bqt.a();
      $$1.e().forEach($$1x -> $$2.a(ql.a((String)$$1x.b()), $$1x.a().a()));
      return a(ql.a($$0), $$2.a());
   }

   static epc a(aku<eox> $$0, bqt<aku<eox>> $$1) {
      return new epc($$0, $$1);
   }

   static epd a(bqt<List<eoz>> $$0) {
      return new epd($$0);
   }

   MapCodec<? extends eoz> b();
}
