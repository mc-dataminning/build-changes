import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface dzz {
   Codec<dzz> b = kb.aj.q().dispatch(dzz::b, Function.identity());

   void a(auf var1, BiConsumer<ags<dzx>, ags<dzx>> var2);

   Stream<ags<dzx>> a();

   static dzy a(String $$0, String $$1) {
      return a(ph.a($$0), ph.a($$1));
   }

   static dzy a(ags<dzx> $$0, ags<dzx> $$1) {
      return new dzy($$0, $$1);
   }

   static eac a(String $$0, bhv<String> $$1) {
      bhv.a<ags<dzx>> $$2 = bhv.a();
      $$1.e().forEach($$1x -> $$2.a(ph.a((String)$$1x.b()), $$1x.a().a()));
      return a(ph.a($$0), $$2.a());
   }

   static eac a(ags<dzx> $$0, bhv<ags<dzx>> $$1) {
      return new eac($$0, $$1);
   }

   static ead a(bhv<List<dzz>> $$0) {
      return new ead($$0);
   }

   Codec<? extends dzz> b();
}
