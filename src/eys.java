import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eys extends exu {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czh.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eys::new));
   private final jq<czh> b;

   private eys(List<ezs> $$0, jq<czh> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exw<eys> b() {
      return exx.F;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      $$0.a(ku.Q, czj.a, this.b, czj::b);
      return $$0;
   }

   public static exu.a<?> a(jq<czh> $$0) {
      return a($$1 -> new eys($$1, $$0));
   }
}
