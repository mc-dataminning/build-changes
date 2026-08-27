import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eiw {
   Codec<eiw> b = le.aj.q().dispatch(eiw::b, Function.identity());

   void a(aym var1, BiConsumer<akm<eiu>, akm<eiu>> var2);

   Stream<akm<eiu>> a();

   static eiv a(String $$0, String $$1) {
      return a(qv.a($$0), qv.a($$1));
   }

   static eiv a(akm<eiu> $$0, akm<eiu> $$1) {
      return new eiv($$0, $$1);
   }

   static eiz a(String $$0, bog<String> $$1) {
      bog.a<akm<eiu>> $$2 = bog.a();
      $$1.e().forEach($$1x -> $$2.a(qv.a((String)$$1x.b()), $$1x.a().a()));
      return a(qv.a($$0), $$2.a());
   }

   static eiz a(akm<eiu> $$0, bog<akm<eiu>> $$1) {
      return new eiz($$0, $$1);
   }

   static eja a(bog<List<eiw>> $$0) {
      return new eja($$0);
   }

   MapCodec<? extends eiw> b();
}
