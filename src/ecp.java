import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ecp {
   Codec<ecp> b = kf.aj.q().dispatch(ecp::b, Function.identity());

   void a(awo var1, BiConsumer<aix<ecn>, aix<ecn>> var2);

   Stream<aix<ecn>> a();

   static eco a(String $$0, String $$1) {
      return a(po.a($$0), po.a($$1));
   }

   static eco a(aix<ecn> $$0, aix<ecn> $$1) {
      return new eco($$0, $$1);
   }

   static ecs a(String $$0, bke<String> $$1) {
      bke.a<aix<ecn>> $$2 = bke.a();
      $$1.e().forEach($$1x -> $$2.a(po.a((String)$$1x.b()), $$1x.a().a()));
      return a(po.a($$0), $$2.a());
   }

   static ecs a(aix<ecn> $$0, bke<aix<ecn>> $$1) {
      return new ecs($$0, $$1);
   }

   static ect a(bke<List<ecp>> $$0) {
      return new ect($$0);
   }

   Codec<? extends ecp> b();
}
