import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emh extends emv {
   public static final MapCodec<emh> a = MapCodec.unit(() -> emh.b);
   public static final emh b = new emh();

   @Nullable
   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      ja $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfk.H);
      return $$7 && !dfi.a($$4.b().j($$0, $$6)) ? new emy.c($$6, dfk.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected emx<?> a() {
      return emx.m;
   }
}
