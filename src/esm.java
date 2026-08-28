import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record esm(alf<esl> c, alf<esl> d) implements esn {
   static MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.bf).fieldOf("alias").forGetter(esm::c), alf.a(mg.bf).fieldOf("target").forGetter(esm::d)).apply($$0, esm::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alf<esl>, alf<esl>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alf<esl>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<esm> b() {
      return a;
   }
}
