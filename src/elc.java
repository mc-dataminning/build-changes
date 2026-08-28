import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record elc(akq<elb> c, akq<elb> d) implements eld {
   static MapCodec<elc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a(lu.aU).fieldOf("alias").forGetter(elc::c), akq.a(lu.aU).fieldOf("target").forGetter(elc::d)).apply($$0, elc::new)
   );

   @Override
   public void a(ayw $$0, BiConsumer<akq<elb>, akq<elb>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akq<elb>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<elc> b() {
      return a;
   }
}
