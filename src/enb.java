import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class enb extends enq {
   public static final MapCodec<enb> a = MapCodec.unit(() -> enb.b);
   public static final enb b = new enb();

   @Nullable
   @Override
   public ent.c a(dcz $$0, jd $$1, jd $$2, ent.c $$3, ent.c $$4, enp $$5) {
      jd $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dga.H);
      return $$7 && !dfy.a($$4.b().j($$0, $$6)) ? new ent.c($$6, dga.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected ens<?> a() {
      return ens.m;
   }
}
