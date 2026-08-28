import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class euj extends euy {
   public static final MapCodec<euj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, euj::new));

   private euj(List<eww> $$0) {
      super($$0);
   }

   @Override
   public eva<euj> b() {
      return evb.z;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      Float $$2 = $$1.c(ewh.j);
      if ($$2 != null) {
         azn $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.K();
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

   public static euy.a<?> c() {
      return a(euj::new);
   }
}
