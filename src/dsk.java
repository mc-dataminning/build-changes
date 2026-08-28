import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsk extends drr {
   public static final MapCodec<dsk> b = b(dsk::new);

   @Override
   public MapCodec<dsk> a() {
      return b;
   }

   protected dsk(dvu.d $$0) {
      super(dps.b.d, $$0);
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, @Nullable bvh $$3, cwm $$4) {
      dsj.a($$0, $$1);
   }
}
