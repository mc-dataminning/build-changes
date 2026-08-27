import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eer(blm<List<een>> c) implements een {
   static Codec<eer> a = RecordCodecBuilder.create($$0 -> $$0.group(blm.b(Codec.list(een.b)).fieldOf("groups").forGetter(eer::c)).apply($$0, eer::new));

   @Override
   public void a(axd $$0, BiConsumer<ajg<eel>, ajg<eel>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ajg<eel>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(een::a);
   }

   @Override
   public Codec<eer> b() {
      return a;
   }
}
