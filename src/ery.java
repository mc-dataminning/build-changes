import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ery(bsj<List<eru>> c) implements eru {
   static MapCodec<ery> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bsj.b(Codec.list(eru.b)).fieldOf("groups").forGetter(ery::c)).apply($$0, ery::new));

   @Override
   public void a(azt $$0, BiConsumer<ald<ers>, ald<ers>> $$1) {
      this.c.a($$0).ifPresent($$2 -> $$2.forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ald<ers>> a() {
      return this.c.d().stream().flatMap($$0 -> $$0.a().stream()).flatMap(eru::a);
   }

   @Override
   public MapCodec<ery> b() {
      return a;
   }
}
