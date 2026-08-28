import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fam extends fbb {
   public static final MapCodec<fam> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fam::new));

   private fam(List<fcx> $$0) {
      super($$0);
   }

   @Override
   public fbd<fam> b() {
      return fbe.z;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      Float $$2 = $$1.c(fci.j);
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

   public static fbb.a<?> c() {
      return a(fam::new);
   }
}
