import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etv extends ete {
   public static final MapCodec<etv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awu.b(lu.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, etv::new)
   );
   private final awu<cui> b;

   private etv(List<evc> $$0, awu<cui> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public etg<etv> b() {
      return eth.G;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      cuj.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static ete.a<?> a(awu<cui> $$0) {
      return a($$1 -> new etv($$1, $$0));
   }
}
