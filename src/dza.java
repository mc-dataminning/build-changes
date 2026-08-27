import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dza(agl<dyv> c, bhl<agl<dyv>> d) implements dyx {
   static Codec<dza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agl.a(kd.aE).fieldOf("alias").forGetter(dza::c), bhl.b(agl.a(kd.aE)).fieldOf("targets").forGetter(dza::d)).apply($$0, dza::new)
   );

   @Override
   public void a(atw $$0, BiConsumer<agl<dyv>, agl<dyv>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (agl<dyv>)$$1x.b()));
   }

   @Override
   public Stream<agl<dyv>> a() {
      return this.d.e().stream().map(bhn.b::b);
   }

   @Override
   public Codec<dza> b() {
      return a;
   }
}
