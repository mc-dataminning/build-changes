import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elx extends emi {
   public static final Codec<elx> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, elx::new));

   private elx(List<env> $$0) {
      super($$0);
   }

   @Override
   public emk b() {
      return eml.t;
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      Float $$2 = $$1.c(enh.j);
      if ($$2 != null) {
         axd $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.M();
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

   public static emi.a<?> c() {
      return a(elx::new);
   }
}
