import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enj extends enq {
   public static final MapCodec<enj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edp.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, enj::new)
   );
   private final edp.a c;

   private enj(edp.a $$0) {
      this.c = $$0;
   }

   public static enj a(edp.a $$0) {
      return new enj($$0);
   }

   @Override
   public Stream<jh> a_(eno $$0, bam $$1, jh $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jh($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public enr<?> b() {
      return enr.k;
   }
}
