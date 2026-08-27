import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dzy(ags<dzx> c, ags<dzx> d) implements dzz {
   static Codec<dzy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ags.a(kc.aF).fieldOf("alias").forGetter(dzy::c), ags.a(kc.aF).fieldOf("target").forGetter(dzy::d)).apply($$0, dzy::new)
   );

   @Override
   public void a(auf $$0, BiConsumer<ags<dzx>, ags<dzx>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ags<dzx>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<dzy> b() {
      return a;
   }
}
