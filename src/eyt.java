import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyt extends exv {
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czd.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eyt::new));
   private final jq<czd> b;

   private eyt(List<ezr> $$0, jq<czd> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exx<eyt> b() {
      return exy.F;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      $$0.a(ku.Q, czf.a, this.b, czf::b);
      return $$0;
   }

   public static exv.a<?> a(jq<czd> $$0) {
      return a($$1 -> new eyt($$1, $$0));
   }
}
