import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eay(ahg<eax> c, ahg<eax> d) implements eaz {
   static Codec<eay> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahg.a(ke.aG).fieldOf("alias").forGetter(eay::c), ahg.a(ke.aG).fieldOf("target").forGetter(eay::d)).apply($$0, eay::new)
   );

   @Override
   public void a(auw $$0, BiConsumer<ahg<eax>, ahg<eax>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ahg<eax>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eay> b() {
      return a;
   }
}
