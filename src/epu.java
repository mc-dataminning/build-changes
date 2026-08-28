import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epu(akt<ept> c, akt<ept> d) implements epv {
   static MapCodec<epu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aZ).fieldOf("alias").forGetter(epu::c), akt.a(mc.aZ).fieldOf("target").forGetter(epu::d)).apply($$0, epu::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<akt<ept>, akt<ept>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akt<ept>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<epu> b() {
      return a;
   }
}
