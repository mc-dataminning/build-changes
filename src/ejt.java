import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ejt {
   Codec<ejt> b = lp.aj.q().dispatch(ejt::b, Function.identity());

   void a(azf var1, BiConsumer<ald<ejr>, ald<ejr>> var2);

   Stream<ald<ejr>> a();

   static ejs a(String $$0, String $$1) {
      return a(rj.a($$0), rj.a($$1));
   }

   static ejs a(ald<ejr> $$0, ald<ejr> $$1) {
      return new ejs($$0, $$1);
   }

   static ejw a(String $$0, bpc<String> $$1) {
      bpc.a<ald<ejr>> $$2 = bpc.a();
      $$1.e().forEach($$1x -> $$2.a(rj.a((String)$$1x.b()), $$1x.a().a()));
      return a(rj.a($$0), $$2.a());
   }

   static ejw a(ald<ejr> $$0, bpc<ald<ejr>> $$1) {
      return new ejw($$0, $$1);
   }

   static ejx a(bpc<List<ejt>> $$0) {
      return new ejx($$0);
   }

   MapCodec<? extends ejt> b();
}
