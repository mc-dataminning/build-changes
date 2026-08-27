import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface dyg {
   Codec<dyg> b = jy.ak.q().dispatch(dyg::b, Function.identity());

   void a(ato var1, BiConsumer<agf<dye>, agf<dye>> var2);

   Stream<agf<dye>> a();

   static dyf a(String $$0, String $$1) {
      return a(pb.a($$0), pb.a($$1));
   }

   static dyf a(agf<dye> $$0, agf<dye> $$1) {
      return new dyf($$0, $$1);
   }

   static dyj a(String $$0, bha<String> $$1) {
      bha.a<agf<dye>> $$2 = bha.a();
      $$1.e().forEach($$1x -> $$2.a(pb.a((String)$$1x.b()), $$1x.a().a()));
      return a(pb.a($$0), $$2.a());
   }

   static dyj a(agf<dye> $$0, bha<agf<dye>> $$1) {
      return new dyj($$0, $$1);
   }

   static dyk a(bha<List<dyg>> $$0) {
      return new dyk($$0);
   }

   Codec<? extends dyg> b();
}
