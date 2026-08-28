import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface etz {
   Codec<etz> b = mh.ah.q().dispatch(etz::b, Function.identity());

   void a(bai var1, BiConsumer<alq<etx>, alq<etx>> var2);

   Stream<alq<etx>> a();

   static ety a(String $$0, String $$1) {
      return a(qp.a($$0), qp.a($$1));
   }

   static ety a(alq<etx> $$0, alq<etx> $$1) {
      return new ety($$0, $$1);
   }

   static eud a(String $$0, btm<String> $$1) {
      btm.a<alq<etx>> $$2 = btm.b();
      $$1.d().forEach($$1x -> $$2.a(qp.a((String)$$1x.a()), $$1x.b()));
      return a(qp.a($$0), $$2.a());
   }

   static eud a(alq<etx> $$0, btm<alq<etx>> $$1) {
      return new eud($$0, $$1);
   }

   static euc a(btm<List<etz>> $$0) {
      return new euc($$0);
   }

   MapCodec<? extends etz> b();
}
