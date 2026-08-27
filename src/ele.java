import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ele {
   Codec<ele> b = lh.aj.q().dispatch(ele::b, Function.identity());

   void a(ayt var1, BiConsumer<aks<elc>, aks<elc>> var2);

   Stream<aks<elc>> a();

   static eld a(String $$0, String $$1) {
      return a(ra.a($$0), ra.a($$1));
   }

   static eld a(aks<elc> $$0, aks<elc> $$1) {
      return new eld($$0, $$1);
   }

   static elh a(String $$0, bok<String> $$1) {
      bok.a<aks<elc>> $$2 = bok.a();
      $$1.e().forEach($$1x -> $$2.a(ra.a((String)$$1x.b()), $$1x.a().a()));
      return a(ra.a($$0), $$2.a());
   }

   static elh a(aks<elc> $$0, bok<aks<elc>> $$1) {
      return new elh($$0, $$1);
   }

   static eli a(bok<List<ele>> $$0) {
      return new eli($$0);
   }

   Codec<? extends ele> b();
}
