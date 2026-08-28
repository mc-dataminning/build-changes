import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ela(akq<ekz> c, akq<ekz> d) implements elb {
   static MapCodec<ela> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a(lu.aU).fieldOf("alias").forGetter(ela::c), akq.a(lu.aU).fieldOf("target").forGetter(ela::d)).apply($$0, ela::new)
   );

   @Override
   public void a(ayw $$0, BiConsumer<akq<ekz>, akq<ekz>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akq<ekz>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ela> b() {
      return a;
   }
}
