import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eoy(aku<eox> c, aku<eox> d) implements eoz {
   static MapCodec<eoy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aX).fieldOf("alias").forGetter(eoy::c), aku.a(mc.aX).fieldOf("target").forGetter(eoy::d)).apply($$0, eoy::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<aku<eox>, aku<eox>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aku<eox>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eoy> b() {
      return a;
   }
}
