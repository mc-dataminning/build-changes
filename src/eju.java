import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eju(ale<ejt> c, ale<ejt> d) implements ejv {
   static MapCodec<eju> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aM).fieldOf("alias").forGetter(eju::c), ale.a(lq.aM).fieldOf("target").forGetter(eju::d)).apply($$0, eju::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<ale<ejt>, ale<ejt>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ale<ejt>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<eju> b() {
      return a;
   }
}
