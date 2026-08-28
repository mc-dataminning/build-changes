import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface esn {
   Codec<esn> b = mf.ah.q().dispatch(esn::b, Function.identity());

   void a(azv var1, BiConsumer<alf<esl>, alf<esl>> var2);

   Stream<alf<esl>> a();

   static esm a(String $$0, String $$1) {
      return a(qo.a($$0), qo.a($$1));
   }

   static esm a(alf<esl> $$0, alf<esl> $$1) {
      return new esm($$0, $$1);
   }

   static esq a(String $$0, bso<String> $$1) {
      bso.a<alf<esl>> $$2 = bso.b();
      $$1.d().forEach($$1x -> $$2.a(qo.a((String)$$1x.a()), $$1x.b()));
      return a(qo.a($$0), $$2.a());
   }

   static esq a(alf<esl> $$0, bso<alf<esl>> $$1) {
      return new esq($$0, $$1);
   }

   static esr a(bso<List<esn>> $$0) {
      return new esr($$0);
   }

   MapCodec<? extends esn> b();
}
