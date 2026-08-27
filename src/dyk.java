import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dyk(bha<List<dyg>> c) implements dyg {
   static Codec<dyk> a = RecordCodecBuilder.create($$0 -> $$0.group(bha.b(Codec.list(dyg.b)).fieldOf("groups").forGetter(dyk::c)).apply($$0, dyk::new));

   @Override
   public void a(ato $$0, BiConsumer<agf<dye>, agf<dye>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<agf<dye>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(dyg::a);
   }

   @Override
   public Codec<dyk> b() {
      return a;
   }
}
