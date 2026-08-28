import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface esf {
   Codec<esf> b = mf.ah.q().dispatch(esf::b, Function.identity());

   void a(azv var1, BiConsumer<alf<esd>, alf<esd>> var2);

   Stream<alf<esd>> a();

   static ese a(String $$0, String $$1) {
      return a(qo.a($$0), qo.a($$1));
   }

   static ese a(alf<esd> $$0, alf<esd> $$1) {
      return new ese($$0, $$1);
   }

   static esi a(String $$0, bsm<String> $$1) {
      bsm.a<alf<esd>> $$2 = bsm.b();
      $$1.d().forEach($$1x -> $$2.a(qo.a((String)$$1x.a()), $$1x.b()));
      return a(qo.a($$0), $$2.a());
   }

   static esi a(alf<esd> $$0, bsm<alf<esd>> $$1) {
      return new esi($$0, $$1);
   }

   static esj a(bsm<List<esf>> $$0) {
      return new esj($$0);
   }

   MapCodec<? extends esf> b();
}
