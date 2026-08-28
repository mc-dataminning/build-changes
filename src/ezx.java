import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezx extends fam {
   public static final MapCodec<ezx> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ezx::new));

   private ezx(List<fci> $$0) {
      super($$0);
   }

   @Override
   public fao<ezx> b() {
      return fap.z;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      Float $$2 = $$1.c(fbt.j);
      if ($$2 != null) {
         azv $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.M();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.e($$6);
      }

      return $$0;
   }

   public static fam.a<?> c() {
      return a(ezx::new);
   }
}
