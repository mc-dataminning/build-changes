import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ejx {
   Codec<ejx> b = lp.aj.q().dispatch(ejx::b, Function.identity());

   void a(azh var1, BiConsumer<ale<ejv>, ale<ejv>> var2);

   Stream<ale<ejv>> a();

   static ejw a(String $$0, String $$1) {
      return a(rj.a($$0), rj.a($$1));
   }

   static ejw a(ale<ejv> $$0, ale<ejv> $$1) {
      return new ejw($$0, $$1);
   }

   static eka a(String $$0, bpg<String> $$1) {
      bpg.a<ale<ejv>> $$2 = bpg.a();
      $$1.e().forEach($$1x -> $$2.a(rj.a((String)$$1x.b()), $$1x.a().a()));
      return a(rj.a($$0), $$2.a());
   }

   static eka a(ale<ejv> $$0, bpg<ale<ejv>> $$1) {
      return new eka($$0, $$1);
   }

   static ekb a(bpg<List<ejx>> $$0) {
      return new ekb($$0);
   }

   MapCodec<? extends ejx> b();
}
