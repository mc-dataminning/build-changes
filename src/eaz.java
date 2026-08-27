import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eaz {
   Codec<eaz> b = kd.aj.q().dispatch(eaz::b, Function.identity());

   void a(auw var1, BiConsumer<ahg<eax>, ahg<eax>> var2);

   Stream<ahg<eax>> a();

   static eay a(String $$0, String $$1) {
      return a(pm.a($$0), pm.a($$1));
   }

   static eay a(ahg<eax> $$0, ahg<eax> $$1) {
      return new eay($$0, $$1);
   }

   static ebc a(String $$0, bim<String> $$1) {
      bim.a<ahg<eax>> $$2 = bim.a();
      $$1.e().forEach($$1x -> $$2.a(pm.a((String)$$1x.b()), $$1x.a().a()));
      return a(pm.a($$0), $$2.a());
   }

   static ebc a(ahg<eax> $$0, bim<ahg<eax>> $$1) {
      return new ebc($$0, $$1);
   }

   static ebd a(bim<List<eaz>> $$0) {
      return new ebd($$0);
   }

   Codec<? extends eaz> b();
}
