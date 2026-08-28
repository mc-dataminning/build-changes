import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ert(ald<ers> c, ald<ers> d) implements eru {
   static MapCodec<ert> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(mg.bd).fieldOf("alias").forGetter(ert::c), ald.a(mg.bd).fieldOf("target").forGetter(ert::d)).apply($$0, ert::new)
   );

   @Override
   public void a(azt $$0, BiConsumer<ald<ers>, ald<ers>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ald<ers>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ert> b() {
      return a;
   }
}
