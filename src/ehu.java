import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ehu(ake<ehp> c, bna<ake<ehp>> d) implements ehr {
   static Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ake.a(ld.aL).fieldOf("alias").forGetter(ehu::c), bna.b(ake.a(ld.aL)).fieldOf("targets").forGetter(ehu::d)).apply($$0, ehu::new)
   );

   @Override
   public void a(ayd $$0, BiConsumer<ake<ehp>, ake<ehp>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ake<ehp>)$$1x.b()));
   }

   @Override
   public Stream<ake<ehp>> a() {
      return this.d.e().stream().map(bnc.b::b);
   }

   @Override
   public Codec<ehu> b() {
      return a;
   }
}
