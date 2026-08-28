import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ejv {
   Codec<ejv> b = lp.aj.q().dispatch(ejv::b, Function.identity());

   void a(azh var1, BiConsumer<ale<ejt>, ale<ejt>> var2);

   Stream<ale<ejt>> a();

   static eju a(String $$0, String $$1) {
      return a(rj.a($$0), rj.a($$1));
   }

   static eju a(ale<ejt> $$0, ale<ejt> $$1) {
      return new eju($$0, $$1);
   }

   static ejy a(String $$0, bpe<String> $$1) {
      bpe.a<ale<ejt>> $$2 = bpe.a();
      $$1.e().forEach($$1x -> $$2.a(rj.a((String)$$1x.b()), $$1x.a().a()));
      return a(rj.a($$0), $$2.a());
   }

   static ejy a(ale<ejt> $$0, bpe<ale<ejt>> $$1) {
      return new ejy($$0, $$1);
   }

   static ejz a(bpe<List<ejv>> $$0) {
      return new ejz($$0);
   }

   MapCodec<? extends ejv> b();
}
