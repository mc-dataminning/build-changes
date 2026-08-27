import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eco(aix<ecn> c, aix<ecn> d) implements ecp {
   static Codec<eco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aix.a(kg.aG).fieldOf("alias").forGetter(eco::c), aix.a(kg.aG).fieldOf("target").forGetter(eco::d)).apply($$0, eco::new)
   );

   @Override
   public void a(awo $$0, BiConsumer<aix<ecn>, aix<ecn>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aix<ecn>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eco> b() {
      return a;
   }
}
