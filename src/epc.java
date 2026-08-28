import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epc(bqr<List<eoy>> c) implements eoy {
   static MapCodec<epc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bqr.b(Codec.list(eoy.b)).fieldOf("groups").forGetter(epc::c)).apply($$0, epc::new));

   @Override
   public void a(azh $$0, BiConsumer<akt<eow>, akt<eow>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<akt<eow>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(eoy::a);
   }

   @Override
   public MapCodec<epc> b() {
      return a;
   }
}
