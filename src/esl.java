import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esl extends ert {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axe.b(lq.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, esl::new)
   );
   private final axe<cug> b;

   private esl(List<etr> $$0, axe<cug> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erv<esl> b() {
      return erw.G;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      cuh.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static ert.a<?> a(axe<cug> $$0) {
      return a($$1 -> new esl($$1, $$0));
   }
}
