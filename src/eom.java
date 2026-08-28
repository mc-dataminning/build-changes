import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eom extends epb {
   public static final MapCodec<eom> a = MapCodec.unit(() -> eom.b);
   public static final eom b = new eom();

   @Nullable
   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      je $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dhl.H);
      return $$7 && !dhj.a($$4.b().f($$0, $$6)) ? new epe.c($$6, dhl.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected epd<?> a() {
      return epd.m;
   }
}
