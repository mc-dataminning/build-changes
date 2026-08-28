import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eoq extends epf {
   public static final MapCodec<eoq> a = MapCodec.unit(() -> eoq.b);
   public static final eoq b = new eoq();

   @Nullable
   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      jf $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dho.H);
      return $$7 && !dhm.a($$4.b().f($$0, $$6)) ? new epi.c($$6, dho.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected eph<?> a() {
      return eph.m;
   }
}
