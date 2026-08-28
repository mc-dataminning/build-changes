import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record emr(ald<emq> c, ald<emq> d) implements ems {
   static MapCodec<emr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lw.aW).fieldOf("alias").forGetter(emr::c), ald.a(lw.aW).fieldOf("target").forGetter(emr::d)).apply($$0, emr::new)
   );

   @Override
   public void a(azn $$0, BiConsumer<ald<emq>, ald<emq>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ald<emq>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<emr> b() {
      return a;
   }
}
