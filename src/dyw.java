import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dyw(agl<dyv> c, agl<dyv> d) implements dyx {
   static Codec<dyw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agl.a(kd.aE).fieldOf("alias").forGetter(dyw::c), agl.a(kd.aE).fieldOf("target").forGetter(dyw::d)).apply($$0, dyw::new)
   );

   @Override
   public void a(atw $$0, BiConsumer<agl<dyv>, agl<dyv>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<agl<dyv>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<dyw> b() {
      return a;
   }
}
