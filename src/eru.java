import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eru extends esj {
   public static final MapCodec<eru> a = MapCodec.unit(() -> eru.b);
   public static final eru b = new eru();

   @Nullable
   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      jh $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dko.K);
      return $$7 && !dkm.a($$4.b().f($$0, $$6)) ? new esm.d($$6, dko.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected esl<?> a() {
      return esl.m;
   }
}
