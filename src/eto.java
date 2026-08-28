import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record eto(alj<etn> c, alj<etn> d) implements etp {
   static MapCodec<eto> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.a(mi.bf).fieldOf("alias").forGetter(eto::c), alj.a(mi.bf).fieldOf("target").forGetter(eto::d)).apply($$0, eto::new)
   );

   @Override
   public void a(azz $$0, BiConsumer<alj<etn>, alj<etn>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alj<etn>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eto> b() {
      return a;
   }
}
