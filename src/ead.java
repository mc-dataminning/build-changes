import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ead(bhv<List<dzz>> c) implements dzz {
   static Codec<ead> a = RecordCodecBuilder.create($$0 -> $$0.group(bhv.b(Codec.list(dzz.b)).fieldOf("groups").forGetter(ead::c)).apply($$0, ead::new));

   @Override
   public void a(auf $$0, BiConsumer<ags<dzx>, ags<dzx>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ags<dzx>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(dzz::a);
   }

   @Override
   public Codec<ead> b() {
      return a;
   }
}
