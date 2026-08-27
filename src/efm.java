import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efm extends efx {
   public static final Codec<efm> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, efm::new));

   private efm(List<ehk> $$0) {
      super($$0);
   }

   @Override
   public efz b() {
      return ega.t;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      Float $$2 = $$1.c(egw.j);
      if ($$2 != null) {
         ato $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.L();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.f($$6);
      }

      return $$0;
   }

   public static efx.a<?> c() {
      return a(efm::new);
   }
}
