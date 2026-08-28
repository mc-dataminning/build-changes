import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epa(bqq<List<eow>> c) implements eow {
   static MapCodec<epa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bqq.b(Codec.list(eow.b)).fieldOf("groups").forGetter(epa::c)).apply($$0, epa::new));

   @Override
   public void a(azg $$0, BiConsumer<akt<eou>, akt<eou>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akt<eou>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eow::a);
   }

   @Override
   public MapCodec<epa> b() {
      return a;
   }
}
