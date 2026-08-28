import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ekj {
   Codec<ekj> b = lq.ah.r().dispatch(ekj::b, Function.identity());

   void a(ayo var1, BiConsumer<akj<ekh>, akj<ekh>> var2);

   Stream<akj<ekh>> a();

   static eki a(String $$0, String $$1) {
      return a(qt.a($$0), qt.a($$1));
   }

   static eki a(akj<ekh> $$0, akj<ekh> $$1) {
      return new eki($$0, $$1);
   }

   static ekm a(String $$0, bor<String> $$1) {
      bor.a<akj<ekh>> $$2 = bor.a();
      $$1.e().forEach($$1x -> $$2.a(qt.a((String)$$1x.b()), $$1x.a().a()));
      return a(qt.a($$0), $$2.a());
   }

   static ekm a(akj<ekh> $$0, bor<akj<ekh>> $$1) {
      return new ekm($$0, $$1);
   }

   static ekn a(bor<List<ekj>> $$0) {
      return new ekn($$0);
   }

   MapCodec<? extends ekj> b();
}
