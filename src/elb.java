import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class elb extends eli {
   public static final MapCodec<elb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebj.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, elb::new)
   );
   private final ebj.a c;

   private elb(ebj.a $$0) {
      this.c = $$0;
   }

   public static elb a(ebj.a $$0) {
      return new elb($$0);
   }

   @Override
   public Stream<jh> a_(elg $$0, azv $$1, jh $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new jh($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public elj<?> b() {
      return elj.k;
   }
}
