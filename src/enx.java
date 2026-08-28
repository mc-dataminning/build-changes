import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record enx(ali<ens> c, bqs<ali<ens>> d) implements enu {
   static MapCodec<enx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a(ma.aV).fieldOf("alias").forGetter(enx::c), bqs.b(ali.a(ma.aV)).fieldOf("targets").forGetter(enx::d)).apply($$0, enx::new)
   );

   @Override
   public void a(azu $$0, BiConsumer<ali<ens>, ali<ens>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ali<ens>)$$1x.b()));
   }

   @Override
   public Stream<ali<ens>> a() {
      return this.d.e().stream().map(bqu.b::b);
   }

   @Override
   public MapCodec<enx> b() {
      return a;
   }
}
