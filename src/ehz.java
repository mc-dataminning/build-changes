import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ehz(akg<ehy> c, akg<ehy> d) implements eia {
   static Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akg.a(le.aM).fieldOf("alias").forGetter(ehz::c), akg.a(le.aM).fieldOf("target").forGetter(ehz::d)).apply($$0, ehz::new)
   );

   @Override
   public void a(ayg $$0, BiConsumer<akg<ehy>, akg<ehy>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<akg<ehy>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<ehz> b() {
      return a;
   }
}
