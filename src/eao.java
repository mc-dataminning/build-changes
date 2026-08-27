import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eao(bif<List<eak>> c) implements eak {
   static Codec<eao> a = RecordCodecBuilder.create($$0 -> $$0.group(bif.b(Codec.list(eak.b)).fieldOf("groups").forGetter(eao::c)).apply($$0, eao::new));

   @Override
   public void a(aup $$0, BiConsumer<ahc<eai>, ahc<eai>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ahc<eai>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eak::a);
   }

   @Override
   public Codec<eao> b() {
      return a;
   }
}
