import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record emw(bqc<List<ems>> c) implements ems {
   static MapCodec<emw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bqc.b(Codec.list(ems.b)).fieldOf("groups").forGetter(emw::c)).apply($$0, emw::new));

   @Override
   public void a(azn $$0, BiConsumer<ald<emq>, ald<emq>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ald<emq>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ems::a);
   }

   @Override
   public MapCodec<emw> b() {
      return a;
   }
}
