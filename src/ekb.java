import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ekb(bpg<List<ejx>> c) implements ejx {
   static MapCodec<ekb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpg.b(Codec.list(ejx.b)).fieldOf("groups").forGetter(ekb::c)).apply($$0, ekb::new));

   @Override
   public void a(azh $$0, BiConsumer<ale<ejv>, ale<ejv>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ale<ejv>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ejx::a);
   }

   @Override
   public MapCodec<ekb> b() {
      return a;
   }
}
