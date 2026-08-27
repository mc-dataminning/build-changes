import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dym extends dza {
   public static final Codec<dym> a = Codec.unit(() -> dym.b);
   public static final dym b = new dym();

   @Nullable
   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      gw $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(csy.H);
      return $$7 && !csx.a($$4.b().j($$0, $$6)) ? new dzd.c($$6, csy.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected dzc<?> a() {
      return dzc.m;
   }
}
