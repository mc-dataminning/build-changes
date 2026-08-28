import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqw extends equ {
   public static final MapCodec<eqw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btl.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), btl.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eqw::new)
   );
   private final btl c;
   private final btl d;

   public static eqw a(btl $$0, btl $$1) {
      return new eqw($$0, $$1);
   }

   public static eqw a(btl $$0) {
      return new eqw(bti.a(0), $$0);
   }

   public static eqw b(btl $$0) {
      return new eqw($$0, bti.a(0));
   }

   private eqw(btl $$0, btl $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iv> a_(eqs $$0, azv $$1, iv $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iv($$3, $$4, $$5));
   }

   @Override
   public eqv<?> b() {
      return eqv.n;
   }
}
