import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ecw {
   Codec<ecw> b = kf.aj.q().dispatch(ecw::b, Function.identity());

   void a(awp var1, BiConsumer<aix<ecu>, aix<ecu>> var2);

   Stream<aix<ecu>> a();

   static ecv a(String $$0, String $$1) {
      return a(po.a($$0), po.a($$1));
   }

   static ecv a(aix<ecu> $$0, aix<ecu> $$1) {
      return new ecv($$0, $$1);
   }

   static ecz a(String $$0, bkg<String> $$1) {
      bkg.a<aix<ecu>> $$2 = bkg.a();
      $$1.e().forEach($$1x -> $$2.a(po.a((String)$$1x.b()), $$1x.a().a()));
      return a(po.a($$0), $$2.a());
   }

   static ecz a(aix<ecu> $$0, bkg<aix<ecu>> $$1) {
      return new ecz($$0, $$1);
   }

   static eda a(bkg<List<ecw>> $$0) {
      return new eda($$0);
   }

   Codec<? extends ecw> b();
}
