import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ele(akq<ekz> c, bpb<akq<ekz>> d) implements elb {
   static MapCodec<ele> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a(lu.aU).fieldOf("alias").forGetter(ele::c), bpb.b(akq.a(lu.aU)).fieldOf("targets").forGetter(ele::d)).apply($$0, ele::new)
   );

   @Override
   public void a(ayw $$0, BiConsumer<akq<ekz>, akq<ekz>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akq<ekz>)$$1x.b()));
   }

   @Override
   public Stream<akq<ekz>> a() {
      return this.d.e().stream().map(bpd.b::b);
   }

   @Override
   public MapCodec<ele> b() {
      return a;
   }
}
