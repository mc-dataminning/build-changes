import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqi extends eqp {
   public static final MapCodec<eqi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egn.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eqi::new)
   );
   private final egn.a c;

   private eqi(egn.a $$0) {
      this.c = $$0;
   }

   public static eqi a(egn.a $$0) {
      return new eqi($$0);
   }

   @Override
   public Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iv($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eqq<?> b() {
      return eqq.k;
   }
}
