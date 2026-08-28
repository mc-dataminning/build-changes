import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epz(brq<List<epv>> c) implements epv {
   static MapCodec<epz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(brq.b(Codec.list(epv.b)).fieldOf("groups").forGetter(epz::c)).apply($$0, epz::new));

   @Override
   public void a(bam $$0, BiConsumer<aly<ept>, aly<ept>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aly<ept>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(epv::a);
   }

   @Override
   public MapCodec<epz> b() {
      return a;
   }
}
