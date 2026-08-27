import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqf extends eqs {
   public static final MapCodec<eqf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eqf::new));

   private eqf(List<esn> $$0) {
      super($$0);
   }

   @Override
   public equ b() {
      return eqv.w;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      Float $$2 = $$1.c(erz.j);
      if ($$2 != null) {
         aym $$3 = $$1.b();
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

   public static eqs.a<?> c() {
      return a(eqf::new);
   }
}
