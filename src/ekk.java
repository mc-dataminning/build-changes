import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ekk(akj<ekf> c, boq<akj<ekf>> d) implements ekh {
   static MapCodec<ekk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aT).fieldOf("alias").forGetter(ekk::c), boq.b(akj.a(lr.aT)).fieldOf("targets").forGetter(ekk::d)).apply($$0, ekk::new)
   );

   @Override
   public void a(ayo $$0, BiConsumer<akj<ekf>, akj<ekf>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akj<ekf>)$$1x.b()));
   }

   @Override
   public Stream<akj<ekf>> a() {
      return this.d.e().stream().map(bos.b::b);
   }

   @Override
   public MapCodec<ekk> b() {
      return a;
   }
}
