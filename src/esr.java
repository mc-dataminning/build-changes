import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esr extends ers {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(lp.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, esr::new));
   private final ji<cwm> b;

   private esr(List<etq> $$0, ji<cwm> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eru<esr> b() {
      return erv.F;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      $$0.a(km.F, cwo.a, this.b, cwo::b);
      return $$0;
   }

   public static ers.a<?> a(ji<cwm> $$0) {
      return a($$1 -> new esr($$1, $$0));
   }
}
