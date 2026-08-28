import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eps extends eqh {
   public static final MapCodec<eps> a = MapCodec.unit(() -> eps.b);
   public static final eps b = new eps();

   @Nullable
   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      jh $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dis.H);
      return $$7 && !diq.a($$4.b().f($$0, $$6)) ? new eqk.c($$6, dis.H.m(), $$4.c()) : $$4;
   }

   @Override
   protected eqj<?> a() {
      return eqj.m;
   }
}
