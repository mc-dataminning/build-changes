import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class erm extends esb {
   public static final MapCodec<erm> a = MapCodec.unit(() -> erm.b);
   public static final erm b = new erm();

   @Nullable
   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      jh $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dkg.K);
      return $$7 && !dke.a($$4.b().f($$0, $$6)) ? new ese.d($$6, dkg.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected esd<?> a() {
      return esd.m;
   }
}
