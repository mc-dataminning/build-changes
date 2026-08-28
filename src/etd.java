import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record etd(alf<esx> c, bsq<alf<esx>> d) implements esz {
   static MapCodec<etd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mh.bf).fieldOf("alias").forGetter(etd::c), bsq.b(alf.a(mh.bf)).fieldOf("targets").forGetter(etd::d)).apply($$0, etd::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alf<esx>, alf<esx>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<alf<esx>> a() {
      return this.d.d().stream().map(bsp::a);
   }

   @Override
   public MapCodec<etd> b() {
      return a;
   }
}
