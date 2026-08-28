import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esn extends ers {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alb.a(lq.G).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, esn::new)
   );
   private final ji<cui> b;

   private esn(List<etq> $$0, ji<cui> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eru<esn> b() {
      return erv.f;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      return $$0.a(this.b.a(), $$0.I());
   }
}
