import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epd(bqt<List<eoz>> c) implements eoz {
   static MapCodec<epd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bqt.b(Codec.list(eoz.b)).fieldOf("groups").forGetter(epd::c)).apply($$0, epd::new));

   @Override
   public void a(azh $$0, BiConsumer<aku<eox>, aku<eox>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<aku<eox>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eoz::a);
   }

   @Override
   public MapCodec<epd> b() {
      return a;
   }
}
