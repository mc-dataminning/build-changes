import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eru {
   Codec<eru> b = mf.ah.q().dispatch(eru::b, Function.identity());

   void a(azt var1, BiConsumer<ald<ers>, ald<ers>> var2);

   Stream<ald<ers>> a();

   static ert a(String $$0, String $$1) {
      return a(qo.a($$0), qo.a($$1));
   }

   static ert a(ald<ers> $$0, ald<ers> $$1) {
      return new ert($$0, $$1);
   }

   static erx a(String $$0, bsj<String> $$1) {
      bsj.a<ald<ers>> $$2 = bsj.b();
      $$1.d().forEach($$1x -> $$2.a(qo.a((String)$$1x.a()), $$1x.b()));
      return a(qo.a($$0), $$2.a());
   }

   static erx a(ald<ers> $$0, bsj<ald<ers>> $$1) {
      return new erx($$0, $$1);
   }

   static ery a(bsj<List<eru>> $$0) {
      return new ery($$0);
   }

   MapCodec<? extends eru> b();
}
