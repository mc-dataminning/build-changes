import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eeq(ajg<eel> c, blm<ajg<eel>> d) implements een {
   static Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajg.a(kj.aH).fieldOf("alias").forGetter(eeq::c), blm.b(ajg.a(kj.aH)).fieldOf("targets").forGetter(eeq::d)).apply($$0, eeq::new)
   );

   @Override
   public void a(axd $$0, BiConsumer<ajg<eel>, ajg<eel>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ajg<eel>)$$1x.b()));
   }

   @Override
   public Stream<ajg<eel>> a() {
      return this.d.e().stream().map(blo.b::b);
   }

   @Override
   public Codec<eeq> b() {
      return a;
   }
}
