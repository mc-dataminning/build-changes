import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record ett(alj<etn> c, btd<alj<etn>> d) implements etp {
   static MapCodec<ett> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.a(mi.bf).fieldOf("alias").forGetter(ett::c), btd.b(alj.a(mi.bf)).fieldOf("targets").forGetter(ett::d)).apply($$0, ett::new)
   );

   @Override
   public void a(azz $$0, BiConsumer<alj<etn>, alj<etn>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<alj<etn>> a() {
      return this.d.d().stream().map(btc::a);
   }

   @Override
   public MapCodec<ett> b() {
      return a;
   }
}
