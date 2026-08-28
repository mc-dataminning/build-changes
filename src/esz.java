import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface esz {
   Codec<esz> b = mg.ah.q().dispatch(esz::b, Function.identity());

   void a(azv var1, BiConsumer<alf<esx>, alf<esx>> var2);

   Stream<alf<esx>> a();

   static esy a(String $$0, String $$1) {
      return a(qo.a($$0), qo.a($$1));
   }

   static esy a(alf<esx> $$0, alf<esx> $$1) {
      return new esy($$0, $$1);
   }

   static etd a(String $$0, bsq<String> $$1) {
      bsq.a<alf<esx>> $$2 = bsq.b();
      $$1.d().forEach($$1x -> $$2.a(qo.a((String)$$1x.a()), $$1x.b()));
      return a(qo.a($$0), $$2.a());
   }

   static etd a(alf<esx> $$0, bsq<alf<esx>> $$1) {
      return new etd($$0, $$1);
   }

   static etc a(bsq<List<esz>> $$0) {
      return new etc($$0);
   }

   MapCodec<? extends esz> b();
}
