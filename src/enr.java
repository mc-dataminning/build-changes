import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record enr(bqp<List<enn>> c) implements enn {
   static MapCodec<enr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bqp.b(Codec.list(enn.b)).fieldOf("groups").forGetter(enr::c)).apply($$0, enr::new));

   @Override
   public void a(azv $$0, BiConsumer<alk<enl>, alk<enl>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alk<enl>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(enn::a);
   }

   @Override
   public MapCodec<enr> b() {
      return a;
   }
}
