import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyf extends dyt {
   public static final Codec<dyf> a = Codec.unit(() -> dyf.b);
   public static final dyf b = new dyf();

   @Nullable
   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      gw $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(csr.H);
      return $$7 && !csq.a($$4.b().j($$0, $$6)) ? new dyw.c($$6, csr.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected dyv<?> a() {
      return dyv.m;
   }
}
