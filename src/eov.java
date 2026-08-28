import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eov(akt<eou> c, akt<eou> d) implements eow {
   static MapCodec<eov> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aX).fieldOf("alias").forGetter(eov::c), akt.a(mc.aX).fieldOf("target").forGetter(eov::d)).apply($$0, eov::new)
   );

   @Override
   public void a(azg $$0, BiConsumer<akt<eou>, akt<eou>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akt<eou>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eov> b() {
      return a;
   }
}
