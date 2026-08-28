import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record ets(btd<List<etp>> c) implements etp {
   static MapCodec<ets> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(btd.b(Codec.list(etp.b)).fieldOf("groups").forGetter(ets::c)).apply($$0, ets::new));

   @Override
   public void a(azz $$0, BiConsumer<alj<etn>, alj<etn>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alj<etn>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(etp::a);
   }

   @Override
   public MapCodec<ets> b() {
      return a;
   }
}
