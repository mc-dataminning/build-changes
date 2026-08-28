import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eus extends evh {
   public static final MapCodec<eus> a = MapCodec.unit(() -> eus.b);
   public static final eus b = new eus();

   @Nullable
   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      iv $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dmo.K);
      return $$7 && !dmm.a($$4.b().f($$0, $$6)) ? new evk.d($$6, dmo.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected evj<?> a() {
      return evj.m;
   }
}
