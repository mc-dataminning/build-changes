import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ens extends enq {
   public static final MapCodec<ens> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsn.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bsn.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, ens::new)
   );
   private final bsn c;
   private final bsn d;

   public static ens a(bsn $$0, bsn $$1) {
      return new ens($$0, $$1);
   }

   public static ens a(bsn $$0) {
      return new ens(bsk.a(0), $$0);
   }

   public static ens b(bsn $$0) {
      return new ens($$0, bsk.a(0));
   }

   private ens(bsn $$0, bsn $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jh> a_(eno $$0, bam $$1, jh $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jh($$3, $$4, $$5));
   }

   @Override
   public enr<?> b() {
      return enr.n;
   }
}
