import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record esi(alf<esd> c, bsm<alf<esd>> d) implements esf {
   static MapCodec<esi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.be).fieldOf("alias").forGetter(esi::c), bsm.b(alf.a(mg.be)).fieldOf("targets").forGetter(esi::d)).apply($$0, esi::new)
   );

   @Override
   public void a(azv $$0, BiConsumer<alf<esd>, alf<esd>> $$1) {
      this.d.a($$0).ifPresent($$1x -> $$1.accept(this.c, $$1x));
   }

   @Override
   public Stream<alf<esd>> a() {
      return this.d.d().stream().map(bsl::a);
   }

   @Override
   public MapCodec<esi> b() {
      return a;
   }
}
