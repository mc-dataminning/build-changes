import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record enm(alh<enh> c, bql<alh<enh>> d) implements enj {
   static MapCodec<enm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(lz.aV).fieldOf("alias").forGetter(enm::c), bql.b(alh.a(lz.aV)).fieldOf("targets").forGetter(enm::d)).apply($$0, enm::new)
   );

   @Override
   public void a(azs $$0, BiConsumer<alh<enh>, alh<enh>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (alh<enh>)$$1x.b()));
   }

   @Override
   public Stream<alh<enh>> a() {
      return this.d.e().stream().map(bqn.b::b);
   }

   @Override
   public MapCodec<enm> b() {
      return a;
   }
}
