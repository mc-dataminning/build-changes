import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record elz(ala<ely> c, ala<ely> d) implements ema {
   static MapCodec<elz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lv.aU).fieldOf("alias").forGetter(elz::c), ala.a(lv.aU).fieldOf("target").forGetter(elz::d)).apply($$0, elz::new)
   );

   @Override
   public void a(azk $$0, BiConsumer<ala<ely>, ala<ely>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ala<ely>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<elz> b() {
      return a;
   }
}
