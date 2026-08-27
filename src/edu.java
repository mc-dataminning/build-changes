import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record edu(ajb<edp> c, bkv<ajb<edp>> d) implements edr {
   static Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajb.a(ki.aH).fieldOf("alias").forGetter(edu::c), bkv.b(ajb.a(ki.aH)).fieldOf("targets").forGetter(edu::d)).apply($$0, edu::new)
   );

   @Override
   public void a(awt $$0, BiConsumer<ajb<edp>, ajb<edp>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ajb<edp>)$$1x.b()));
   }

   @Override
   public Stream<ajb<edp>> a() {
      return this.d.e().stream().map(bkx.b::b);
   }

   @Override
   public Codec<edu> b() {
      return a;
   }
}
