import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record enn(bql<List<enj>> c) implements enj {
   static MapCodec<enn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bql.b(Codec.list(enj.b)).fieldOf("groups").forGetter(enn::c)).apply($$0, enn::new));

   @Override
   public void a(azs $$0, BiConsumer<alh<enh>, alh<enh>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alh<enh>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(enj::a);
   }

   @Override
   public MapCodec<enn> b() {
      return a;
   }
}
