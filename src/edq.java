import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record edq(ajb<edp> c, ajb<edp> d) implements edr {
   static Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajb.a(ki.aH).fieldOf("alias").forGetter(edq::c), ajb.a(ki.aH).fieldOf("target").forGetter(edq::d)).apply($$0, edq::new)
   );

   @Override
   public void a(awt $$0, BiConsumer<ajb<edp>, ajb<edp>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ajb<edp>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<edq> b() {
      return a;
   }
}
