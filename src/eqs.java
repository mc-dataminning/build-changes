import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eqs {
   Codec<eqs> b = md.ah.q().dispatch(eqs::b, Function.identity());

   void a(azs var1, BiConsumer<alc<eqq>, alc<eqq>> var2);

   Stream<alc<eqq>> a();

   static eqr a(String $$0, String $$1) {
      return a(qn.a($$0), qn.a($$1));
   }

   static eqr a(alc<eqq> $$0, alc<eqq> $$1) {
      return new eqr($$0, $$1);
   }

   static eqv a(String $$0, bsb<String> $$1) {
      bsb.a<alc<eqq>> $$2 = bsb.b();
      $$1.d().forEach($$1x -> $$2.a(qn.a((String)$$1x.a()), $$1x.b()));
      return a(qn.a($$0), $$2.a());
   }

   static eqv a(alc<eqq> $$0, bsb<alc<eqq>> $$1) {
      return new eqv($$0, $$1);
   }

   static eqw a(bsb<List<eqs>> $$0) {
      return new eqw($$0);
   }

   MapCodec<? extends eqs> b();
}
