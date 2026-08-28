import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record esx(bsq<List<esu>> c) implements esu {
   static MapCodec<esx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bsq.b(Codec.list(esu.b)).fieldOf("groups").forGetter(esx::c)).apply($$0, esx::new));

   @Override
   public void a(azv $$0, BiConsumer<alf<ess>, alf<ess>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alf<ess>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(esu::a);
   }

   @Override
   public MapCodec<esx> b() {
      return a;
   }
}
