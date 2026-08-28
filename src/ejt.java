import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejt(ala<ejo> c, boz<ala<ejo>> d) implements ejq {
   static MapCodec<ejt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lq.aM).fieldOf("alias").forGetter(ejt::c), boz.b(ala.a(lq.aM)).fieldOf("targets").forGetter(ejt::d)).apply($$0, ejt::new)
   );

   @Override
   public void a(azc $$0, BiConsumer<ala<ejo>, ala<ejo>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ala<ejo>)$$1x.b()));
   }

   @Override
   public Stream<ala<ejo>> a() {
      return this.d.e().stream().map(bpb.b::b);
   }

   @Override
   public MapCodec<ejt> b() {
      return a;
   }
}
