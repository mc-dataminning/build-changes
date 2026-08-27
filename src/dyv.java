import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record dyv(agh<dyq> c, bhh<agh<dyq>> d) implements dys {
   static Codec<dyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agh.a(jz.aE).fieldOf("alias").forGetter(dyv::c), bhh.b(agh.a(jz.aE)).fieldOf("targets").forGetter(dyv::d)).apply($$0, dyv::new)
   );

   @Override
   public void a(ats $$0, BiConsumer<agh<dyq>, agh<dyq>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (agh<dyq>)$$1x.b()));
   }

   @Override
   public Stream<agh<dyq>> a() {
      return this.d.e().stream().map(bhj.b::b);
   }

   @Override
   public Codec<dyv> b() {
      return a;
   }
}
