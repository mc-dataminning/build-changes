import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record enc(alg<enb> c, alg<enb> d) implements end {
   static MapCodec<enc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a(ly.aV).fieldOf("alias").forGetter(enc::c), alg.a(ly.aV).fieldOf("target").forGetter(enc::d)).apply($$0, enc::new)
   );

   @Override
   public void a(azr $$0, BiConsumer<alg<enb>, alg<enb>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alg<enb>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<enc> b() {
      return a;
   }
}
