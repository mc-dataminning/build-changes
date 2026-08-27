import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eix(akl<eis> c, boe<akl<eis>> d) implements eiu {
   static MapCodec<eix> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akl.a(lf.aM).fieldOf("alias").forGetter(eix::c), boe.b(akl.a(lf.aM)).fieldOf("targets").forGetter(eix::d)).apply($$0, eix::new)
   );

   @Override
   public void a(ayk $$0, BiConsumer<akl<eis>, akl<eis>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akl<eis>)$$1x.b()));
   }

   @Override
   public Stream<akl<eis>> a() {
      return this.d.e().stream().map(bog.b::b);
   }

   @Override
   public MapCodec<eix> b() {
      return a;
   }
}
