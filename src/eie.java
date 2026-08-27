import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eie(bnw<List<eia>> c) implements eia {
   static Codec<eie> a = RecordCodecBuilder.create($$0 -> $$0.group(bnw.b(Codec.list(eia.b)).fieldOf("groups").forGetter(eie::c)).apply($$0, eie::new));

   @Override
   public void a(ayg $$0, BiConsumer<akg<ehy>, akg<ehy>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akg<ehy>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eia::a);
   }

   @Override
   public Codec<eie> b() {
      return a;
   }
}
