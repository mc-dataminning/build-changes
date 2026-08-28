import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record enq(alk<enl> c, bqp<alk<enl>> d) implements enn {
   static MapCodec<enq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a(ma.aV).fieldOf("alias").forGetter(enq::c), bqp.b(alk.a(ma.aV)).fieldOf("targets").forGetter(enq::d)).apply($$0, enq::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alk<enl>, alk<enl>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (alk<enl>)$$1x.b()));
   }

   @Override
   public Stream<alk<enl>> a() {
      return this.d.e().stream().map(bqr.b::b);
   }

   @Override
   public MapCodec<enq> b() {
      return a;
   }
}
