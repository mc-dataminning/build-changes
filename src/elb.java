import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record elb(akp<ekw> c, bpa<akp<ekw>> d) implements eky {
   static MapCodec<elb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akp.a(lu.aU).fieldOf("alias").forGetter(elb::c), bpa.b(akp.a(lu.aU)).fieldOf("targets").forGetter(elb::d)).apply($$0, elb::new)
   );

   @Override
   public void a(ayv $$0, BiConsumer<akp<ekw>, akp<ekw>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akp<ekw>)$$1x.b()));
   }

   @Override
   public Stream<akp<ekw>> a() {
      return this.d.e().stream().map(bpc.b::b);
   }

   @Override
   public MapCodec<elb> b() {
      return a;
   }
}
