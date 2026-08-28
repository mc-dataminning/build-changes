import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epo(alo<epn> c, alo<epn> d) implements epp {
   static MapCodec<epo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alo.a(mb.aX).fieldOf("alias").forGetter(epo::c), alo.a(mb.aX).fieldOf("target").forGetter(epo::d)).apply($$0, epo::new)
   );

   @Override
   public void a(bac $$0, BiConsumer<alo<epn>, alo<epn>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alo<epn>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<epo> b() {
      return a;
   }
}
