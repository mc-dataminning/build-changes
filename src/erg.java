import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erg extends eru {
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, erg::new));

   private erg(List<ets> $$0) {
      super($$0);
   }

   @Override
   public erw<erg> b() {
      return erx.z;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      Float $$2 = $$1.c(ete.j);
      if ($$2 != null) {
         azh $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.I();
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

   public static eru.a<?> c() {
      return a(erg::new);
   }
}
