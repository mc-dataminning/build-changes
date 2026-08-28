import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epy(aly<ept> c, brq<aly<ept>> d) implements epv {
   static MapCodec<epy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aX).fieldOf("alias").forGetter(epy::c), brq.b(aly.a(mb.aX)).fieldOf("targets").forGetter(epy::d)).apply($$0, epy::new)
   );

   @Override
   public void a(bam $$0, BiConsumer<aly<ept>, aly<ept>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aly<ept>)$$1x.b()));
   }

   @Override
   public Stream<aly<ept>> a() {
      return this.d.e().stream().map(brs.b::b);
   }

   @Override
   public MapCodec<epy> b() {
      return a;
   }
}
