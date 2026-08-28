import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eza extends eyc {
   public static final MapCodec<eza> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czm.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eza::new));
   private final jq<czm> b;

   private eza(List<ezy> $$0, jq<czm> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eye<eza> b() {
      return eyf.F;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      $$0.a(ku.Q, czo.a, this.b, czo::b);
      return $$0;
   }

   public static eyc.a<?> a(jq<czm> $$0) {
      return a($$1 -> new eza($$1, $$0));
   }
}
