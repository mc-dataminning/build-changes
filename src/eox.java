import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eox(akt<eow> c, akt<eow> d) implements eoy {
   static MapCodec<eox> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aX).fieldOf("alias").forGetter(eox::c), akt.a(mc.aX).fieldOf("target").forGetter(eox::d)).apply($$0, eox::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<akt<eow>, akt<eow>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akt<eow>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eox> b() {
      return a;
   }
}
