import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epy(akt<ept> c, brj<akt<ept>> d) implements epv {
   static MapCodec<epy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aZ).fieldOf("alias").forGetter(epy::c), brj.b(akt.a(mc.aZ)).fieldOf("targets").forGetter(epy::d)).apply($$0, epy::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<akt<ept>, akt<ept>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<akt<ept>> a() {
      return this.d.d().stream().map(bri::a);
   }

   @Override
   public MapCodec<epy> b() {
      return a;
   }
}
