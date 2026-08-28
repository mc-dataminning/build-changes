import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eud extends eus {
   public static final MapCodec<eud> a = MapCodec.unit(() -> eud.b);
   public static final eud b = new eud();

   @Nullable
   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      iu $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dmc.K);
      return $$7 && !dma.a($$4.b().f($$0, $$6)) ? new euv.d($$6, dmc.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected euu<?> a() {
      return euu.m;
   }
}
