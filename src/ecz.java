import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ecz(aix<ecu> c, bkg<aix<ecu>> d) implements ecw {
   static Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aix.a(kg.aG).fieldOf("alias").forGetter(ecz::c), bkg.b(aix.a(kg.aG)).fieldOf("targets").forGetter(ecz::d)).apply($$0, ecz::new)
   );

   @Override
   public void a(awp $$0, BiConsumer<aix<ecu>, aix<ecu>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aix<ecu>)$$1x.b()));
   }

   @Override
   public Stream<aix<ecu>> a() {
      return this.d.e().stream().map(bki.b::b);
   }

   @Override
   public Codec<ecz> b() {
      return a;
   }
}
