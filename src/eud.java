import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record eud(alq<etx> c, btm<alq<etx>> d) implements etz {
   static MapCodec<eud> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alq.a(mi.bf).fieldOf("alias").forGetter(eud::c), btm.b(alq.a(mi.bf)).fieldOf("targets").forGetter(eud::d)).apply($$0, eud::new)
   );

   @Override
   public void a(bai $$0, BiConsumer<alq<etx>, alq<etx>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<alq<etx>> a() {
      return this.d.d().stream().map(btl::a);
   }

   @Override
   public MapCodec<eud> b() {
      return a;
   }
}
