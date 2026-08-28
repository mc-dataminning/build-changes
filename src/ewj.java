import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewj extends evp {
   public static final MapCodec<ewj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alf.a(lz.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ewj::new)
   );
   private final jq<cvx> b;

   private ewj(List<exn> $$0, jq<cvx> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evr<ewj> b() {
      return evs.f;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      return $$0.a(this.b.a());
   }
}
