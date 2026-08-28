import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eoz(akt<eou> c, bqq<akt<eou>> d) implements eow {
   static MapCodec<eoz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aX).fieldOf("alias").forGetter(eoz::c), bqq.b(akt.a(mc.aX)).fieldOf("targets").forGetter(eoz::d)).apply($$0, eoz::new)
   );

   @Override
   public void a(azg $$0, BiConsumer<akt<eou>, akt<eou>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akt<eou>)$$1x.b()));
   }

   @Override
   public Stream<akt<eou>> a() {
      return this.d.e().stream().map(bqs.b::b);
   }

   @Override
   public MapCodec<eoz> b() {
      return a;
   }
}
