import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record egr(ajs<egq> c, ajs<egq> d) implements egs {
   static Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajs.a(ks.aI).fieldOf("alias").forGetter(egr::c), ajs.a(ks.aI).fieldOf("target").forGetter(egr::d)).apply($$0, egr::new)
   );

   @Override
   public void a(axr $$0, BiConsumer<ajs<egq>, ajs<egq>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ajs<egq>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<egr> b() {
      return a;
   }
}
