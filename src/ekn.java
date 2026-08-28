import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ekn(bor<List<ekj>> c) implements ekj {
   static MapCodec<ekn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bor.b(Codec.list(ekj.b)).fieldOf("groups").forGetter(ekn::c)).apply($$0, ekn::new));

   @Override
   public void a(ayo $$0, BiConsumer<akj<ekh>, akj<ekh>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akj<ekh>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ekj::a);
   }

   @Override
   public MapCodec<ekn> b() {
      return a;
   }
}
