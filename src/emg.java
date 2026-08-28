import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class emg extends elw {
   public static final MapCodec<emg> b = bsb.b(dym.a).comapFlatMap(emg::a, $$0 -> $$0.c).fieldOf("entries");
   private final bsb<dym> c;

   private static DataResult<emg> a(bsb<dym> $$0) {
      return $$0.c() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new emg($$0));
   }

   public emg(bsb<dym> $$0) {
      this.c = $$0;
   }

   public emg(bsb.a<dym> $$0) {
      this($$0.a());
   }

   @Override
   protected elx<?> a() {
      return elx.b;
   }

   @Override
   public dym a(azs $$0, jj $$1) {
      return this.c.b($$0);
   }
}
