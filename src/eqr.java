import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqr extends eqp {
   public static final MapCodec<eqr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btl.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), btl.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eqr::new)
   );
   private final btl c;
   private final btl d;

   public static eqr a(btl $$0, btl $$1) {
      return new eqr($$0, $$1);
   }

   public static eqr a(btl $$0) {
      return new eqr(bti.a(0), $$0);
   }

   public static eqr b(btl $$0) {
      return new eqr($$0, bti.a(0));
   }

   private eqr(btl $$0, btl $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iv($$3, $$4, $$5));
   }

   @Override
   public eqq<?> b() {
      return eqq.n;
   }
}
