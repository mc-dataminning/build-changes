import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eia {
   Codec<eia> b = ld.aj.q().dispatch(eia::b, Function.identity());

   void a(ayg var1, BiConsumer<akg<ehy>, akg<ehy>> var2);

   Stream<akg<ehy>> a();

   static ehz a(String $$0, String $$1) {
      return a(qs.a($$0), qs.a($$1));
   }

   static ehz a(akg<ehy> $$0, akg<ehy> $$1) {
      return new ehz($$0, $$1);
   }

   static eid a(String $$0, bnw<String> $$1) {
      bnw.a<akg<ehy>> $$2 = bnw.a();
      $$1.e().forEach($$1x -> $$2.a(qs.a((String)$$1x.b()), $$1x.a().a()));
      return a(qs.a($$0), $$2.a());
   }

   static eid a(akg<ehy> $$0, bnw<akg<ehy>> $$1) {
      return new eid($$0, $$1);
   }

   static eie a(bnw<List<eia>> $$0) {
      return new eie($$0);
   }

   Codec<? extends eia> b();
}
