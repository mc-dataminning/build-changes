import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ejq {
   Codec<ejq> b = lp.aj.q().dispatch(ejq::b, Function.identity());

   void a(azc var1, BiConsumer<ala<ejo>, ala<ejo>> var2);

   Stream<ala<ejo>> a();

   static ejp a(String $$0, String $$1) {
      return a(rj.a($$0), rj.a($$1));
   }

   static ejp a(ala<ejo> $$0, ala<ejo> $$1) {
      return new ejp($$0, $$1);
   }

   static ejt a(String $$0, boz<String> $$1) {
      boz.a<ala<ejo>> $$2 = boz.a();
      $$1.e().forEach($$1x -> $$2.a(rj.a((String)$$1x.b()), $$1x.a().a()));
      return a(rj.a($$0), $$2.a());
   }

   static ejt a(ala<ejo> $$0, boz<ala<ejo>> $$1) {
      return new ejt($$0, $$1);
   }

   static eju a(boz<List<ejq>> $$0) {
      return new eju($$0);
   }

   MapCodec<? extends ejq> b();
}
