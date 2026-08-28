import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejy(ale<ejt> c, bpe<ale<ejt>> d) implements ejv {
   static MapCodec<ejy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aM).fieldOf("alias").forGetter(ejy::c), bpe.b(ale.a(lq.aM)).fieldOf("targets").forGetter(ejy::d)).apply($$0, ejy::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<ale<ejt>, ale<ejt>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ale<ejt>)$$1x.b()));
   }

   @Override
   public Stream<ale<ejt>> a() {
      return this.d.e().stream().map(bpg.b::b);
   }

   @Override
   public MapCodec<ejy> b() {
      return a;
   }
}
