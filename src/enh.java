import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record enh(bqg<List<end>> c) implements end {
   static MapCodec<enh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bqg.b(Codec.list(end.b)).fieldOf("groups").forGetter(enh::c)).apply($$0, enh::new));

   @Override
   public void a(azr $$0, BiConsumer<alg<enb>, alg<enb>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alg<enb>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(end::a);
   }

   @Override
   public MapCodec<enh> b() {
      return a;
   }
}
