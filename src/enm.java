import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record enm(alk<enl> c, alk<enl> d) implements enn {
   static MapCodec<enm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a(ma.aV).fieldOf("alias").forGetter(enm::c), alk.a(ma.aV).fieldOf("target").forGetter(enm::d)).apply($$0, enm::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alk<enl>, alk<enl>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<alk<enl>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<enm> b() {
      return a;
   }
}
