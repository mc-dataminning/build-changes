import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface enu {
   Codec<enu> b = lz.ah.q().dispatch(enu::b, Function.identity());

   void a(azu var1, BiConsumer<ali<ens>, ali<ens>> var2);

   Stream<ali<ens>> a();

   static ent a(String $$0, String $$1) {
      return a(rg.a($$0), rg.a($$1));
   }

   static ent a(ali<ens> $$0, ali<ens> $$1) {
      return new ent($$0, $$1);
   }

   static enx a(String $$0, bqs<String> $$1) {
      bqs.a<ali<ens>> $$2 = bqs.a();
      $$1.e().forEach($$1x -> $$2.a(rg.a((String)$$1x.b()), $$1x.a().a()));
      return a(rg.a($$0), $$2.a());
   }

   static enx a(ali<ens> $$0, bqs<ali<ens>> $$1) {
      return new enx($$0, $$1);
   }

   static eny a(bqs<List<enu>> $$0) {
      return new eny($$0);
   }

   MapCodec<? extends enu> b();
}
