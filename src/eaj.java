import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eaj(ahc<eai> c, ahc<eai> d) implements eak {
   static Codec<eaj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahc.a(ke.aG).fieldOf("alias").forGetter(eaj::c), ahc.a(ke.aG).fieldOf("target").forGetter(eaj::d)).apply($$0, eaj::new)
   );

   @Override
   public void a(aup $$0, BiConsumer<ahc<eai>, ahc<eai>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ahc<eai>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eaj> b() {
      return a;
   }
}
