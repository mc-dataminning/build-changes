import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejw(ald<ejr> c, bpc<ald<ejr>> d) implements ejt {
   static MapCodec<ejw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lq.aM).fieldOf("alias").forGetter(ejw::c), bpc.b(ald.a(lq.aM)).fieldOf("targets").forGetter(ejw::d)).apply($$0, ejw::new)
   );

   @Override
   public void a(azf $$0, BiConsumer<ald<ejr>, ald<ejr>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ald<ejr>)$$1x.b()));
   }

   @Override
   public Stream<ald<ejr>> a() {
      return this.d.e().stream().map(bpe.b::b);
   }

   @Override
   public MapCodec<ejw> b() {
      return a;
   }
}
