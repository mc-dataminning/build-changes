import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record esq(alf<esl> c, bso<alf<esl>> d) implements esn {
   static MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.bf).fieldOf("alias").forGetter(esq::c), bso.b(alf.a(mg.bf)).fieldOf("targets").forGetter(esq::d)).apply($$0, esq::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alf<esl>, alf<esl>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<alf<esl>> a() {
      return this.d.d().stream().map(bsn::a);
   }

   @Override
   public MapCodec<esq> b() {
      return a;
   }
}
