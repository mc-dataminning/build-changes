import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ert extends esi {
   public static final MapCodec<ert> a = MapCodec.unit(() -> ert.b);
   public static final ert b = new ert();

   @Nullable
   @Override
   public esl.d a(dhc $$0, ji $$1, ji $$2, esl.d $$3, esl.d $$4, esh $$5) {
      ji $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dkg.K);
      return $$7 && !dke.a($$4.b().f($$0, $$6)) ? new esl.d($$6, dkg.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected esk<?> a() {
      return esk.m;
   }
}
