import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejs(ald<ejr> c, ald<ejr> d) implements ejt {
   static MapCodec<ejs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lq.aM).fieldOf("alias").forGetter(ejs::c), ald.a(lq.aM).fieldOf("target").forGetter(ejs::d)).apply($$0, ejs::new)
   );

   @Override
   public void a(azf $$0, BiConsumer<ald<ejr>, ald<ejr>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ald<ejr>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ejs> b() {
      return a;
   }
}
