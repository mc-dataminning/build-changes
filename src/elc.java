import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record elc(bpa<List<eky>> c) implements eky {
   static MapCodec<elc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpa.b(Codec.list(eky.b)).fieldOf("groups").forGetter(elc::c)).apply($$0, elc::new));

   @Override
   public void a(ayv $$0, BiConsumer<akp<ekw>, akp<ekw>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akp<ekw>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eky::a);
   }

   @Override
   public MapCodec<elc> b() {
      return a;
   }
}
