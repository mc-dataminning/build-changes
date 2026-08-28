import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eua extends etc {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cws.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eua::new));
   private final jm<cws> b;

   private eua(List<eva> $$0, jm<cws> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ete<eua> b() {
      return etf.F;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      $$0.a(kq.G, cwu.a, this.b, cwu::b);
      return $$0;
   }

   public static etc.a<?> a(jm<cws> $$0) {
      return a($$1 -> new eua($$1, $$0));
   }
}
