import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erm extends esb {
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, erm::new));

   private erm(List<etz> $$0) {
      super($$0);
   }

   @Override
   public esd<erm> b() {
      return ese.z;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      Float $$2 = $$1.c(etk.j);
      if ($$2 != null) {
         aym $$3 = $$1.b();
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

   public static esb.a<?> c() {
      return a(erm::new);
   }
}
