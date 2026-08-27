import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eac(ags<dzx> c, bhv<ags<dzx>> d) implements dzz {
   static Codec<eac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ags.a(kc.aF).fieldOf("alias").forGetter(eac::c), bhv.b(ags.a(kc.aF)).fieldOf("targets").forGetter(eac::d)).apply($$0, eac::new)
   );

   @Override
   public void a(auf $$0, BiConsumer<ags<dzx>, ags<dzx>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ags<dzx>)$$1x.b()));
   }

   @Override
   public Stream<ags<dzx>> a() {
      return this.d.e().stream().map(bhx.b::b);
   }

   @Override
   public Codec<eac> b() {
      return a;
   }
}
