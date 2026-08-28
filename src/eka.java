import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eka(ale<ejv> c, bpg<ale<ejv>> d) implements ejx {
   static MapCodec<eka> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aM).fieldOf("alias").forGetter(eka::c), bpg.b(ale.a(lq.aM)).fieldOf("targets").forGetter(eka::d)).apply($$0, eka::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<ale<ejv>, ale<ejv>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ale<ejv>)$$1x.b()));
   }

   @Override
   public Stream<ale<ejv>> a() {
      return this.d.e().stream().map(bpi.b::b);
   }

   @Override
   public MapCodec<eka> b() {
      return a;
   }
}
