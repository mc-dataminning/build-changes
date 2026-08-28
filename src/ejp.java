import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejp(ala<ejo> c, ala<ejo> d) implements ejq {
   static MapCodec<ejp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lq.aM).fieldOf("alias").forGetter(ejp::c), ala.a(lq.aM).fieldOf("target").forGetter(ejp::d)).apply($$0, ejp::new)
   );

   @Override
   public void a(azc $$0, BiConsumer<ala<ejo>, ala<ejo>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ala<ejo>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ejp> b() {
      return a;
   }
}
