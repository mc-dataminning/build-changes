import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record etq(btb<List<etn>> c) implements etn {
   static MapCodec<etq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(btb.b(Codec.list(etn.b)).fieldOf("groups").forGetter(etq::c)).apply($$0, etq::new));

   @Override
   public void a(azx $$0, BiConsumer<alh<etl>, alh<etl>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alh<etl>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(etn::a);
   }

   @Override
   public MapCodec<etq> b() {
      return a;
   }
}
