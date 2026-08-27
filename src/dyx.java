import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface dyx {
   Codec<dyx> b = kc.ak.q().dispatch(dyx::b, Function.identity());

   void a(atw var1, BiConsumer<agl<dyv>, agl<dyv>> var2);

   Stream<agl<dyv>> a();

   static dyw a(String $$0, String $$1) {
      return a(pg.a($$0), pg.a($$1));
   }

   static dyw a(agl<dyv> $$0, agl<dyv> $$1) {
      return new dyw($$0, $$1);
   }

   static dza a(String $$0, bhl<String> $$1) {
      bhl.a<agl<dyv>> $$2 = bhl.a();
      $$1.e().forEach($$1x -> $$2.a(pg.a((String)$$1x.b()), $$1x.a().a()));
      return a(pg.a($$0), $$2.a());
   }

   static dza a(agl<dyv> $$0, bhl<agl<dyv>> $$1) {
      return new dza($$0, $$1);
   }

   static dzb a(bhl<List<dyx>> $$0) {
      return new dzb($$0);
   }

   Codec<? extends dyx> b();
}
