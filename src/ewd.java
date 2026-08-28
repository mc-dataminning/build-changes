import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewd extends evj {
   public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ale.a(ly.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ewd::new)
   );
   private final jp<cvt> b;

   private ewd(List<exh> $$0, jp<cvt> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evl<ewd> b() {
      return evm.f;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      return $$0.a(this.b.a());
   }
}
