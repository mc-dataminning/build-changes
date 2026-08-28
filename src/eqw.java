import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eqw(bsb<List<eqs>> c) implements eqs {
   static MapCodec<eqw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bsb.b(Codec.list(eqs.b)).fieldOf("groups").forGetter(eqw::c)).apply($$0, eqw::new));

   @Override
   public void a(azs $$0, BiConsumer<alc<eqq>, alc<eqq>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alc<eqq>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(eqs::a);
   }

   @Override
   public MapCodec<eqw> b() {
      return a;
   }
}
