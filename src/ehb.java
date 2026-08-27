import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ehb {
   Codec<ehb> b = kt.aj.q().dispatch(ehb::b, Function.identity());

   void a(axt var1, BiConsumer<aju<egz>, aju<egz>> var2);

   Stream<aju<egz>> a();

   static eha a(String $$0, String $$1) {
      return a(qg.a($$0), qg.a($$1));
   }

   static eha a(aju<egz> $$0, aju<egz> $$1) {
      return new eha($$0, $$1);
   }

   static ehe a(String $$0, bmp<String> $$1) {
      bmp.a<aju<egz>> $$2 = bmp.a();
      $$1.e().forEach($$1x -> $$2.a(qg.a((String)$$1x.b()), $$1x.a().a()));
      return a(qg.a($$0), $$2.a());
   }

   static ehe a(aju<egz> $$0, bmp<aju<egz>> $$1) {
      return new ehe($$0, $$1);
   }

   static ehf a(bmp<List<ehb>> $$0) {
      return new ehf($$0);
   }

   Codec<? extends ehb> b();
}
