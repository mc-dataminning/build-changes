import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eit(akl<eis> c, akl<eis> d) implements eiu {
   static MapCodec<eit> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akl.a(lf.aM).fieldOf("alias").forGetter(eit::c), akl.a(lf.aM).fieldOf("target").forGetter(eit::d)).apply($$0, eit::new)
   );

   @Override
   public void a(ayk $$0, BiConsumer<akl<eis>, akl<eis>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akl<eis>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eit> b() {
      return a;
   }
}
