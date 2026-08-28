import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eqr(alc<eqq> c, alc<eqq> d) implements eqs {
   static MapCodec<eqr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a(me.bc).fieldOf("alias").forGetter(eqr::c), alc.a(me.bc).fieldOf("target").forGetter(eqr::d)).apply($$0, eqr::new)
   );

   @Override
   public void a(azs $$0, BiConsumer<alc<eqq>, alc<eqq>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alc<eqq>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eqr> b() {
      return a;
   }
}
