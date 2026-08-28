import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elz extends emn {
   public static final MapCodec<elz> a = MapCodec.unit(() -> elz.b);
   public static final elz b = new elz();

   @Nullable
   @Override
   public emq.c a(dcg $$0, ja $$1, ja $$2, emq.c $$3, emq.c $$4, emm $$5) {
      ja $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfh.H);
      return $$7 && !dff.a($$4.b().j($$0, $$6)) ? new emq.c($$6, dfh.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected emp<?> a() {
      return emp.m;
   }
}
