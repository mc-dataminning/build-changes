import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ess extends ert {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(lp.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ess::new));
   private final ji<cwn> b;

   private ess(List<etr> $$0, ji<cwn> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erv<ess> b() {
      return erw.F;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      $$0.a(km.G, cwp.a, this.b, cwp::b);
      return $$0;
   }

   public static ert.a<?> a(ji<cwn> $$0) {
      return a($$1 -> new ess($$1, $$0));
   }
}
