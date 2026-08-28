import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eni(alh<enh> c, alh<enh> d) implements enj {
   static MapCodec<eni> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(lz.aV).fieldOf("alias").forGetter(eni::c), alh.a(lz.aV).fieldOf("target").forGetter(eni::d)).apply($$0, eni::new)
   );

   @Override
   public void a(azs $$0, BiConsumer<alh<enh>, alh<enh>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alh<enh>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eni> b() {
      return a;
   }
}
