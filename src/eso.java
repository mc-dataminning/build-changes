import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eso extends ert {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alb.a(lq.G).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, eso::new)
   );
   private final ji<cuj> b;

   private eso(List<etr> $$0, ji<cuj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erv<eso> b() {
      return erw.f;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      return $$0.a(this.b.a(), $$0.I());
   }
}
