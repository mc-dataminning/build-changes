import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eks extends elg {
   public static final MapCodec<eks> a = MapCodec.unit(() -> eks.b);
   public static final eks b = new eks();

   @Nullable
   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      io $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dea.H);
      return $$7 && !ddy.a($$4.b().j($$0, $$6)) ? new elj.c($$6, dea.H.n(), $$4.c()) : $$4;
   }

   @Override
   protected eli<?> a() {
      return eli.m;
   }
}
