import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eju {
   Codec<eju> b = lp.aj.q().dispatch(eju::b, Function.identity());

   void a(azg var1, BiConsumer<ald<ejs>, ald<ejs>> var2);

   Stream<ald<ejs>> a();

   static ejt a(String $$0, String $$1) {
      return a(rj.a($$0), rj.a($$1));
   }

   static ejt a(ald<ejs> $$0, ald<ejs> $$1) {
      return new ejt($$0, $$1);
   }

   static ejx a(String $$0, bpd<String> $$1) {
      bpd.a<ald<ejs>> $$2 = bpd.a();
      $$1.e().forEach($$1x -> $$2.a(rj.a((String)$$1x.b()), $$1x.a().a()));
      return a(rj.a($$0), $$2.a());
   }

   static ejx a(ald<ejs> $$0, bpd<ald<ejs>> $$1) {
      return new ejx($$0, $$1);
   }

   static ejy a(bpd<List<eju>> $$0) {
      return new ejy($$0);
   }

   MapCodec<? extends eju> b();
}
