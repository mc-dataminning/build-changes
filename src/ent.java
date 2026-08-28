import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ent(ali<ens> c, ali<ens> d) implements enu {
   static MapCodec<ent> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a(ma.aV).fieldOf("alias").forGetter(ent::c), ali.a(ma.aV).fieldOf("target").forGetter(ent::d)).apply($$0, ent::new)
   );

   @Override
   public void a(azu $$0, BiConsumer<ali<ens>, ali<ens>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ali<ens>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ent> b() {
      return a;
   }
}
