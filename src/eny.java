import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eny(bqs<List<enu>> c) implements enu {
   static MapCodec<eny> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bqs.b(Codec.list(enu.b)).fieldOf("groups").forGetter(eny::c)).apply($$0, eny::new));

   @Override
   public void a(azu $$0, BiConsumer<ali<ens>, ali<ens>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ali<ens>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(enu::a);
   }

   @Override
   public MapCodec<eny> b() {
      return a;
   }
}
