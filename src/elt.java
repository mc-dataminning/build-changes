import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elt extends emh {
   public static final MapCodec<elt> a = MapCodec.unit(() -> elt.b);
   public static final elt b = new elt();

   @Nullable
   @Override
   public emk.c a(dcb $$0, iz $$1, iz $$2, emk.c $$3, emk.c $$4, emg $$5) {
      iz $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfb.H);
      return $$7 && !dez.a($$4.b().j($$0, $$6)) ? new emk.c($$6, dfb.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected emj<?> a() {
      return emj.m;
   }
}
