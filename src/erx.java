import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record erx(ald<ers> c, bsj<ald<ers>> d) implements eru {
   static MapCodec<erx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(mg.bd).fieldOf("alias").forGetter(erx::c), bsj.b(ald.a(mg.bd)).fieldOf("targets").forGetter(erx::d)).apply($$0, erx::new)
   );

   @Override
   public void a(azt $$0, BiConsumer<ald<ers>, ald<ers>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<ald<ers>> a() {
      return this.d.d().stream().map(bsi::a);
   }

   @Override
   public MapCodec<erx> b() {
      return a;
   }
}
