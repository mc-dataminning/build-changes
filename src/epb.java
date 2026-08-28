import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epb(aku<eow> c, bqs<aku<eow>> d) implements eoy {
   static MapCodec<epb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aX).fieldOf("alias").forGetter(epb::c), bqs.b(aku.a(mc.aX)).fieldOf("targets").forGetter(epb::d)).apply($$0, epb::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<aku<eow>, aku<eow>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aku<eow>)$$1x.b()));
   }

   @Override
   public Stream<aku<eow>> a() {
      return this.d.e().stream().map(bqu.b::b);
   }

   @Override
   public MapCodec<epb> b() {
      return a;
   }
}
