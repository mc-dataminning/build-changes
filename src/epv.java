import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epv(aly<epu> c, aly<epu> d) implements epw {
   static MapCodec<epv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aX).fieldOf("alias").forGetter(epv::c), aly.a(mb.aX).fieldOf("target").forGetter(epv::d)).apply($$0, epv::new)
   );

   @Override
   public void a(bam $$0, BiConsumer<aly<epu>, aly<epu>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aly<epu>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<epv> b() {
      return a;
   }
}
