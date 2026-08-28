import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epz(brj<List<epv>> c) implements epv {
   static MapCodec<epz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(brj.b(Codec.list(epv.b)).fieldOf("groups").forGetter(epz::c)).apply($$0, epz::new));

   @Override
   public void a(azh $$0, BiConsumer<akt<ept>, akt<ept>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akt<ept>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(epv::a);
   }

   @Override
   public MapCodec<epz> b() {
      return a;
   }
}
