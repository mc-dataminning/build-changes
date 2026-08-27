import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eiv(akm<eiu> c, akm<eiu> d) implements eiw {
   static MapCodec<eiv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akm.a(lf.aM).fieldOf("alias").forGetter(eiv::c), akm.a(lf.aM).fieldOf("target").forGetter(eiv::d)).apply($$0, eiv::new)
   );

   @Override
   public void a(aym $$0, BiConsumer<akm<eiu>, akm<eiu>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akm<eiu>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eiv> b() {
      return a;
   }
}
