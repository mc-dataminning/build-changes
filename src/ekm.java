import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ekm(akj<ekh> c, bor<akj<ekh>> d) implements ekj {
   static MapCodec<ekm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aT).fieldOf("alias").forGetter(ekm::c), bor.b(akj.a(lr.aT)).fieldOf("targets").forGetter(ekm::d)).apply($$0, ekm::new)
   );

   @Override
   public void a(ayo $$0, BiConsumer<akj<ekh>, akj<ekh>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akj<ekh>)$$1x.b()));
   }

   @Override
   public Stream<akj<ekh>> a() {
      return this.d.e().stream().map(bot.b::b);
   }

   @Override
   public MapCodec<ekm> b() {
      return a;
   }
}
