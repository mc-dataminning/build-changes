import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface etp {
   Codec<etp> b = mh.ah.q().dispatch(etp::b, Function.identity());

   void a(azz var1, BiConsumer<alj<etn>, alj<etn>> var2);

   Stream<alj<etn>> a();

   static eto a(String $$0, String $$1) {
      return a(qp.a($$0), qp.a($$1));
   }

   static eto a(alj<etn> $$0, alj<etn> $$1) {
      return new eto($$0, $$1);
   }

   static ett a(String $$0, btd<String> $$1) {
      btd.a<alj<etn>> $$2 = btd.b();
      $$1.d().forEach($$1x -> $$2.a(qp.a((String)$$1x.a()), $$1x.b()));
      return a(qp.a($$0), $$2.a());
   }

   static ett a(alj<etn> $$0, btd<alj<etn>> $$1) {
      return new ett($$0, $$1);
   }

   static ets a(btd<List<etp>> $$0) {
      return new ets($$0);
   }

   MapCodec<? extends etp> b();
}
