import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etl extends etc {
   public static final MapCodec<etl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kn.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, etl::new)
   );
   private final kn b;

   private etl(List<eva> $$0, kn $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ete<etl> b() {
      return etf.k;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> etc.a<?> a(kp<T> $$0, T $$1) {
      return a($$2 -> new etl($$2, kn.a().a($$0, $$1).a()));
   }
}
