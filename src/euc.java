import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record euc(btm<List<etz>> c) implements etz {
   static MapCodec<euc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(btm.b(Codec.list(etz.b)).fieldOf("groups").forGetter(euc::c)).apply($$0, euc::new));

   @Override
   public void a(bai $$0, BiConsumer<alq<etx>, alq<etx>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<alq<etx>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(etz::a);
   }

   @Override
   public MapCodec<euc> b() {
      return a;
   }
}
