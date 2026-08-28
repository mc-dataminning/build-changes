import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class far extends fbg {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, far::new));

   private far(List<fdc> $$0) {
      super($$0);
   }

   @Override
   public fbi<far> b() {
      return fbj.z;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      Float $$2 = $$1.c(fcn.j);
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

   public static fbg.a<?> c() {
      return a(far::new);
   }
}
