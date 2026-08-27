import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dyj(agf<dye> c, bha<agf<dye>> d) implements dyg {
   static Codec<dyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agf.a(jz.aE).fieldOf("alias").forGetter(dyj::c), bha.b(agf.a(jz.aE)).fieldOf("targets").forGetter(dyj::d)).apply($$0, dyj::new)
   );

   @Override
   public void a(ato $$0, BiConsumer<agf<dye>, agf<dye>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (agf<dye>)$$1x.b()));
   }

   @Override
   public Stream<agf<dye>> a() {
      return this.d.e().stream().map(bhc.b::b);
   }

   @Override
   public Codec<dyj> b() {
      return a;
   }
}
