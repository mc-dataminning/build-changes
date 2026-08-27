import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface egs {
   Codec<egs> b = kr.aj.q().dispatch(egs::b, Function.identity());

   void a(axr var1, BiConsumer<ajs<egq>, ajs<egq>> var2);

   Stream<ajs<egq>> a();

   static egr a(String $$0, String $$1) {
      return a(qe.a($$0), qe.a($$1));
   }

   static egr a(ajs<egq> $$0, ajs<egq> $$1) {
      return new egr($$0, $$1);
   }

   static egv a(String $$0, bmk<String> $$1) {
      bmk.a<ajs<egq>> $$2 = bmk.a();
      $$1.e().forEach($$1x -> $$2.a(qe.a((String)$$1x.b()), $$1x.a().a()));
      return a(qe.a($$0), $$2.a());
   }

   static egv a(ajs<egq> $$0, bmk<ajs<egq>> $$1) {
      return new egv($$0, $$1);
   }

   static egw a(bmk<List<egs>> $$0) {
      return new egw($$0);
   }

   Codec<? extends egs> b();
}
