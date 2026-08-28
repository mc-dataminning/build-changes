import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface epo {
   Codec<epo> b = ma.ah.q().dispatch(epo::b, Function.identity());

   void a(bam var1, BiConsumer<aly<epm>, aly<epm>> var2);

   Stream<aly<epm>> a();

   static epn a(String $$0, String $$1) {
      return a(rr.a($$0), rr.a($$1));
   }

   static epn a(aly<epm> $$0, aly<epm> $$1) {
      return new epn($$0, $$1);
   }

   static epr a(String $$0, brm<String> $$1) {
      brm.a<aly<epm>> $$2 = brm.a();
      $$1.e().forEach($$1x -> $$2.a(rr.a((String)$$1x.b()), $$1x.a().a()));
      return a(rr.a($$0), $$2.a());
   }

   static epr a(aly<epm> $$0, brm<aly<epm>> $$1) {
      return new epr($$0, $$1);
   }

   static eps a(brm<List<epo>> $$0) {
      return new eps($$0);
   }

   MapCodec<? extends epo> b();
}
