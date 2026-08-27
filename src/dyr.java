import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dyr(agh<dyq> c, agh<dyq> d) implements dys {
   static Codec<dyr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agh.a(jz.aE).fieldOf("alias").forGetter(dyr::c), agh.a(jz.aE).fieldOf("target").forGetter(dyr::d)).apply($$0, dyr::new)
   );

   @Override
   public void a(ats $$0, BiConsumer<agh<dyq>, agh<dyq>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<agh<dyq>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<dyr> b() {
      return a;
   }
}
