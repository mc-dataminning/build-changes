import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record esy(alf<esx> c, alf<esx> d) implements esz {
   static MapCodec<esy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mh.bf).fieldOf("alias").forGetter(esy::c), alf.a(mh.bf).fieldOf("target").forGetter(esy::d)).apply($$0, esy::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alf<esx>, alf<esx>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alf<esx>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<esy> b() {
      return a;
   }
}
