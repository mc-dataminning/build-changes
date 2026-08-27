import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eem(ajg<eel> c, ajg<eel> d) implements een {
   static Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajg.a(kj.aH).fieldOf("alias").forGetter(eem::c), ajg.a(kj.aH).fieldOf("target").forGetter(eem::d)).apply($$0, eem::new)
   );

   @Override
   public void a(axd $$0, BiConsumer<ajg<eel>, ajg<eel>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ajg<eel>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eem> b() {
      return a;
   }
}
