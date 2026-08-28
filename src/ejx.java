import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejx(bpc<List<ejt>> c) implements ejt {
   static MapCodec<ejx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bpc.b(Codec.list(ejt.b)).fieldOf("groups").forGetter(ejx::c)).apply($$0, ejx::new));

   @Override
   public void a(azf $$0, BiConsumer<ald<ejr>, ald<ejr>> $$1) {
      this.c.b($$0).ifPresent($$2 -> $$2.b().forEach($$2x -> $$2x.a($$0, $$1)));
   }

   @Override
   public Stream<ald<ejr>> a() {
      return this.c.e().stream().flatMap($$0 -> $$0.b().stream()).flatMap(ejt::a);
   }

   @Override
   public MapCodec<ejx> b() {
      return a;
   }
}
