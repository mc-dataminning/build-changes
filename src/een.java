import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface een {
   Codec<een> b = ki.aj.q().dispatch(een::b, Function.identity());

   void a(axd var1, BiConsumer<ajg<eel>, ajg<eel>> var2);

   Stream<ajg<eel>> a();

   static eem a(String $$0, String $$1) {
      return a(ps.a($$0), ps.a($$1));
   }

   static eem a(ajg<eel> $$0, ajg<eel> $$1) {
      return new eem($$0, $$1);
   }

   static eeq a(String $$0, blm<String> $$1) {
      blm.a<ajg<eel>> $$2 = blm.a();
      $$1.e().forEach($$1x -> $$2.a(ps.a((String)$$1x.b()), $$1x.a().a()));
      return a(ps.a($$0), $$2.a());
   }

   static eeq a(ajg<eel> $$0, blm<ajg<eel>> $$1) {
      return new eeq($$0, $$1);
   }

   static eer a(blm<List<een>> $$0) {
      return new eer($$0);
   }

   Codec<? extends een> b();
}
