import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epa(aku<eov> c, bqr<aku<eov>> d) implements eox {
   static MapCodec<epa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aX).fieldOf("alias").forGetter(epa::c), bqr.b(aku.a(mc.aX)).fieldOf("targets").forGetter(epa::d)).apply($$0, epa::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<aku<eov>, aku<eov>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aku<eov>)$$1x.b()));
   }

   @Override
   public Stream<aku<eov>> a() {
      return this.d.e().stream().map(bqt.b::b);
   }

   @Override
   public MapCodec<epa> b() {
      return a;
   }
}
