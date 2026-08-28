import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eng(alg<enb> c, bqg<alg<enb>> d) implements end {
   static MapCodec<eng> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a(ly.aV).fieldOf("alias").forGetter(eng::c), bqg.b(alg.a(ly.aV)).fieldOf("targets").forGetter(eng::d)).apply($$0, eng::new)
   );

   @Override
   public void a(azr $$0, BiConsumer<alg<enb>, alg<enb>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (alg<enb>)$$1x.b()));
   }

   @Override
   public Stream<alg<enb>> a() {
      return this.d.e().stream().map(bqi.b::b);
   }

   @Override
   public MapCodec<eng> b() {
      return a;
   }
}
