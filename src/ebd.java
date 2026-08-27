import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ebd(bim<List<eaz>> c) implements eaz {
   static Codec<ebd> a = RecordCodecBuilder.create($$0 -> $$0.group(bim.b(Codec.list(eaz.b)).fieldOf("groups").forGetter(ebd::c)).apply($$0, ebd::new));

   @Override
   public void a(auw $$0, BiConsumer<ahg<eax>, ahg<eax>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ahg<eax>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eaz::a);
   }

   @Override
   public Codec<ebd> b() {
      return a;
   }
}
