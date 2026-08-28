import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record esj(bsm<List<esf>> c) implements esf {
   static MapCodec<esj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bsm.b(Codec.list(esf.b)).fieldOf("groups").forGetter(esj::c)).apply($$0, esj::new));

   @Override
   public void a(azv $$0, BiConsumer<alf<esd>, alf<esd>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alf<esd>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(esf::a);
   }

   @Override
   public MapCodec<esj> b() {
      return a;
   }
}
