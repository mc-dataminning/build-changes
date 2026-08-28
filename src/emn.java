import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record emn(alb<emm> c, alb<emm> d) implements emo {
   static MapCodec<emn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a(lv.aV).fieldOf("alias").forGetter(emn::c), alb.a(lv.aV).fieldOf("target").forGetter(emn::d)).apply($$0, emn::new)
   );

   @Override
   public void a(azl $$0, BiConsumer<alb<emm>, alb<emm>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alb<emm>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<emn> b() {
      return a;
   }
}
