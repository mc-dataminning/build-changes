import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ekh {
   Codec<ekh> b = lq.ah.r().dispatch(ekh::b, Function.identity());

   void a(ayo var1, BiConsumer<akj<ekf>, akj<ekf>> var2);

   Stream<akj<ekf>> a();

   static ekg a(String $$0, String $$1) {
      return a(qt.a($$0), qt.a($$1));
   }

   static ekg a(akj<ekf> $$0, akj<ekf> $$1) {
      return new ekg($$0, $$1);
   }

   static ekk a(String $$0, boq<String> $$1) {
      boq.a<akj<ekf>> $$2 = boq.a();
      $$1.e().forEach($$1x -> $$2.a(qt.a((String)$$1x.b()), $$1x.a().a()));
      return a(qt.a($$0), $$2.a());
   }

   static ekk a(akj<ekf> $$0, boq<akj<ekf>> $$1) {
      return new ekk($$0, $$1);
   }

   static ekl a(boq<List<ekh>> $$0) {
      return new ekl($$0);
   }

   MapCodec<? extends ekh> b();
}
