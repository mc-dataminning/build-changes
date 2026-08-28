import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewn extends evp {
   public static final MapCodec<ewn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxy.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ewn::new));
   private final jq<cxy> b;

   private ewn(List<exn> $$0, jq<cxy> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evr<ewn> b() {
      return evs.F;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      $$0.a(ku.Q, cya.a, this.b, cya::b);
      return $$0;
   }

   public static evp.a<?> a(jq<cxy> $$0) {
      return a($$1 -> new ewn($$1, $$0));
   }
}
