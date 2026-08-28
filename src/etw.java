import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etw extends etc {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ako.a(lu.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, etw::new)
   );
   private final jm<cul> b;

   private etw(List<eva> $$0, jm<cul> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ete<etw> b() {
      return etf.f;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      return $$0.a(this.b.a());
   }
}
