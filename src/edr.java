import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface edr {
   Codec<edr> b = kh.aj.q().dispatch(edr::b, Function.identity());

   void a(awt var1, BiConsumer<ajb<edp>, ajb<edp>> var2);

   Stream<ajb<edp>> a();

   static edq a(String $$0, String $$1) {
      return a(pq.a($$0), pq.a($$1));
   }

   static edq a(ajb<edp> $$0, ajb<edp> $$1) {
      return new edq($$0, $$1);
   }

   static edu a(String $$0, bkv<String> $$1) {
      bkv.a<ajb<edp>> $$2 = bkv.a();
      $$1.e().forEach($$1x -> $$2.a(pq.a((String)$$1x.b()), $$1x.a().a()));
      return a(pq.a($$0), $$2.a());
   }

   static edu a(ajb<edp> $$0, bkv<ajb<edp>> $$1) {
      return new edu($$0, $$1);
   }

   static edv a(bkv<List<edr>> $$0) {
      return new edv($$0);
   }

   Codec<? extends edr> b();
}
