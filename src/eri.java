import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eri extends eqs {
   public static final MapCodec<eri> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awm.b(lf.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eri::new)
   );
   private final awm<cti> b;

   private eri(List<esn> $$0, awm<cti> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public equ b() {
      return eqv.D;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      ctj.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eqs.a<?> a(awm<cti> $$0) {
      return a($$1 -> new eri($$1, $$0));
   }
}
