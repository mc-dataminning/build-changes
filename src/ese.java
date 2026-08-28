import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ese(alf<esd> c, alf<esd> d) implements esf {
   static MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.be).fieldOf("alias").forGetter(ese::c), alf.a(mg.be).fieldOf("target").forGetter(ese::d)).apply($$0, ese::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alf<esd>, alf<esd>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alf<esd>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ese> b() {
      return a;
   }
}
