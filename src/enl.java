import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class enl extends enr {
   private static final enl c = new enl();
   public static final MapCodec<enl> a = MapCodec.unit(() -> c);

   public static enl a() {
      return c;
   }

   @Override
   public Stream<jh> a_(enp $$0, bam $$1, jh $$2) {
      int $$3 = $$1.a(16) + $$2.u();
      int $$4 = $$1.a(16) + $$2.w();
      return Stream.of(new jh($$3, $$2.v(), $$4));
   }

   @Override
   public ens<?> b() {
      return ens.m;
   }
}
