import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eru extends esj {
   public static final MapCodec<eru> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eru::new));

   private eru(List<euh> $$0) {
      super($$0);
   }

   @Override
   public esl<eru> b() {
      return esm.z;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      Float $$2 = $$1.c(ets.j);
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

   public static esj.a<?> c() {
      return a(eru::new);
   }
}
