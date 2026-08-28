import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emz extends eno {
   public static final MapCodec<emz> a = MapCodec.unit(() -> emz.b);
   public static final emz b = new emz();

   @Nullable
   @Override
   public enr.c a(dcz $$0, jd $$1, jd $$2, enr.c $$3, enr.c $$4, enn $$5) {
      jd $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dga.H);
      return $$7 && !dfy.a($$4.b().j($$0, $$6)) ? new enr.c($$6, dga.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected enq<?> a() {
      return enq.m;
   }
}
