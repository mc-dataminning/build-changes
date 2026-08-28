import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eqv extends erk {
   public static final MapCodec<eqv> a = MapCodec.unit(() -> eqv.b);
   public static final eqv b = new eqv();

   @Nullable
   @Override
   public ern.d a(dgk $$0, ji $$1, ji $$2, ern.d $$3, ern.d $$4, erj $$5) {
      ji $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(djn.K);
      return $$7 && !djl.a($$4.b().f($$0, $$6)) ? new ern.d($$6, djn.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected erm<?> a() {
      return erm.m;
   }
}
