import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record epc(aku<eox> c, bqt<aku<eox>> d) implements eoz {
   static MapCodec<epc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aX).fieldOf("alias").forGetter(epc::c), bqt.b(aku.a(mc.aX)).fieldOf("targets").forGetter(epc::d)).apply($$0, epc::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<aku<eox>, aku<eox>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (aku<eox>)$$1x.b()));
   }

   @Override
   public Stream<aku<eox>> a() {
      return this.d.e().stream().map(bqv.b::b);
   }

   @Override
   public MapCodec<epc> b() {
      return a;
   }
}
