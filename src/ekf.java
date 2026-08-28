import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ekf(bon<List<ekb>> c) implements ekb {
   static MapCodec<ekf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bon.b(Codec.list(ekb.b)).fieldOf("groups").forGetter(ekf::c)).apply($$0, ekf::new));

   @Override
   public void a(aym $$0, BiConsumer<akj<ejz>, akj<ejz>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akj<ejz>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ekb::a);
   }

   @Override
   public MapCodec<ekf> b() {
      return a;
   }
}
