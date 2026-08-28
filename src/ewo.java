import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewo extends exd {
   public static final MapCodec<ewo> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ewo::new));

   private ewo(List<eyz> $$0) {
      super($$0);
   }

   @Override
   public exf<ewo> b() {
      return exg.z;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      Float $$2 = $$1.c(eyk.j);
      if ($$2 != null) {
         azh $$3 = $$1.b();
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

   public static exd.a<?> c() {
      return a(ewo::new);
   }
}
