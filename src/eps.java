import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eps(brm<List<epo>> c) implements epo {
   static MapCodec<eps> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(brm.b(Codec.list(epo.b)).fieldOf("groups").forGetter(eps::c)).apply($$0, eps::new));

   @Override
   public void a(bam $$0, BiConsumer<aly<epm>, aly<epm>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aly<epm>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(epo::a);
   }

   @Override
   public MapCodec<eps> b() {
      return a;
   }
}
