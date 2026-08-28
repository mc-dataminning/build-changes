import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejz(ale<eju> c, bpf<ale<eju>> d) implements ejw {
   static MapCodec<ejz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aM).fieldOf("alias").forGetter(ejz::c), bpf.b(ale.a(lq.aM)).fieldOf("targets").forGetter(ejz::d)).apply($$0, ejz::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<ale<eju>, ale<eju>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (ale<eju>)$$1x.b()));
   }

   @Override
   public Stream<ale<eju>> a() {
      return this.d.e().stream().map(bph.b::b);
   }

   @Override
   public MapCodec<ejz> b() {
      return a;
   }
}
