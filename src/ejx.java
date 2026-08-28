import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejx(ald<ejs> c, bpd<ald<ejs>> d) implements eju {
   static MapCodec<ejx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lq.aM).fieldOf("alias").forGetter(ejx::c), bpd.b(ald.a(lq.aM)).fieldOf("targets").forGetter(ejx::d)).apply($$0, ejx::new)
   );

   @Override
   public void a(azg $$0, BiConsumer<ald<ejs>, ald<ejs>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ald<ejs>)$$1x.b()));
   }

   @Override
   public Stream<ald<ejs>> a() {
      return this.d.e().stream().map(bpf.b::b);
   }

   @Override
   public MapCodec<ejx> b() {
      return a;
   }
}
