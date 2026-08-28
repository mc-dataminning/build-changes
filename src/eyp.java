import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyp extends exv {
   public static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxc.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, eyp::new));
   private final jq<cxc> b;

   private eyp(List<ezr> $$0, jq<cxc> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exx<eyp> b() {
      return exy.f;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      return $$0.a(this.b.a());
   }
}
