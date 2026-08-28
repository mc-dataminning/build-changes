import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esn extends etc {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esn::new));

   private esn(List<eva> $$0) {
      super($$0);
   }

   @Override
   public ete<esn> b() {
      return etf.z;
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      Float $$2 = $$1.c(eul.j);
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

   public static etc.a<?> c() {
      return a(esn::new);
   }
}
