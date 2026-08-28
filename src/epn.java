import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epn(aly<epm> c, aly<epm> d) implements epo {
   static MapCodec<epn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aW).fieldOf("alias").forGetter(epn::c), aly.a(mb.aW).fieldOf("target").forGetter(epn::d)).apply($$0, epn::new)
   );

   @Override
   public void a(bam $$0, BiConsumer<aly<epm>, aly<epm>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aly<epm>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<epn> b() {
      return a;
   }
}
