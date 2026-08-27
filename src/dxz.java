import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dxz extends dyn {
   public static final Codec<dxz> a = Codec.unit(() -> dxz.b);
   public static final dxz b = new dxz();

   @Nullable
   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      gv $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(csl.H);
      return $$7 && !csk.a($$4.b().j($$0, $$6)) ? new dyq.c($$6, csl.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected dyp<?> a() {
      return dyp.m;
   }
}
