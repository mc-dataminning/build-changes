import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ear {
   Codec<ear> b = kd.aj.q().dispatch(ear::b, Function.identity());

   void a(auv var1, BiConsumer<ahf<eap>, ahf<eap>> var2);

   Stream<ahf<eap>> a();

   static eaq a(String $$0, String $$1) {
      return a(pl.a($$0), pl.a($$1));
   }

   static eaq a(ahf<eap> $$0, ahf<eap> $$1) {
      return new eaq($$0, $$1);
   }

   static eau a(String $$0, bil<String> $$1) {
      bil.a<ahf<eap>> $$2 = bil.a();
      $$1.e().forEach($$1x -> $$2.a(pl.a((String)$$1x.b()), $$1x.a().a()));
      return a(pl.a($$0), $$2.a());
   }

   static eau a(ahf<eap> $$0, bil<ahf<eap>> $$1) {
      return new eau($$0, $$1);
   }

   static eav a(bil<List<ear>> $$0) {
      return new eav($$0);
   }

   Codec<? extends ear> b();
}
