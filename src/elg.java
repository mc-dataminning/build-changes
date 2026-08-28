import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record elg(akq<elb> c, bpb<akq<elb>> d) implements eld {
   static MapCodec<elg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a(lu.aU).fieldOf("alias").forGetter(elg::c), bpb.b(akq.a(lu.aU)).fieldOf("targets").forGetter(elg::d)).apply($$0, elg::new)
   );

   @Override
   public void a(ayw $$0, BiConsumer<akq<elb>, akq<elb>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akq<elb>)$$1x.b()));
   }

   @Override
   public Stream<akq<elb>> a() {
      return this.d.e().stream().map(bpd.b::b);
   }

   @Override
   public MapCodec<elg> b() {
      return a;
   }
}
