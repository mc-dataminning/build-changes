import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epl extends eqa {
   public static final MapCodec<epl> a = MapCodec.unit(() -> epl.b);
   public static final epl b = new epl();

   @Nullable
   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      jh $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dil.H);
      return $$7 && !dij.a($$4.b().f($$0, $$6)) ? new eqd.c($$6, dil.H.m(), $$4.c()) : $$4;
   }

   @Override
   protected eqc<?> a() {
      return eqc.m;
   }
}
