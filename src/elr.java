import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class elr extends elp {
   public static final MapCodec<elr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brp.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), brp.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, elr::new)
   );
   private final brp c;
   private final brp d;

   public static elr a(brp $$0, brp $$1) {
      return new elr($$0, $$1);
   }

   public static elr a(brp $$0) {
      return new elr(brm.a(0), $$0);
   }

   public static elr b(brp $$0) {
      return new elr($$0, brm.a(0));
   }

   private elr(brp $$0, brp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jh> a_(eln $$0, azu $$1, jh $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jh($$3, $$4, $$5));
   }

   @Override
   public elq<?> b() {
      return elq.n;
   }
}
