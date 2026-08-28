import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewb extends evp {
   public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vi.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ewb::new));
   private final uk b;

   private ewb(List<exn> $$0, uk $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evr<ewb> b() {
      return evs.j;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      cyk.a(ku.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static evp.a<?> a(uk $$0) {
      return a($$1 -> new ewb($$1, $$0));
   }
}
