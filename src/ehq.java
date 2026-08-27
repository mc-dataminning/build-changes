import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ehq(ake<ehp> c, ake<ehp> d) implements ehr {
   static Codec<ehq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ake.a(ld.aL).fieldOf("alias").forGetter(ehq::c), ake.a(ld.aL).fieldOf("target").forGetter(ehq::d)).apply($$0, ehq::new)
   );

   @Override
   public void a(ayd $$0, BiConsumer<ake<ehp>, ake<ehp>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ake<ehp>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<ehq> b() {
      return a;
   }
}
