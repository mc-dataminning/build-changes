import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eep {
   Codec<eep> b = ki.aj.q().dispatch(eep::b, Function.identity());

   void a(axd var1, BiConsumer<ajg<een>, ajg<een>> var2);

   Stream<ajg<een>> a();

   static eeo a(String $$0, String $$1) {
      return a(ps.a($$0), ps.a($$1));
   }

   static eeo a(ajg<een> $$0, ajg<een> $$1) {
      return new eeo($$0, $$1);
   }

   static ees a(String $$0, bln<String> $$1) {
      bln.a<ajg<een>> $$2 = bln.a();
      $$1.e().forEach($$1x -> $$2.a(ps.a((String)$$1x.b()), $$1x.a().a()));
      return a(ps.a($$0), $$2.a());
   }

   static ees a(ajg<een> $$0, bln<ajg<een>> $$1) {
      return new ees($$0, $$1);
   }

   static eet a(bln<List<eep>> $$0) {
      return new eet($$0);
   }

   Codec<? extends eep> b();
}
