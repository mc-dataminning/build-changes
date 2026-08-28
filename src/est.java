import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record est(alf<ess> c, alf<ess> d) implements esu {
   static MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mh.bf).fieldOf("alias").forGetter(est::c), alf.a(mh.bf).fieldOf("target").forGetter(est::d)).apply($$0, est::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alf<ess>, alf<ess>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alf<ess>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<est> b() {
      return a;
   }
}
