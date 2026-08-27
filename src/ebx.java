import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ebx extends ecl {
   public static final Codec<ebx> a = Codec.unit(() -> ebx.b);
   public static final ebx b = new ebx();

   @Nullable
   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      hv $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cwb.H);
      return $$7 && !cvz.a($$4.b().j($$0, $$6)) ? new eco.c($$6, cwb.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected ecn<?> a() {
      return ecn.m;
   }
}
