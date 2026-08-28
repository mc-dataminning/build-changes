import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emw extends enk {
   public static final MapCodec<emw> a = MapCodec.unit(() -> emw.b);
   public static final emw b = new emw();

   @Nullable
   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      jd $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfy.H);
      return $$7 && !dfw.a($$4.b().j($$0, $$6)) ? new enn.c($$6, dfy.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected enm<?> a() {
      return enm.m;
   }
}
