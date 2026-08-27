import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eeo(ajg<een> c, ajg<een> d) implements eep {
   static Codec<eeo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajg.a(kj.aH).fieldOf("alias").forGetter(eeo::c), ajg.a(kj.aH).fieldOf("target").forGetter(eeo::d)).apply($$0, eeo::new)
   );

   @Override
   public void a(axd $$0, BiConsumer<ajg<een>, ajg<een>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ajg<een>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eeo> b() {
      return a;
   }
}
