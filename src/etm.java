import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record etm(alh<etl> c, alh<etl> d) implements etn {
   static MapCodec<etm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(mh.bf).fieldOf("alias").forGetter(etm::c), alh.a(mh.bf).fieldOf("target").forGetter(etm::d)).apply($$0, etm::new)
   );

   @Override
   public void a(azx $$0, BiConsumer<alh<etl>, alh<etl>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alh<etl>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<etm> b() {
      return a;
   }
}
