import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record etr(alh<etl> c, btb<alh<etl>> d) implements etn {
   static MapCodec<etr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(mh.bf).fieldOf("alias").forGetter(etr::c), btb.b(alh.a(mh.bf)).fieldOf("targets").forGetter(etr::d)).apply($$0, etr::new)
   );

   @Override
   public void a(azx $$0, BiConsumer<alh<etl>, alh<etl>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<alh<etl>> a() {
      return this.d.d().stream().map(bta::a);
   }

   @Override
   public MapCodec<etr> b() {
      return a;
   }
}
