import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epz(aly<epu> c, brr<aly<epu>> d) implements epw {
   static MapCodec<epz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aX).fieldOf("alias").forGetter(epz::c), brr.b(aly.a(mb.aX)).fieldOf("targets").forGetter(epz::d)).apply($$0, epz::new)
   );

   @Override
   public void a(bam $$0, BiConsumer<aly<epu>, aly<epu>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aly<epu>)$$1x.b()));
   }

   @Override
   public Stream<aly<epu>> a() {
      return this.d.e().stream().map(brt.b::b);
   }

   @Override
   public MapCodec<epz> b() {
      return a;
   }
}
