import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ecs(aix<ecn> c, bke<aix<ecn>> d) implements ecp {
   static Codec<ecs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aix.a(kg.aG).fieldOf("alias").forGetter(ecs::c), bke.b(aix.a(kg.aG)).fieldOf("targets").forGetter(ecs::d)).apply($$0, ecs::new)
   );

   @Override
   public void a(awo $$0, BiConsumer<aix<ecn>, aix<ecn>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aix<ecn>)$$1x.b()));
   }

   @Override
   public Stream<aix<ecn>> a() {
      return this.d.e().stream().map(bkg.b::b);
   }

   @Override
   public Codec<ecs> b() {
      return a;
   }
}
