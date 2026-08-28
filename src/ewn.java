import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewn extends exc {
   public static final MapCodec<ewn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ewn::new));

   private ewn(List<eyy> $$0) {
      super($$0);
   }

   @Override
   public exe<ewn> b() {
      return exf.z;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      Float $$2 = $$1.c(eyj.j);
      if ($$2 != null) {
         azg $$3 = $$1.b();
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

   public static exc.a<?> c() {
      return a(ewn::new);
   }
}
