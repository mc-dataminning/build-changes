import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqn extends equ {
   public static final MapCodec<eqn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egs.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, eqn::new)
   );
   private final egs.a c;

   private eqn(egs.a $$0) {
      this.c = $$0;
   }

   public static eqn a(egs.a $$0) {
      return new eqn($$0);
   }

   @Override
   public Stream<iv> a_(eqs $$0, azv $$1, iv $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new iv($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public eqv<?> b() {
      return eqv.k;
   }
}
