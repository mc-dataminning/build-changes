import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record eiz(akm<eiu> c, bog<akm<eiu>> d) implements eiw {
   static MapCodec<eiz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akm.a(lf.aM).fieldOf("alias").forGetter(eiz::c), bog.b(akm.a(lf.aM)).fieldOf("targets").forGetter(eiz::d)).apply($$0, eiz::new)
   );

   @Override
   public void a(aym $$0, BiConsumer<akm<eiu>, akm<eiu>> $$1) {
      this.d.b($$0).ifPresent($$1x -> $$1.accept(this.c, (akm<eiu>)$$1x.b()));
   }

   @Override
   public Stream<akm<eiu>> a() {
      return this.d.e().stream().map(boi.b::b);
   }

   @Override
   public MapCodec<eiz> b() {
      return a;
   }
}
