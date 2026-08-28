import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface enn {
   Codec<enn> b = lz.ah.q().dispatch(enn::b, Function.identity());

   void a(azv var1, BiConsumer<alk<enl>, alk<enl>> var2);

   Stream<alk<enl>> a();

   static enm a(String $$0, String $$1) {
      return a(ri.a($$0), ri.a($$1));
   }

   static enm a(alk<enl> $$0, alk<enl> $$1) {
      return new enm($$0, $$1);
   }

   static enq a(String $$0, bqp<String> $$1) {
      bqp.a<alk<enl>> $$2 = bqp.a();
      $$1.e().forEach($$1x -> $$2.a(ri.a((String)$$1x.b()), $$1x.a().a()));
      return a(ri.a($$0), $$2.a());
   }

   static enq a(alk<enl> $$0, bqp<alk<enl>> $$1) {
      return new enq($$0, $$1);
   }

   static enr a(bqp<List<enn>> $$0) {
      return new enr($$0);
   }

   MapCodec<? extends enn> b();
}
