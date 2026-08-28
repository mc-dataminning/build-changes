import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eul extends eva {
   public static final MapCodec<eul> a = MapCodec.unit(() -> eul.b);
   public static final eul b = new eul();

   @Nullable
   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      iu $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dmh.K);
      return $$7 && !dmf.a($$4.b().f($$0, $$6)) ? new evd.d($$6, dmh.K.m(), $$4.c()) : $$4;
   }

   @Override
   protected evc<?> a() {
      return evc.m;
   }
}
