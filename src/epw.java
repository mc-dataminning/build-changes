import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface epw {
   Codec<epw> b = ma.ah.q().dispatch(epw::b, Function.identity());

   void a(bam var1, BiConsumer<aly<epu>, aly<epu>> var2);

   Stream<aly<epu>> a();

   static epv a(String $$0, String $$1) {
      return a(rr.a($$0), rr.a($$1));
   }

   static epv a(aly<epu> $$0, aly<epu> $$1) {
      return new epv($$0, $$1);
   }

   static epz a(String $$0, brr<String> $$1) {
      brr.a<aly<epu>> $$2 = brr.a();
      $$1.e().forEach($$1x -> $$2.a(rr.a((String)$$1x.b()), $$1x.a().a()));
      return a(rr.a($$0), $$2.a());
   }

   static epz a(aly<epu> $$0, brr<aly<epu>> $$1) {
      return new epz($$0, $$1);
   }

   static eqa a(brr<List<epw>> $$0) {
      return new eqa($$0);
   }

   MapCodec<? extends epw> b();
}
