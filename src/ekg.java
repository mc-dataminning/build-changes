import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ekg(akj<ekf> c, akj<ekf> d) implements ekh {
   static MapCodec<ekg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aT).fieldOf("alias").forGetter(ekg::c), akj.a(lr.aT).fieldOf("target").forGetter(ekg::d)).apply($$0, ekg::new)
   );

   @Override
   public void a(ayo $$0, BiConsumer<akj<ekf>, akj<ekf>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akj<ekf>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ekg> b() {
      return a;
   }
}
