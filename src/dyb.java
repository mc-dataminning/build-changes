import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyb extends dyp {
   public static final Codec<dyb> a = Codec.unit(() -> dyb.b);
   public static final dyb b = new dyb();

   @Nullable
   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      gu $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(csn.H);
      return $$7 && !csm.a($$4.b().j($$0, $$6)) ? new dys.c($$6, csn.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected dyr<?> a() {
      return dyr.m;
   }
}
