import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record esr(bso<List<esn>> c) implements esn {
   static MapCodec<esr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bso.b(Codec.list(esn.b)).fieldOf("groups").forGetter(esr::c)).apply($$0, esr::new));

   @Override
   public void a(azv $$0, BiConsumer<alf<esl>, alf<esl>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alf<esl>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(esn::a);
   }

   @Override
   public MapCodec<esr> b() {
      return a;
   }
}
