import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface epv {
   Codec<epv> b = mb.ah.q().dispatch(epv::b, Function.identity());

   void a(azh var1, BiConsumer<akt<ept>, akt<ept>> var2);

   Stream<akt<ept>> a();

   static epu a(String $$0, String $$1) {
      return a(ql.a($$0), ql.a($$1));
   }

   static epu a(akt<ept> $$0, akt<ept> $$1) {
      return new epu($$0, $$1);
   }

   static epy a(String $$0, brj<String> $$1) {
      brj.a<akt<ept>> $$2 = brj.b();
      $$1.d().forEach($$1x -> $$2.a(ql.a((String)$$1x.a()), $$1x.b()));
      return a(ql.a($$0), $$2.a());
   }

   static epy a(akt<ept> $$0, brj<akt<ept>> $$1) {
      return new epy($$0, $$1);
   }

   static epz a(brj<List<epv>> $$0) {
      return new epz($$0);
   }

   MapCodec<? extends epv> b();
}
