import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elv extends emg {
   public static final Codec<elv> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, elv::new));

   private elv(List<ent> $$0) {
      super($$0);
   }

   @Override
   public emi b() {
      return emj.t;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      Float $$2 = $$1.c(enf.j);
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

   public static emg.a<?> c() {
      return a(elv::new);
   }
}
