import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eha(aju<egz> c, aju<egz> d) implements ehb {
   static Codec<eha> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aju.a(ku.aJ).fieldOf("alias").forGetter(eha::c), aju.a(ku.aJ).fieldOf("target").forGetter(eha::d)).apply($$0, eha::new)
   );

   @Override
   public void a(axt $$0, BiConsumer<aju<egz>, aju<egz>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aju<egz>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eha> b() {
      return a;
   }
}
