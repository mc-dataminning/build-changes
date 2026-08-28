import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eow(aku<eov> c, aku<eov> d) implements eox {
   static MapCodec<eow> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aX).fieldOf("alias").forGetter(eow::c), aku.a(mc.aX).fieldOf("target").forGetter(eow::d)).apply($$0, eow::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<aku<eov>, aku<eov>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aku<eov>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eow> b() {
      return a;
   }
}
