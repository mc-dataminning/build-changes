import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface end {
   Codec<end> b = lx.ah.q().dispatch(end::b, Function.identity());

   void a(azr var1, BiConsumer<alg<enb>, alg<enb>> var2);

   Stream<alg<enb>> a();

   static enc a(String $$0, String $$1) {
      return a(re.a($$0), re.a($$1));
   }

   static enc a(alg<enb> $$0, alg<enb> $$1) {
      return new enc($$0, $$1);
   }

   static eng a(String $$0, bqg<String> $$1) {
      bqg.a<alg<enb>> $$2 = bqg.a();
      $$1.e().forEach($$1x -> $$2.a(re.a((String)$$1x.b()), $$1x.a().a()));
      return a(re.a($$0), $$2.a());
   }

   static eng a(alg<enb> $$0, bqg<alg<enb>> $$1) {
      return new eng($$0, $$1);
   }

   static enh a(bqg<List<end>> $$0) {
      return new enh($$0);
   }

   MapCodec<? extends end> b();
}
