import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eme(bpu<List<ema>> c) implements ema {
   static MapCodec<eme> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpu.b(Codec.list(ema.b)).fieldOf("groups").forGetter(eme::c)).apply($$0, eme::new));

   @Override
   public void a(azk $$0, BiConsumer<ala<ely>, ala<ely>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ala<ely>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ema::a);
   }

   @Override
   public MapCodec<eme> b() {
      return a;
   }
}
