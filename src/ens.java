import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ens extends enq {
   public static final MapCodec<ens> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsd.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bsd.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ens::new)
   );
   private final bsd c;
   private final bsd d;

   public static ens a(bsd $$0, bsd $$1) {
      return new ens($$0, $$1);
   }

   public static ens a(bsd $$0) {
      return new ens(bsa.a(0), $$0);
   }

   public static ens b(bsd $$0) {
      return new ens($$0, bsa.a(0));
   }

   private ens(bsd $$0, bsd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ji> a_(eno $$0, azh $$1, ji $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ji($$3, $$4, $$5));
   }

   @Override
   public enr<?> b() {
      return enr.n;
   }
}
