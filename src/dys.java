import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface dys {
   Codec<dys> b = jy.ak.q().dispatch(dys::b, Function.identity());

   void a(ats var1, BiConsumer<agh<dyq>, agh<dyq>> var2);

   Stream<agh<dyq>> a();

   static dyr a(String $$0, String $$1) {
      return a(pc.a($$0), pc.a($$1));
   }

   static dyr a(agh<dyq> $$0, agh<dyq> $$1) {
      return new dyr($$0, $$1);
   }

   static dyv a(String $$0, bhh<String> $$1) {
      bhh.a<agh<dyq>> $$2 = bhh.a();
      $$1.e().forEach($$1x -> $$2.a(pc.a((String)$$1x.b()), $$1x.a().a()));
      return a(pc.a($$0), $$2.a());
   }

   static dyv a(agh<dyq> $$0, bhh<agh<dyq>> $$1) {
      return new dyv($$0, $$1);
   }

   static dyw a(bhh<List<dys>> $$0) {
      return new dyw($$0);
   }

   Codec<? extends dys> b();
}
