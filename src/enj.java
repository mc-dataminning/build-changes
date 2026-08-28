import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enj extends enq {
   public static final MapCodec<enj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edo.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, enj::new)
   );
   private final edo.a c;

   private enj(edo.a $$0) {
      this.c = $$0;
   }

   public static enj a(edo.a $$0) {
      return new enj($$0);
   }

   @Override
   public Stream<ji> a_(eno $$0, azh $$1, ji $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new ji($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public enr<?> b() {
      return enr.k;
   }
}
