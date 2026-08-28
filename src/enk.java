import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enk extends enr {
   public static final MapCodec<enk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edq.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, enk::new)
   );
   private final edq.a c;

   private enk(edq.a $$0) {
      this.c = $$0;
   }

   public static enk a(edq.a $$0) {
      return new enk($$0);
   }

   @Override
   public Stream<jh> a_(enp $$0, bam $$1, jh $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jh($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public ens<?> b() {
      return ens.k;
   }
}
