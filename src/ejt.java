import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejt(ald<ejs> c, ald<ejs> d) implements eju {
   static MapCodec<ejt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lq.aM).fieldOf("alias").forGetter(ejt::c), ald.a(lq.aM).fieldOf("target").forGetter(ejt::d)).apply($$0, ejt::new)
   );

   @Override
   public void a(azg $$0, BiConsumer<ald<ejs>, ald<ejs>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ald<ejs>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ejt> b() {
      return a;
   }
}
