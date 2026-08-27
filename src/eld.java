import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eld(aks<elc> c, aks<elc> d) implements ele {
   static Codec<eld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aks.a(li.aM).fieldOf("alias").forGetter(eld::c), aks.a(li.aM).fieldOf("target").forGetter(eld::d)).apply($$0, eld::new)
   );

   @Override
   public void a(ayt $$0, BiConsumer<aks<elc>, aks<elc>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<aks<elc>> a() {
      return Stream.of(this.d);
   }

   @Override
   public Codec<eld> b() {
      return a;
   }
}
