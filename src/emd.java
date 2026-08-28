import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record emd(ala<ely> c, bpu<ala<ely>> d) implements ema {
   static MapCodec<emd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lv.aU).fieldOf("alias").forGetter(emd::c), bpu.b(ala.a(lv.aU)).fieldOf("targets").forGetter(emd::d)).apply($$0, emd::new)
   );

   @Override
   public void a(azk $$0, BiConsumer<ala<ely>, ala<ely>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ala<ely>)$$1x.b()));
   }

   @Override
   public Stream<ala<ely>> a() {
      return this.d.e().stream().map(bpw.b::b);
   }

   @Override
   public MapCodec<emd> b() {
      return a;
   }
}
