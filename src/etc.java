import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record etc(bsq<List<esz>> c) implements esz {
   static MapCodec<etc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bsq.b(Codec.list(esz.b)).fieldOf("groups").forGetter(etc::c)).apply($$0, etc::new));

   @Override
   public void a(azv $$0, BiConsumer<alf<esx>, alf<esx>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alf<esx>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(esz::a);
   }

   @Override
   public MapCodec<etc> b() {
      return a;
   }
}
