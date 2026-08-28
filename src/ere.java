import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ere extends ers {
   public static final MapCodec<ere> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ere::new));

   private ere(List<etq> $$0) {
      super($$0);
   }

   @Override
   public eru<ere> b() {
      return erv.z;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      Float $$2 = $$1.c(etc.j);
      if ($$2 != null) {
         azf $$3 = $$1.b();
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

   public static ers.a<?> c() {
      return a(ere::new);
   }
}
