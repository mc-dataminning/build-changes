import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ekb {
   Codec<ekb> b = lq.ah.r().dispatch(ekb::b, Function.identity());

   void a(aym var1, BiConsumer<akj<ejz>, akj<ejz>> var2);

   Stream<akj<ejz>> a();

   static eka a(String $$0, String $$1) {
      return a(qt.a($$0), qt.a($$1));
   }

   static eka a(akj<ejz> $$0, akj<ejz> $$1) {
      return new eka($$0, $$1);
   }

   static eke a(String $$0, bon<String> $$1) {
      bon.a<akj<ejz>> $$2 = bon.a();
      $$1.e().forEach($$1x -> $$2.a(qt.a((String)$$1x.b()), $$1x.a().a()));
      return a(qt.a($$0), $$2.a());
   }

   static eke a(akj<ejz> $$0, bon<akj<ejz>> $$1) {
      return new eke($$0, $$1);
   }

   static ekf a(bon<List<ekb>> $$0) {
      return new ekf($$0);
   }

   MapCodec<? extends ekb> b();
}
