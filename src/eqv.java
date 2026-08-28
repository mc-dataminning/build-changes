import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eqv(alc<eqq> c, bsb<alc<eqq>> d) implements eqs {
   static MapCodec<eqv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a(me.bc).fieldOf("alias").forGetter(eqv::c), bsb.b(alc.a(me.bc)).fieldOf("targets").forGetter(eqv::d)).apply($$0, eqv::new)
   );

   @Override
   public void a(azs $$0, BiConsumer<alc<eqq>, alc<eqq>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<alc<eqq>> a() {
      return this.d.d().stream().map(bsa::a);
   }

   @Override
   public MapCodec<eqv> b() {
      return a;
   }
}
