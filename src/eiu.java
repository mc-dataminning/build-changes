import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eiu {
   Codec<eiu> b = le.aj.q().dispatch(eiu::b, Function.identity());

   void a(ayk var1, BiConsumer<akl<eis>, akl<eis>> var2);

   Stream<akl<eis>> a();

   static eit a(String $$0, String $$1) {
      return a(qv.a($$0), qv.a($$1));
   }

   static eit a(akl<eis> $$0, akl<eis> $$1) {
      return new eit($$0, $$1);
   }

   static eix a(String $$0, boe<String> $$1) {
      boe.a<akl<eis>> $$2 = boe.a();
      $$1.e().forEach($$1x -> $$2.a(qv.a((String)$$1x.b()), $$1x.a().a()));
      return a(qv.a($$0), $$2.a());
   }

   static eix a(akl<eis> $$0, boe<akl<eis>> $$1) {
      return new eix($$0, $$1);
   }

   static eiy a(boe<List<eiu>> $$0) {
      return new eiy($$0);
   }

   MapCodec<? extends eiu> b();
}
