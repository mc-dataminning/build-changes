import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class egl extends egz {
   public static final Codec<egl> a = Codec.unit(() -> egl.b);
   public static final egl b = new egl();

   @Nullable
   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      ib $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dac.H);
      return $$7 && !daa.a($$4.b().j($$0, $$6)) ? new ehc.c($$6, dac.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected ehb<?> a() {
      return ehb.m;
   }
}
