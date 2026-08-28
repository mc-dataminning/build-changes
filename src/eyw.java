import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyw extends eyc {
   public static final MapCodec<eyw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxl.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, eyw::new));
   private final jq<cxl> b;

   private eyw(List<ezy> $$0, jq<cxl> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eye<eyw> b() {
      return eyf.f;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      return $$0.a(this.b.a());
   }
}
