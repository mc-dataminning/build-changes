import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esn extends erv {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axf.b(lq.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, esn::new)
   );
   private final axf<cui> b;

   private esn(List<ett> $$0, axf<cui> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erx<esn> b() {
      return ery.G;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      cuj.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static erv.a<?> a(axf<cui> $$0) {
      return a($$1 -> new esn($$1, $$0));
   }
}
