import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ern extends esc {
   public static final MapCodec<ern> a = MapCodec.unit(() -> ern.b);
   public static final ern b = new ern();

   @Nullable
   @Override
   public esf.d a(dhc $$0, jh $$1, jh $$2, esf.d $$3, esf.d $$4, esb $$5) {
      jh $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dkf.K);
      return $$7 && !dkd.a($$4.b().f($$0, $$6)) ? new esf.d($$6, dkf.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected ese<?> a() {
      return ese.m;
   }
}
