import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ejw {
   Codec<ejw> b = lp.aj.q().dispatch(ejw::b, Function.identity());

   void a(azh var1, BiConsumer<ale<eju>, ale<eju>> var2);

   Stream<ale<eju>> a();

   static ejv a(String $$0, String $$1) {
      return a(rj.a($$0), rj.a($$1));
   }

   static ejv a(ale<eju> $$0, ale<eju> $$1) {
      return new ejv($$0, $$1);
   }

   static ejz a(String $$0, bpf<String> $$1) {
      bpf.a<ale<eju>> $$2 = bpf.a();
      $$1.e().forEach($$1x -> $$2.a(rj.a((String)$$1x.b()), $$1x.a().a()));
      return a(rj.a($$0), $$2.a());
   }

   static ejz a(ale<eju> $$0, bpf<ale<eju>> $$1) {
      return new ejz($$0, $$1);
   }

   static eka a(bpf<List<ejw>> $$0) {
      return new eka($$0);
   }

   MapCodec<? extends ejw> b();
}
