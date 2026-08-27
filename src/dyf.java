import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dyf(agf<dye> c, agf<dye> d) implements dyg {
   static Codec<dyf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agf.a(jz.aE).fieldOf("alias").forGetter(dyf::c), agf.a(jz.aE).fieldOf("target").forGetter(dyf::d)).apply($$0, dyf::new)
   );

   @Override
   public void a(ato $$0, BiConsumer<agf<dye>, agf<dye>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<agf<dye>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<dyf> b() {
      return a;
   }
}
