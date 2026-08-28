import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ert extends esi {
   public static final MapCodec<ert> a = MapCodec.unit(() -> ert.b);
   public static final ert b = new ert();

   @Nullable
   @Override
   public esl.d a(dhk $$0, jh $$1, jh $$2, esl.d $$3, esl.d $$4, esh $$5) {
      jh $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dkn.K);
      return $$7 && !dkl.a($$4.b().f($$0, $$6)) ? new esl.d($$6, dkn.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected esk<?> a() {
      return esk.m;
   }
}
