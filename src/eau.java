import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eau(bik<List<eaq>> c) implements eaq {
   static Codec<eau> a = RecordCodecBuilder.create($$0 -> $$0.group(bik.b(Codec.list(eaq.b)).fieldOf("groups").forGetter(eau::c)).apply($$0, eau::new));

   @Override
   public void a(auu $$0, BiConsumer<ahf<eao>, ahf<eao>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ahf<eao>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eaq::a);
   }

   @Override
   public Codec<eau> b() {
      return a;
   }
}
