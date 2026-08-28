import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ett extends etc {
   public static final MapCodec<ett> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awu.b(lu.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ett::new)
   );
   private final awu<cui> b;

   private ett(List<eva> $$0, awu<cui> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ete<ett> b() {
      return etf.G;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      cuj.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static etc.a<?> a(awu<cui> $$0) {
      return a($$1 -> new ett($$1, $$0));
   }
}
