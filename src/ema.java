import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ema {
   Codec<ema> b = lu.ah.q().dispatch(ema::b, Function.identity());

   void a(azk var1, BiConsumer<ala<ely>, ala<ely>> var2);

   Stream<ala<ely>> a();

   static elz a(String $$0, String $$1) {
      return a(ra.a($$0), ra.a($$1));
   }

   static elz a(ala<ely> $$0, ala<ely> $$1) {
      return new elz($$0, $$1);
   }

   static emd a(String $$0, bpu<String> $$1) {
      bpu.a<ala<ely>> $$2 = bpu.a();
      $$1.e().forEach($$1x -> $$2.a(ra.a((String)$$1x.b()), $$1x.a().a()));
      return a(ra.a($$0), $$2.a());
   }

   static emd a(ala<ely> $$0, bpu<ala<ely>> $$1) {
      return new emd($$0, $$1);
   }

   static eme a(bpu<List<ema>> $$0) {
      return new eme($$0);
   }

   MapCodec<? extends ema> b();
}
