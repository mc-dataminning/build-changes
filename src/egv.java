import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record egv(ajs<egq> c, bmk<ajs<egq>> d) implements egs {
   static Codec<egv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajs.a(ks.aI).fieldOf("alias").forGetter(egv::c), bmk.b(ajs.a(ks.aI)).fieldOf("targets").forGetter(egv::d)).apply($$0, egv::new)
   );

   @Override
   public void a(axr $$0, BiConsumer<ajs<egq>, ajs<egq>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ajs<egq>)$$1x.b()));
   }

   @Override
   public Stream<ajs<egq>> a() {
      return this.d.e().stream().map(bmm.b::b);
   }

   @Override
   public Codec<egv> b() {
      return a;
   }
}
