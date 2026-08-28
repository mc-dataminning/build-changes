import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epb(bqr<List<eox>> c) implements eox {
   static MapCodec<epb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bqr.b(Codec.list(eox.b)).fieldOf("groups").forGetter(epb::c)).apply($$0, epb::new));

   @Override
   public void a(azh $$0, BiConsumer<aku<eov>, aku<eov>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aku<eov>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eox::a);
   }

   @Override
   public MapCodec<epb> b() {
      return a;
   }
}
