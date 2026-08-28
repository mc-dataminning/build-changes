import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elr extends emf {
   public static final MapCodec<elr> a = MapCodec.unit(() -> elr.b);
   public static final elr b = new elr();

   @Nullable
   @Override
   public emi.c a(dbz $$0, iz $$1, iz $$2, emi.c $$3, emi.c $$4, eme $$5) {
      iz $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dez.H);
      return $$7 && !dex.a($$4.b().j($$0, $$6)) ? new emi.c($$6, dez.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected emh<?> a() {
      return emh.m;
   }
}
