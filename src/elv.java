import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elv extends emj {
   public static final MapCodec<elv> a = MapCodec.unit(() -> elv.b);
   public static final elv b = new elv();

   @Nullable
   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      iz $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfd.H);
      return $$7 && !dfb.a($$4.b().j($$0, $$6)) ? new emm.c($$6, dfd.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected eml<?> a() {
      return eml.m;
   }
}
