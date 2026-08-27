import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ehr {
   Codec<ehr> b = lc.aj.q().dispatch(ehr::b, Function.identity());

   void a(ayd var1, BiConsumer<ake<ehp>, ake<ehp>> var2);

   Stream<ake<ehp>> a();

   static ehq a(String $$0, String $$1) {
      return a(qq.a($$0), qq.a($$1));
   }

   static ehq a(ake<ehp> $$0, ake<ehp> $$1) {
      return new ehq($$0, $$1);
   }

   static ehu a(String $$0, bna<String> $$1) {
      bna.a<ake<ehp>> $$2 = bna.a();
      $$1.e().forEach($$1x -> $$2.a(qq.a((String)$$1x.b()), $$1x.a().a()));
      return a(qq.a($$0), $$2.a());
   }

   static ehu a(ake<ehp> $$0, bna<ake<ehp>> $$1) {
      return new ehu($$0, $$1);
   }

   static ehv a(bna<List<ehr>> $$0) {
      return new ehv($$0);
   }

   Codec<? extends ehr> b();
}
