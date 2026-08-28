import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eki(akj<ekh> c, akj<ekh> d) implements ekj {
   static MapCodec<eki> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aT).fieldOf("alias").forGetter(eki::c), akj.a(lr.aT).fieldOf("target").forGetter(eki::d)).apply($$0, eki::new)
   );

   @Override
   public void a(ayo $$0, BiConsumer<akj<ekh>, akj<ekh>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akj<ekh>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eki> b() {
      return a;
   }
}
