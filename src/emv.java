import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record emv(ald<emq> c, bqc<ald<emq>> d) implements ems {
   static MapCodec<emv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lw.aW).fieldOf("alias").forGetter(emv::c), bqc.b(ald.a(lw.aW)).fieldOf("targets").forGetter(emv::d)).apply($$0, emv::new)
   );

   @Override
   public void a(azn $$0, BiConsumer<ald<emq>, ald<emq>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ald<emq>)$$1x.b()));
   }

   @Override
   public Stream<ald<emq>> a() {
      return this.d.e().stream().map(bqe.b::b);
   }

   @Override
   public MapCodec<emv> b() {
      return a;
   }
}
