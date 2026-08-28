import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record emr(alb<emm> c, bpz<alb<emm>> d) implements emo {
   static MapCodec<emr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a(lv.aV).fieldOf("alias").forGetter(emr::c), bpz.b(alb.a(lv.aV)).fieldOf("targets").forGetter(emr::d)).apply($$0, emr::new)
   );

   @Override
   public void a(azl $$0, BiConsumer<alb<emm>, alb<emm>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (alb<emm>)$$1x.b()));
   }

   @Override
   public Stream<alb<emm>> a() {
      return this.d.e().stream().map(bqb.b::b);
   }

   @Override
   public MapCodec<emr> b() {
      return a;
   }
}
