import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eps(alo<epn> c, bri<alo<epn>> d) implements epp {
   static MapCodec<eps> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alo.a(mb.aX).fieldOf("alias").forGetter(eps::c), bri.b(alo.a(mb.aX)).fieldOf("targets").forGetter(eps::d)).apply($$0, eps::new)
   );

   @Override
   public void a(bac $$0, BiConsumer<alo<epn>, alo<epn>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (alo<epn>)$$1x.b()));
   }

   @Override
   public Stream<alo<epn>> a() {
      return this.d.e().stream().map(brk.b::b);
   }

   @Override
   public MapCodec<eps> b() {
      return a;
   }
}
