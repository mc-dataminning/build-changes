import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ept(bri<List<epp>> c) implements epp {
   static MapCodec<ept> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bri.b(Codec.list(epp.b)).fieldOf("groups").forGetter(ept::c)).apply($$0, ept::new));

   @Override
   public void a(bac $$0, BiConsumer<alo<epn>, alo<epn>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alo<epn>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(epp::a);
   }

   @Override
   public MapCodec<ept> b() {
      return a;
   }
}
