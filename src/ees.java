import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ees(ajg<een> c, bln<ajg<een>> d) implements eep {
   static Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajg.a(kj.aH).fieldOf("alias").forGetter(ees::c), bln.b(ajg.a(kj.aH)).fieldOf("targets").forGetter(ees::d)).apply($$0, ees::new)
   );

   @Override
   public void a(axd $$0, BiConsumer<ajg<een>, ajg<een>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ajg<een>)$$1x.b()));
   }

   @Override
   public Stream<ajg<een>> a() {
      return this.d.e().stream().map(blp.b::b);
   }

   @Override
   public Codec<ees> b() {
      return a;
   }
}
