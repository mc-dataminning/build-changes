import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eav extends ebj {
   public static final Codec<eav> a = Codec.unit(() -> eav.b);
   public static final eav b = new eav();

   @Nullable
   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      hx $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cvh.H);
      return $$7 && !cvf.a($$4.b().j($$0, $$6)) ? new ebm.c($$6, cvh.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected ebl<?> a() {
      return ebl.m;
   }
}
