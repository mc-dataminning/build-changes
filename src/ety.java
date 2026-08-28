import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record ety(alq<etx> c, alq<etx> d) implements etz {
   static MapCodec<ety> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alq.a(mi.bf).fieldOf("alias").forGetter(ety::c), alq.a(mi.bf).fieldOf("target").forGetter(ety::d)).apply($$0, ety::new)
   );

   @Override
   public void a(bai $$0, BiConsumer<alq<etx>, alq<etx>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alq<etx>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ety> b() {
      return a;
   }
}
