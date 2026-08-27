import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ean(ahc<eai> c, bif<ahc<eai>> d) implements eak {
   static Codec<ean> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahc.a(ke.aG).fieldOf("alias").forGetter(ean::c), bif.b(ahc.a(ke.aG)).fieldOf("targets").forGetter(ean::d)).apply($$0, ean::new)
   );

   @Override
   public void a(aup $$0, BiConsumer<ahc<eai>, ahc<eai>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ahc<eai>)$$1x.b()));
   }

   @Override
   public Stream<ahc<eai>> a() {
      return this.d.e().stream().map(bih.b::b);
   }

   @Override
   public Codec<ean> b() {
      return a;
   }
}
