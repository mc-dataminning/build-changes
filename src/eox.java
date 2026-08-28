import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eox {
   Codec<eox> b = mb.ah.q().dispatch(eox::b, Function.identity());

   void a(azh var1, BiConsumer<aku<eov>, aku<eov>> var2);

   Stream<aku<eov>> a();

   static eow a(String $$0, String $$1) {
      return a(ql.a($$0), ql.a($$1));
   }

   static eow a(aku<eov> $$0, aku<eov> $$1) {
      return new eow($$0, $$1);
   }

   static epa a(String $$0, bqr<String> $$1) {
      bqr.a<aku<eov>> $$2 = bqr.a();
      $$1.e().forEach($$1x -> $$2.a(ql.a((String)$$1x.b()), $$1x.a().a()));
      return a(ql.a($$0), $$2.a());
   }

   static epa a(aku<eov> $$0, bqr<aku<eov>> $$1) {
      return new epa($$0, $$1);
   }

   static epb a(bqr<List<eox>> $$0) {
      return new epb($$0);
   }

   MapCodec<? extends eox> b();
}
