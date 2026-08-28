import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evx extends ewm {
   public static final MapCodec<evx> a = MapCodec.unit(() -> evx.b);
   public static final evx b = new evx();

   @Nullable
   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      iw $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dnq.K);
      return $$7 && !dno.a($$4.b().f($$0, $$6)) ? new ewp.d($$6, dnq.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected ewo<?> a() {
      return ewo.m;
   }
}
