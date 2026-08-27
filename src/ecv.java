import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ecv(aix<ecu> c, aix<ecu> d) implements ecw {
   static Codec<ecv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aix.a(kg.aG).fieldOf("alias").forGetter(ecv::c), aix.a(kg.aG).fieldOf("target").forGetter(ecv::d)).apply($$0, ecv::new)
   );

   @Override
   public void a(awp $$0, BiConsumer<aix<ecu>, aix<ecu>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aix<ecu>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<ecv> b() {
      return a;
   }
}
