import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ets extends euh {
   public static final MapCodec<ets> a = MapCodec.unit(() -> ets.b);
   public static final ets b = new ets();

   @Nullable
   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      iu $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dlw.K);
      return $$7 && !dlu.a($$4.b().f($$0, $$6)) ? new euk.d($$6, dlw.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected euj<?> a() {
      return euj.m;
   }
}
