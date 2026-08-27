import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ehe(aju<egz> c, bmp<aju<egz>> d) implements ehb {
   static Codec<ehe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aju.a(ku.aJ).fieldOf("alias").forGetter(ehe::c), bmp.b(aju.a(ku.aJ)).fieldOf("targets").forGetter(ehe::d)).apply($$0, ehe::new)
   );

   @Override
   public void a(axt $$0, BiConsumer<aju<egz>, aju<egz>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aju<egz>)$$1x.b()));
   }

   @Override
   public Stream<aju<egz>> a() {
      return this.d.e().stream().map(bmr.b::b);
   }

   @Override
   public Codec<ehe> b() {
      return a;
   }
}
