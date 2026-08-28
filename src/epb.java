import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epb(akt<eow> c, bqr<akt<eow>> d) implements eoy {
   static MapCodec<epb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aX).fieldOf("alias").forGetter(epb::c), bqr.b(akt.a(mc.aX)).fieldOf("targets").forGetter(epb::d)).apply($$0, epb::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<akt<eow>, akt<eow>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akt<eow>)$$1x.b()));
   }

   @Override
   public Stream<akt<eow>> a() {
      return this.d.e().stream().map(bqt.b::b);
   }

   @Override
   public MapCodec<epb> b() {
      return a;
   }
}
