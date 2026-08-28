import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epu(aly<ept> c, aly<ept> d) implements epv {
   static MapCodec<epu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aX).fieldOf("alias").forGetter(epu::c), aly.a(mb.aX).fieldOf("target").forGetter(epu::d)).apply($$0, epu::new)
   );

   @Override
   public void a(bam $$0, BiConsumer<aly<ept>, aly<ept>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aly<ept>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<epu> b() {
      return a;
   }
}
