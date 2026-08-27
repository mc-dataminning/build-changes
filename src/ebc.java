import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ebc(ahg<eax> c, bim<ahg<eax>> d) implements eaz {
   static Codec<ebc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahg.a(ke.aG).fieldOf("alias").forGetter(ebc::c), bim.b(ahg.a(ke.aG)).fieldOf("targets").forGetter(ebc::d)).apply($$0, ebc::new)
   );

   @Override
   public void a(auw $$0, BiConsumer<ahg<eax>, ahg<eax>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ahg<eax>)$$1x.b()));
   }

   @Override
   public Stream<ahg<eax>> a() {
      return this.d.e().stream().map(bio.b::b);
   }

   @Override
   public Codec<ebc> b() {
      return a;
   }
}
