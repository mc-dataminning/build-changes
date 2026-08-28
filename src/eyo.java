import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyo extends exu {
   public static final MapCodec<eyo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alw.a(mb.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, eyo::new)
   );
   private final jq<cxg> b;

   private eyo(List<ezs> $$0, jq<cxg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exw<eyo> b() {
      return exx.f;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      return $$0.a(this.b.a());
   }
}
