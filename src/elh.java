import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record elh(aks<elc> c, bok<aks<elc>> d) implements ele {
   static Codec<elh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aks.a(li.aM).fieldOf("alias").forGetter(elh::c), bok.b(aks.a(li.aM)).fieldOf("targets").forGetter(elh::d)).apply($$0, elh::new)
   );

   @Override
   public void a(ayt $$0, BiConsumer<aks<elc>, aks<elc>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aks<elc>)$$1x.b()));
   }

   @Override
   public Stream<aks<elc>> a() {
      return this.d.e().stream().map(bom.b::b);
   }

   @Override
   public Codec<elh> b() {
      return a;
   }
}
