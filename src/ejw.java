import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejw(ale<ejv> c, ale<ejv> d) implements ejx {
   static MapCodec<ejw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aM).fieldOf("alias").forGetter(ejw::c), ale.a(lq.aM).fieldOf("target").forGetter(ejw::d)).apply($$0, ejw::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<ale<ejv>, ale<ejv>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ale<ejv>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ejw> b() {
      return a;
   }
}
