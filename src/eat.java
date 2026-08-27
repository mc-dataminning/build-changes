import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eat(ahf<eao> c, bik<ahf<eao>> d) implements eaq {
   static Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahf.a(ke.aG).fieldOf("alias").forGetter(eat::c), bik.b(ahf.a(ke.aG)).fieldOf("targets").forGetter(eat::d)).apply($$0, eat::new)
   );

   @Override
   public void a(auu $$0, BiConsumer<ahf<eao>, ahf<eao>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ahf<eao>)$$1x.b()));
   }

   @Override
   public Stream<ahf<eao>> a() {
      return this.d.e().stream().map(bim.b::b);
   }

   @Override
   public Codec<eat> b() {
      return a;
   }
}
