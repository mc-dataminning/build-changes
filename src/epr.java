import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epr(aly<epm> c, brm<aly<epm>> d) implements epo {
   static MapCodec<epr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.aW).fieldOf("alias").forGetter(epr::c), brm.b(aly.a(mb.aW)).fieldOf("targets").forGetter(epr::d)).apply($$0, epr::new)
   );

   @Override
   public void a(bam $$0, BiConsumer<aly<epm>, aly<epm>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aly<epm>)$$1x.b()));
   }

   @Override
   public Stream<aly<epm>> a() {
      return this.d.e().stream().map(bro.b::b);
   }

   @Override
   public MapCodec<epr> b() {
      return a;
   }
}
