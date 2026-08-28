import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esp extends ete {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esp::new));

   private esp(List<evc> $$0) {
      super($$0);
   }

   @Override
   public etg<esp> b() {
      return eth.z;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      Float $$2 = $$1.c(eun.j);
      if ($$2 != null) {
         ayw $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.H();
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

   public static ete.a<?> c() {
      return a(esp::new);
   }
}
