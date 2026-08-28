import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface etn {
   Codec<etn> b = mg.ah.q().dispatch(etn::b, Function.identity());

   void a(azx var1, BiConsumer<alh<etl>, alh<etl>> var2);

   Stream<alh<etl>> a();

   static etm a(String $$0, String $$1) {
      return a(qo.a($$0), qo.a($$1));
   }

   static etm a(alh<etl> $$0, alh<etl> $$1) {
      return new etm($$0, $$1);
   }

   static etr a(String $$0, btb<String> $$1) {
      btb.a<alh<etl>> $$2 = btb.b();
      $$1.d().forEach($$1x -> $$2.a(qo.a((String)$$1x.a()), $$1x.b()));
      return a(qo.a($$0), $$2.a());
   }

   static etr a(alh<etl> $$0, btb<alh<etl>> $$1) {
      return new etr($$0, $$1);
   }

   static etq a(btb<List<etn>> $$0) {
      return new etq($$0);
   }

   MapCodec<? extends etn> b();
}
