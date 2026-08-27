import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqd extends eqq {
   public static final MapCodec<eqd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eqd::new));

   private eqd(List<esl> $$0) {
      super($$0);
   }

   @Override
   public eqs b() {
      return eqt.w;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      Float $$2 = $$1.c(erx.j);
      if ($$2 != null) {
         ayk $$3 = $$1.b();
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

   public static eqq.a<?> c() {
      return a(eqd::new);
   }
}
