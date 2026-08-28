import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface enj {
   Codec<enj> b = ly.ah.q().dispatch(enj::b, Function.identity());

   void a(azs var1, BiConsumer<alh<enh>, alh<enh>> var2);

   Stream<alh<enh>> a();

   static eni a(String $$0, String $$1) {
      return a(rf.a($$0), rf.a($$1));
   }

   static eni a(alh<enh> $$0, alh<enh> $$1) {
      return new eni($$0, $$1);
   }

   static enm a(String $$0, bql<String> $$1) {
      bql.a<alh<enh>> $$2 = bql.a();
      $$1.e().forEach($$1x -> $$2.a(rf.a((String)$$1x.b()), $$1x.a().a()));
      return a(rf.a($$0), $$2.a());
   }

   static enm a(alh<enh> $$0, bql<alh<enh>> $$1) {
      return new enm($$0, $$1);
   }

   static enn a(bql<List<enj>> $$0) {
      return new enn($$0);
   }

   MapCodec<? extends enj> b();
}
