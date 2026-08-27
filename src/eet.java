import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eet(bln<List<eep>> c) implements eep {
   static Codec<eet> a = RecordCodecBuilder.create($$0 -> $$0.group(bln.b(Codec.list(eep.b)).fieldOf("groups").forGetter(eet::c)).apply($$0, eet::new));

   @Override
   public void a(axd $$0, BiConsumer<ajg<een>, ajg<een>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ajg<een>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eep::a);
   }

   @Override
   public Codec<eet> b() {
      return a;
   }
}
