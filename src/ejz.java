import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejz(bpe<List<ejv>> c) implements ejv {
   static MapCodec<ejz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpe.b(Codec.list(ejv.b)).fieldOf("groups").forGetter(ejz::c)).apply($$0, ejz::new));

   @Override
   public void a(azh $$0, BiConsumer<ale<ejt>, ale<ejt>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ale<ejt>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ejv::a);
   }

   @Override
   public MapCodec<ejz> b() {
      return a;
   }
}
