import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface esu {
   Codec<esu> b = mg.ah.q().dispatch(esu::b, Function.identity());

   void a(azv var1, BiConsumer<alf<ess>, alf<ess>> var2);

   Stream<alf<ess>> a();

   static est a(String $$0, String $$1) {
      return a(qo.a($$0), qo.a($$1));
   }

   static est a(alf<ess> $$0, alf<ess> $$1) {
      return new est($$0, $$1);
   }

   static esy a(String $$0, bsq<String> $$1) {
      bsq.a<alf<ess>> $$2 = bsq.b();
      $$1.d().forEach($$1x -> $$2.a(qo.a((String)$$1x.a()), $$1x.b()));
      return a(qo.a($$0), $$2.a());
   }

   static esy a(alf<ess> $$0, bsq<alf<ess>> $$1) {
      return new esy($$0, $$1);
   }

   static esx a(bsq<List<esu>> $$0) {
      return new esx($$0);
   }

   MapCodec<? extends esu> b();
}
