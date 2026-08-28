import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface eow {
   Codec<eow> b = mb.ah.q().dispatch(eow::b, Function.identity());

   void a(azg var1, BiConsumer<akt<eou>, akt<eou>> var2);

   Stream<akt<eou>> a();

   static eov a(String $$0, String $$1) {
      return a(ql.a($$0), ql.a($$1));
   }

   static eov a(akt<eou> $$0, akt<eou> $$1) {
      return new eov($$0, $$1);
   }

   static eoz a(String $$0, bqq<String> $$1) {
      bqq.a<akt<eou>> $$2 = bqq.a();
      $$1.e().forEach($$1x -> $$2.a(ql.a((String)$$1x.b()), $$1x.a().a()));
      return a(ql.a($$0), $$2.a());
   }

   static eoz a(akt<eou> $$0, bqq<akt<eou>> $$1) {
      return new eoz($$0, $$1);
   }

   static epa a(bqq<List<eow>> $$0) {
      return new epa($$0);
   }

   MapCodec<? extends eow> b();
}
