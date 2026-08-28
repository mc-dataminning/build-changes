import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eka(akj<ejz> c, akj<ejz> d) implements ekb {
   static MapCodec<eka> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aT).fieldOf("alias").forGetter(eka::c), akj.a(lr.aT).fieldOf("target").forGetter(eka::d)).apply($$0, eka::new)
   );

   @Override
   public void a(aym $$0, BiConsumer<akj<ejz>, akj<ejz>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akj<ejz>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eka> b() {
      return a;
   }
}
