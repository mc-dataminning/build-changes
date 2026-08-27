import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eja(bog<List<eiw>> c) implements eiw {
   static MapCodec<eja> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bog.b(Codec.list(eiw.b)).fieldOf("groups").forGetter(eja::c)).apply($$0, eja::new));

   @Override
   public void a(aym $$0, BiConsumer<akm<eiu>, akm<eiu>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akm<eiu>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eiw::a);
   }

   @Override
   public MapCodec<eja> b() {
      return a;
   }
}
