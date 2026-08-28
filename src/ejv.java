import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

record ejv(ale<eju> c, ale<eju> d) implements ejw {
   static MapCodec<ejv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aM).fieldOf("alias").forGetter(ejv::c), ale.a(lq.aM).fieldOf("target").forGetter(ejv::d)).apply($$0, ejv::new)
   );

   @Override
   public void a(azh $$0, BiConsumer<ale<eju>, ale<eju>> $$1) {
      $$1.accept(this.c, this.d);
   }

   @Override
   public Stream<ale<eju>> a() {
      return Stream.of(this.d);
   }

   @Override
   public MapCodec<ejv> b() {
      return a;
   }
}
