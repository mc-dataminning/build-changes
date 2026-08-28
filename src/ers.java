import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ers extends esh {
   public static final MapCodec<ers> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ers::new));

   private ers(List<euf> $$0) {
      super($$0);
   }

   @Override
   public esj<ers> b() {
      return esk.z;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      Float $$2 = $$1.c(etq.j);
      if ($$2 != null) {
         ayo $$3 = $$1.b();
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

   public static esh.a<?> c() {
      return a(ers::new);
   }
}
