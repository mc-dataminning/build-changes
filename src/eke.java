import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eke(akj<ejz> c, bon<akj<ejz>> d) implements ekb {
   static MapCodec<eke> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aT).fieldOf("alias").forGetter(eke::c), bon.b(akj.a(lr.aT)).fieldOf("targets").forGetter(eke::d)).apply($$0, eke::new)
   );

   @Override
   public void a(aym $$0, BiConsumer<akj<ejz>, akj<ejz>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akj<ejz>)$$1x.b()));
   }

   @Override
   public Stream<akj<ejz>> a() {
      return this.d.e().stream().map(bop.b::b);
   }

   @Override
   public MapCodec<eke> b() {
      return a;
   }
}
