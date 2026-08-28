import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eka(bpf<List<ejw>> c) implements ejw {
   static MapCodec<eka> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpf.b(Codec.list(ejw.b)).fieldOf("groups").forGetter(eka::c)).apply($$0, eka::new));

   @Override
   public void a(azh $$0, BiConsumer<ale<eju>, ale<eju>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ale<eju>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ejw::a);
   }

   @Override
   public MapCodec<eka> b() {
      return a;
   }
}
